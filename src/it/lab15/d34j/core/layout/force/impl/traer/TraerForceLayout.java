package it.lab15.d34j.core.layout.force.impl.traer;

import it.lab15.d34j.common.Size;
import it.lab15.d34j.core.Link;
import it.lab15.d34j.core.functions.ChargeFunction;
import it.lab15.d34j.core.functions.TickFunction;
import it.lab15.d34j.core.layout.force.FLAttraction;
import it.lab15.d34j.core.layout.force.FLLink;
import it.lab15.d34j.core.layout.force.FLNode;
import it.lab15.d34j.core.layout.force.ForceLayout;
import it.lab15.d34j.core.layout.force.impl.BaseFLLink;
import it.lab15.d34j.core.layout.force.impl.BaseFLNode;

import java.util.HashMap;
import java.util.Map;

import traer.physics.Attraction;
import traer.physics.Particle;
import traer.physics.ParticleSystem;
import traer.physics.Spring;

public class TraerForceLayout implements ForceLayout {

	private ParticleSystem physics;
	private float gravity;
	private boolean started;
	
	private Map<FLNode, FLNodeParticleWrapper> particleWrapped = new HashMap<FLNode, FLNodeParticleWrapper>();
	private Map<FLLink, FLLinkSpringWrapper> springWrapped = new HashMap<FLLink, FLLinkSpringWrapper>();
	private Map<FLAttraction, FLAttractionWrapper> attractionWrapped = new HashMap<FLAttraction, FLAttractionWrapper>();
	
	public TraerForceLayout(){
		init();
	}
	
	private void init(){
		this.physics = new ParticleSystem();
	}
	
	@Override
	public void addNodes(FLNode[] nodes) {
		for (FLNode node:nodes){
			Particle newParticle = physics.makeParticle(node.getMass(), node.getX(), node.getY(),node.getZ());
			addWrappedParticle(node, newParticle);
		}
	}

	private void addWrappedParticle(FLNode node, Particle newParticle) {
		particleWrapped.put(node,  new FLNodeParticleWrapper(node, newParticle));
	}

	private void addWrappedLink(FLLink link, Spring newSpring) {
		springWrapped.put(link,  new FLLinkSpringWrapper(link, newSpring));
	}

	@Override
	public FLNode[] getNodes() {
		return particleWrapped.keySet().toArray(new BaseFLNode[0]);
	}

	@Override
	public void addLinks(FLLink[] links) {
		for (FLLink link:links){
			Spring spring = this.physics.makeSpring(getParticoleForNode(link.getNodeA()),
					getParticoleForNode(link.getNodeB()), link.getStrength(), link.getDamping(), link.getRestLength());
			addWrappedLink(link, spring);
		}
	}

	@Override
	public void addAttractions(FLAttraction[] attractions) {
		for (FLAttraction attraction:attractions){
			Attraction traerAttr = this.physics.makeAttraction(getParticoleForNode(attraction.getNodeA()),
					getParticoleForNode(attraction.getNodeB()), attraction.getStrength(), attraction.getMinimumDistance());
			addWrappedAttraction(attraction, traerAttr);
		}
	}

	private void addWrappedAttraction(FLAttraction attraction, Attraction traerAttraction) {
		attractionWrapped.put(attraction, new FLAttractionWrapper(attraction, traerAttraction));
	}

	private Particle getParticoleForNode(FLNode node) {
		return particleWrapped.get(node).particle;
	}

	@Override
	public void start() {
		this.started = true;
	}

	@Override
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGravity(float gravity) {
		this.physics.setGravity(gravity);
		this.gravity = gravity;
	}

	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getGravity() {
		return this.gravity;
	}

	@Override
	public void setCharge(int charge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setChargeFunction(ChargeFunction function) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ChargeFunction getChargeFunction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onTick(TickFunction tickFunction) {
		// TODO Auto-generated method stub		
	}

	private class FLNodeParticleWrapper {
		public FLNodeParticleWrapper(FLNode node, Particle particle) {
			super();
			this.node = node;
			this.particle = particle;
		}
		public FLNode node;
		public Particle particle;
	}

	private class FLLinkSpringWrapper {
		public FLLinkSpringWrapper(FLLink link, Spring spring) {
			super();
			this.link = link;
			this.spring = spring;
		}
		public FLLink link;
		public Spring spring;
	}

	private class FLAttractionWrapper {
		public FLAttractionWrapper(FLAttraction attraction, Attraction traerAttraction) {
			super();
			this.attraction = attraction;
			this.traerAttraction = traerAttraction;
		}
		public FLAttraction attraction;
		public Attraction traerAttraction;
	}

	@Override
	public void tick() {
		if (this.started){
			this.physics.tick();
		}
	}	

	@Override
	public void stop() {
		this.started = false;
	}

	@Override
	public boolean isRunning() {
		return this.started;
	}

}

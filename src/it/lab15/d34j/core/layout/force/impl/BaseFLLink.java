package it.lab15.d34j.core.layout.force.impl;

import it.lab15.d34j.core.Link;
import it.lab15.d34j.core.Node;
import it.lab15.d34j.core.layout.force.FLLink;
import it.lab15.d34j.core.layout.force.FLNode;

public class BaseFLLink implements FLLink {
	
	private FLNode nodeA;
	private FLNode nodeB;
	float strength;
	float damping;
	float restLength;
	
	public BaseFLLink(FLNode nodeA, FLNode nodeB){
		this.nodeA = nodeA;
		this.nodeB = nodeB;
	}	

	public BaseFLLink(FLNode nodeA, FLNode nodeB,float strength, float damping, float restLength){
		this.nodeA = nodeA;
		this.nodeB = nodeB;
		this.strength = strength;
		this.damping = damping;
		this.restLength = restLength;
	}	

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#getNodeA()
	 */
	@Override
	public FLNode getNodeA() {
		return this.nodeA;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#getNodeB()
	 */
	@Override
	public FLNode getNodeB() {
		return this.nodeB;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#getStrength()
	 */
	@Override
	public float getStrength() {
		return strength;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#setStrength(float)
	 */
	@Override
	public void setStrength(float strength) {
		this.strength = strength;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#getDamping()
	 */
	@Override
	public float getDamping() {
		return damping;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#setDamping(float)
	 */
	@Override
	public void setDamping(float damping) {
		this.damping = damping;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#getRestLength()
	 */
	@Override
	public float getRestLength() {
		return restLength;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLLink#setRestLength(float)
	 */
	@Override
	public void setRestLength(float restLength) {
		this.restLength = restLength;
	}


	
}

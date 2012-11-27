package it.lab15.d34j.core.layout.force.impl;

import it.lab15.d34j.core.layout.force.FLAttraction;
import it.lab15.d34j.core.layout.force.FLNode;

public class BaseFLAttraction implements FLAttraction {

	private FLNode nodeA;
	private FLNode nodeB;
	float strength;
	float minimumDistance;
	
	public BaseFLAttraction(FLNode nodeA, FLNode nodeB, float strength, float minimumDistance){
		this.nodeA = nodeA;
		this.nodeB = nodeB;
		this.strength = strength;
		this.minimumDistance = minimumDistance;
	}
	
	@Override
	public FLNode getNodeA() {
		return this.nodeA;
	}

	@Override
	public FLNode getNodeB() {
		return this.nodeB;
	}

	@Override
	public float getStrength() {
		return this.strength;
	}

	@Override
	public float getMinimumDistance() {
		return this.minimumDistance;
	}


}

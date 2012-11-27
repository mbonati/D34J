package it.lab15.d34j.core.layout.force;

import it.lab15.d34j.core.Link;



public interface FLLink extends Link<FLNode> {

	public abstract FLNode getNodeA();

	public abstract FLNode getNodeB();

	public abstract float getStrength();

	public abstract void setStrength(float strength);

	public abstract float getDamping();

	public abstract void setDamping(float damping);

	public abstract float getRestLength();

	public abstract void setRestLength(float restLength);

}
package it.lab15.d34j.core.layout.force;

public interface FLAttraction {

	public abstract FLNode getNodeA();

	public abstract FLNode getNodeB();

	public abstract float getStrength();

	public abstract float getMinimumDistance();

}

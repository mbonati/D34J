package it.lab15.d34j.core.layout.force;

import it.lab15.d34j.core.Node;

public interface FLNode extends Node {

	public abstract String getId();

	public abstract float getMass();

	public abstract void setMass(float mass);

	public abstract float getX();

	public abstract void setX(float x);

	public abstract float getY();

	public abstract void setY(float y);

	public abstract float getZ();

	public abstract void setZ(float z);

}
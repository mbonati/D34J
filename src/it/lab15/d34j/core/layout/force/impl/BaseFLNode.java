package it.lab15.d34j.core.layout.force.impl;

import it.lab15.d34j.core.Node;
import it.lab15.d34j.core.layout.force.FLNode;

public class BaseFLNode implements FLNode {
	
	String id;
	float mass;
	float x;
	float y;
	float z;
	
	public BaseFLNode(String id){
		this.id = id;
	}

	public BaseFLNode(String id, float x, float y, float z, float mass){
		this.id = id;
		setX(x);
		setY(y);
		setZ(z);
		setMass(mass);
	}

	public BaseFLNode(String id, float x, float y, float mass){
		this(id, x,y,0,mass);
	}

	public BaseFLNode(String id, float mass){
		this(id, 0, 0, 0,mass);
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#getId()
	 */
	@Override
	public String getId() {
		return this.id;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#getMass()
	 */
	@Override
	public float getMass() {
		return mass;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#setMass(float)
	 */
	@Override
	public void setMass(float mass) {
		this.mass = mass;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#getX()
	 */
	@Override
	public float getX() {
		return x;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#setX(float)
	 */
	@Override
	public void setX(float x) {
		this.x = x;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#getY()
	 */
	@Override
	public float getY() {
		return y;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#setY(float)
	 */
	@Override
	public void setY(float y) {
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#getZ()
	 */
	@Override
	public float getZ() {
		return z;
	}

	/* (non-Javadoc)
	 * @see it.lab15.d34j.core.layout.force.impl.FLNode#setZ(float)
	 */
	@Override
	public void setZ(float z) {
		this.z = z;
	}
	


}

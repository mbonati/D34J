package it.lab15.d34j.examples.dummy.collision;

import it.lab15.d34j.core.layout.force.impl.BaseFLNode;

import java.util.HashMap;
import java.util.Map;

public class BubbleNode extends BaseFLNode {

	private boolean fixed;
	private float radius;
	private int index;
	private Map<String, Object> properties = new HashMap<String, Object>();
	
	public BubbleNode(int index, float radius, boolean fixed){
		super(""+index);
		this.radius = radius;
		this.fixed = fixed;
	}
	

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public BubbleNode setProperty(String name, Object value){
		this.properties.put(name, value);
		return this;
	}

	public Object getProperty(String name){
		return this.properties.get(name);
	}

	public String getStringProperty(String name){
		return (String)this.properties.get(name);
	}

	public int getIntProperty(String name){
		return (Integer)this.properties.get(name);
	}

	public long getLongProperty(String name){
		return (Long)this.properties.get(name);
	}

	public boolean getBooleanProperty(String name){
		return (Boolean)this.properties.get(name);
	}
	
	public double getDoubleProperty(String name){
		return (Double)this.properties.get(name);
	}

	public float getFloatProperty(String name){
		return (Float)this.properties.get(name);
	}
	
}

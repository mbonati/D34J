package it.lab15.d34j.core.layout.force;

import it.lab15.d34j.common.Size;
import it.lab15.d34j.core.Link;
import it.lab15.d34j.core.functions.ChargeFunction;
import it.lab15.d34j.core.functions.TickFunction;
import it.lab15.d34j.core.layout.Layout;
import it.lab15.d34j.core.layout.force.impl.BaseFLNode;
import it.lab15.d34j.core.layout.force.impl.BaseFLLink;

public interface ForceLayout extends Layout<FLNode> {

	public void addLinks(FLLink[] links);
	
	public void start();
	
	public void stop();
	
	public boolean isRunning();
	
	public void setSize(int width, int height);

	public void setSize(Size size);

	public void setGravity(float gravity);
	
	public Size getSize();

	public float getGravity();

	public void setCharge(int charge);
	
	public int getCharge();
	
	public void setChargeFunction(ChargeFunction function);
	
	public ChargeFunction getChargeFunction();

	public void onTick(TickFunction tickFunction);

	public void addAttractions(FLAttraction[] attractions);
	
}

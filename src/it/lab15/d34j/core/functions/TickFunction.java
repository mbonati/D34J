package it.lab15.d34j.core.functions;

import it.lab15.d34j.core.Node;
import it.lab15.d34j.core.events.TickEvent;

public abstract class TickFunction implements Function {

	public abstract void onTickEvent(TickEvent tickEvent);

}

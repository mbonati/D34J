package it.lab15.d34j.core.layout;

import it.lab15.d34j.core.Node;

public interface Layout <T extends Node> {

	public void addNodes(T[] nodes);
	
	public T[] getNodes();

	public void tick();
	
}

package it.lab15.d34j.core.functions;

import it.lab15.d34j.core.Node;

public abstract class ChargeFunction implements Function<Integer> {
	
	public abstract Integer computeCharge(Node node, int index);

}

package it.lab15.d34j.examples.dummy.collision;

import it.lab15.d34j.core.events.TickEvent;
import it.lab15.d34j.core.functions.TickFunction;
import it.lab15.d34j.core.layout.force.FLNode;
import it.lab15.d34j.core.layout.force.ForceLayout;
import it.lab15.d34j.core.layout.force.impl.BaseFLNode;
import it.lab15.d34j.core.layout.force.impl.traer.TraerForceLayout;
import it.lab15.d34j.core.view.ViewModel;

public class BubbleViewModel implements ViewModel {
	
	private ForceLayout forceLayout;
	
	public BubbleViewModel() {
		init();
	}
	
	private void init(){
		forceLayout = new TraerForceLayout();
	}

	public int getItemsCount(){
		return forceLayout.getNodes().length;
	}
	
	public Object getItemAt(int index){
		return forceLayout.getNodes()[index];
	}

	@Override
	public void update() {
		forceLayout.tick();
	}

	public BubbleNode addNewBubble(int index, float radius, boolean fixed){
		BubbleNode newBubble = new BubbleNode(index, radius, fixed);
		forceLayout.addNodes(new FLNode[]{newBubble});
		return newBubble;
	}
	
}

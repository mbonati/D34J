package it.lab15.d34j.examples.dummy.collision;

import it.lab15.d34j.common.Size;
import it.lab15.d34j.core.Node;
import it.lab15.d34j.core.Canvas;
import it.lab15.d34j.core.events.TickEvent;
import it.lab15.d34j.core.functions.ChargeFunction;
import it.lab15.d34j.core.functions.TickFunction;
import it.lab15.d34j.core.layout.force.ForceLayout;

import org.dummycreator.ClassBindings;
import org.dummycreator.DummyCreator;

public class CollisionDummySample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ClassBindings classBindings = ClassBindings.defaultBindings();
//		DummyCreator dummyCreator = new DummyCreator(classBindings);
//		
//		BubbleNode[] nodes = createRandomBubbles();
//		
//		ForceLayout force = dummyCreator.create(ForceLayout.class);
//		force.setGravity(0.05f);
//		//force.setNodes(nodes);
//		force.setSize(new Size(800,600));
//		force.setChargeFunction(new ChargeFunction() {
//			@Override
//			public Integer computeCharge(Node node, int index) {
//				return ((index>0) ? 0 : -2000);
//			}
//		});
//		
//		BubbleNode root = nodes[0];
//		root.setFixed(true);
//		root.setRadius(0);
//		
//		force.onTick(new TickFunction() {
//			@Override
//			public void onTickEvent(TickEvent event) {
//				// TODO Auto-generated method stub
//			}
//		});
//		
//		//start layout updates
//		force.start();
//		
//		//Create the View Model
//		BubbleViewModel bubbleViewModel = new BubbleViewModel(force);
//		//Create the View
//		BubbleView bubbleView = new BubbleView();
//		//Create the View controller
//		BubbleViewController bubbleViewController = new BubbleViewController(bubbleViewModel, bubbleView);
//		
//		//Create the Canvas
//		Canvas canvas = dummyCreator.create(Canvas.class);
//		//Add the View to the Canvas
//		canvas.addView(bubbleViewController);
		
	}

	private static BubbleNode[] createRandomBubbles() {
		// TODO Auto-generated method stub
		return null;
	}

}

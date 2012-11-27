package it.lab15.d34j.examples.dummy.collision;

import it.lab15.d34j.impl.desktop.D34JApplication;
import it.lab15.d34j.processing.utils.ApplicationLauncher;

public class CollisionApplication extends D34JApplication {

	BubbleViewController bubbleView;
	
	public CollisionApplication(){
	}
	

	@Override
	public void initialize() {
		super.initialize();
		
		/** Change defaults
		size(800, 600);
		background(255,255,255);
		frameRate(60);
		**/
		
		background(30,36,40);
		
		bubbleView = new BubbleViewController();
		this.addView(bubbleView);
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationLauncher.runSketch(CollisionApplication.class.getName());
	}

	
}

package it.lab15.d34j.processing.utils;

import processing.core.PApplet;

public class ApplicationLauncher {
	
	public static void runSketch(String sketchName){
	    PApplet.main(new String[] { "--present", sketchName });
	}

}

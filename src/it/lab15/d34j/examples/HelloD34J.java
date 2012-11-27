package it.lab15.d34j.examples;

import it.lab15.d34j.impl.desktop.D34JApplication;
import it.lab15.d34j.processing.utils.ApplicationLauncher;

public class HelloD34J extends D34JApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationLauncher.runSketch(HelloD34J.class.getName());
	}

	public void setup() {
		size(800, 600);
		background(0);
	}

	public void draw() {
		stroke(255);
		if (mousePressed) {
			line(mouseX, mouseY, pmouseX, pmouseY);
		}
	}

}

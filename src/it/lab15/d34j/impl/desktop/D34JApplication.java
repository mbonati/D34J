package it.lab15.d34j.impl.desktop;

import java.util.ArrayList;
import java.util.List;

import it.lab15.d34j.core.Application;
import it.lab15.d34j.core.Canvas;
import it.lab15.d34j.core.view.ViewController;
import processing.core.PApplet;

public class D34JApplication extends PApplet implements Application, Canvas {

	private List<ViewController> views = new ArrayList<ViewController>();

	public D34JApplication(){
	}
	
	@Override
	public void addView(ViewController view) {
		views.add(view);
	}

	public void removeView(ViewController view) {
		views.remove(view);
	}

	@Override
	public void setup() {
		initDefaults();
		initialize();
	}

	private void initDefaults() {
		size(displayWidth, displayHeight);
		background(255,255,255);
		frameRate(60);
	}

	@Override
	public void draw() {
		update();
		
//		stroke(255);
//		if (mousePressed) {
//			line(mouseX, mouseY, pmouseX, pmouseY);
//		}
	}

	@Override
	public void initialize() {
	}
	
	public void update(){
		for (ViewController view:this.views){
			view.update(this);
		}
	}
	
}

package it.lab15.d34j.core.view;

import it.lab15.d34j.core.Canvas;

public interface ViewController<M extends ViewModel, V extends View> {

	public void setModel(M viewModel);
	
	public M getViewModel();
	
	public void setView(V view);
	
	public V getView();
	
	public void update(Canvas canvas);
	
}

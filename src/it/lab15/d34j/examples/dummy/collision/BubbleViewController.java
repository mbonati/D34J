package it.lab15.d34j.examples.dummy.collision;

import it.lab15.d34j.core.Canvas;
import it.lab15.d34j.core.view.ViewController;
import it.lab15.d34j.core.view.ViewModel;

public class BubbleViewController implements ViewController<BubbleViewModel, BubbleView> {
	
	private BubbleViewModel viewModel;
	private BubbleView view;
	
	public BubbleViewController() {
		init();
	}

	private void init() {
		BubbleViewModel model = new BubbleViewModel();
		setModel(model);
		
		BubbleView view = new BubbleView();
		setView(view);

	}

	@Override
	public void setModel(BubbleViewModel viewModel) {
		this.viewModel = viewModel;
	}

	@Override
	public BubbleViewModel getViewModel() {
		return this.viewModel;
	}

	
	@Override
	public void setView(BubbleView view) {
		this.view = view;
	}

	@Override
	public BubbleView getView() {
		return this.view;
	}

	@Override
	public void update(Canvas canvas) {
		this.viewModel.update();
		
		// TODO : update the view
	}
	
	public BubbleNode addNewBubble(int index, float radius, boolean fixed){
		return this.viewModel.addNewBubble(index, radius, fixed);
	}
	

}

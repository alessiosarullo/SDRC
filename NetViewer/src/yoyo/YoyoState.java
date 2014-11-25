package yoyo;

import general.State;
import netViewer.Link;

public interface YoyoState extends State {

	// Message visitor

	public void handle(SetupMessage m, Link sender);
	
	public void changeState(YoyoState nextState);

	

}
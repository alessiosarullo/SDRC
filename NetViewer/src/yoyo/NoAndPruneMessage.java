package yoyo;

import netViewer.ArbitraryNodeYoYo;
import netViewer.Link;

public class NoAndPruneMessage extends NoMessage {

	@Override
	public void prune(ArbitraryNodeYoYo node, Link responseLink) {
		node.pruneOutgoingLink(responseLink);
	}

	@Override
	public String printString() {

		return "No and Prune";
	}
}

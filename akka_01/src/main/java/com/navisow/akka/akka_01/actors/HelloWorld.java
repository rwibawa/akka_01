/**
 * 
 */
package com.navisow.akka.akka_01.actors;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

/**
 * @author ryan
 *
 */
public class HelloWorld extends UntypedActor {
	
	public static enum Msg {
	    GREET, DONE;
	  }
	
	private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);

	/* (non-Javadoc)
	 * @see akka.actor.UntypedActor#onReceive(java.lang.Object)
	 */
	@Override
	public void onReceive(Object msg) throws Throwable {
		if (msg == Msg.GREET) {
			log.info("Hello world!");
		}
		
		if (msg == Msg.DONE) {
			getContext().stop(getSelf());
		}
		
		unhandled(msg);
	}

}

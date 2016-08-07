/**
 * 
 */
package com.navisow.akka.akka_01.controllers;

import com.navisow.akka.akka_01.actors.HelloWorld;
import com.navisow.akka.akka_01.actors.HelloWorld.Msg;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * @author ryan
 *
 */
public class Hello implements Controller {

	/* (non-Javadoc)
	 * @see com.navisow.akka.akka_01.controllers.Controller#Execute()
	 */
	@Override
	public void Execute() {
		ActorSystem system = ActorSystem.create("Hello");
	    ActorRef helloWorld = system.actorOf(Props.create(HelloWorld.class), "helloWorld");
	    helloWorld.tell(Msg.GREET, null);
	    helloWorld.tell(Msg.GREET, null);
	    helloWorld.tell(Msg.DONE, null);
	}

}

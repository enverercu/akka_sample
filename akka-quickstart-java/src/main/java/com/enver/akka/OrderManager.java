package com.enver.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class OrderManager {

	ActorSystem system = ActorSystem.create("orderstate");
	
	ActorRef orderstate = system.actorOf(Props.create(OrderState.class));
	
	orderstate.tell(    //using the reference to our actor, tell it
             new TransactionOrder(),   //to "Power On," using our message type
             getRef());  
	
	expectMsgEquals(OrderStates.Created);
	
	orderstate.tell(    //using the reference to our actor, tell it
            new TransactionPayment(),   //to "Power On," using our message type
            getRef());
	
	expectMsgEquals(OrderStates.Paid);
	
	
	orderstate.tell(    //using the reference to our actor, tell it
            new TransactionFulFill(),   //to "Power On," using our message type
            getRef());
	
	expectMsgEquals(OrderStates.Fulfillment);
	
	
	orderstate.tell(    //using the reference to our actor, tell it
            new TransactionClose(),   //to "Power On," using our message type
            getRef());
	
	expectMsgEquals(OrderStates.Closed);
	
	system.stop(orderstate);
}

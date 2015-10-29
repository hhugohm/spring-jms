package org.neos.spring.activemq.annotation;

public class Receiver {
	 public void receiveMessage(String message) {
	        System.out.println("Received <" + message + ">");
	    }
}

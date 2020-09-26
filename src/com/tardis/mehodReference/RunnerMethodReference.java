package com.tardis.mehodReference;

public class RunnerMethodReference {
	
	public RunnerMethodReference() {
		
	}
	
	// Method reference is used to refer method of functional interface
	// Functional interface = interface which contains only 1 abstract method
	// This allows to refer to a method without executing it 
	public void testMethodReference() {
		
		MessageSender messageSender = new MessageSender();
		MessageSenderInterface messageHelloSender = messageSender::sendHelloMessage;
		messageHelloSender.sendMessage();
	}

}

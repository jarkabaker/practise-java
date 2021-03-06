package com.tardis.ReactiveStream;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveStreamRunner {
	
	// Resembles Angular RxJS (Reactive Extension of Java Script)
	// - uses observant and observables, subscriptions, ...
	
	public void testReactiveStream() {
	
		System.out.println("Testing Reactive Stream");
		List<String> items = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
	  SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
	  publisher.subscribe(new MySubscriber<>());
	
	  items.forEach(s -> {
	      try {
	          Thread.sleep(1000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
	      publisher.submit(s);
	  });
	
	  publisher.close();
	  
	}

}

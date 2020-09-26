package com.tardis;

import com.tardis.dateTimePractise.RunnderDateTime;
import com.tardis.interfacePractise.RunnerDefaultMethod;
import com.tardis.lambdaExpression.RunnerLambda;
import com.tardis.mehodReference.RunnerMethodReference;
import com.tardis.optionalClass.RunnerOptionalClass;

public class Main {
	
	public static void main(String[] args) {
		
		// JAVA 8 - Date Time
		RunnderDateTime dateTime = new RunnderDateTime();
		dateTime.testDateTime();
		
		// JAVA 8 - Default Method (in Interface)
		RunnerDefaultMethod interfacePractiseClass = new RunnerDefaultMethod();
		interfacePractiseClass.talk();
		
		// JAVA 8 - Method Reference (for functional interface)
		RunnerMethodReference runnerMethodReference = new RunnerMethodReference();
		runnerMethodReference.testMethodReference();
		
		// JAVA 8 - Optional Class
		RunnerOptionalClass runnerOptionalClass = new RunnerOptionalClass();
		runnerOptionalClass.testOptionalClass();
		
		// JAVA 8 - Lambda
		RunnerLambda runnerLambda = new RunnerLambda();
		runnerLambda.testLambda();
  }

}

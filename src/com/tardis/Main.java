package com.tardis;

import com.tardis.dateTimePractise.RunnderDateTime;
import com.tardis.forEach.RunnerForEach;
import com.tardis.interfacePractise.RunnerDefaultMethod;
import com.tardis.lambdaExpression.RunnerLambda;
import com.tardis.lambdaFilterAndMap.RunnerLambdaFilterAndMap;
import com.tardis.mehodReference.RunnerMethodReference;
import com.tardis.optionalClass.RunnerOptionalClass;
import com.tardis.stream.RunnerOfStream;

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
		
		// JAVA 8 - Stream
		RunnerOfStream runnerOfStream = new RunnerOfStream();
		runnerOfStream.testStream();
		
		// JAVA 8 - ForEach
		RunnerForEach runnerForEach = new RunnerForEach();
		runnerForEach.testIterations();
		
		// JAVA 8 - Lambda Filter and Map
		RunnerLambdaFilterAndMap runnerLambdaFilterAndMap = new RunnerLambdaFilterAndMap();
		runnerLambdaFilterAndMap.testLambdaMore();
  }

}

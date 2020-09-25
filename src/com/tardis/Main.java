package com.tardis;

import com.tardis.dateTimePractise.DateTime;
import com.tardis.interfacePractise.InterfacePractiseClass;

public class Main {
	
	public static void main(String[] args) {
		
		// JAVA 8 - Date Time
		DateTime dateTime = new DateTime();
		dateTime.testDateTime();
		
		// JAVA 8 - Default Method (in Interface)
		InterfacePractiseClass interfacePractiseClass = new InterfacePractiseClass();
		interfacePractiseClass.talk();
		
		
  }

}

package com.tardis.numberMethods;


import java.text.NumberFormat;
import java.util.Locale;

public class NumberMethodTester {
	
	public void testNumberMethods() {
		
		System.out.println();
		System.out.println("Test of Number Methods");
		System.out.println("======================");
		this.testCompactNumber();
		
	}
	
	private void testCompactNumber() {
		
		NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.UK, NumberFormat.Style.LONG);

		System.out.println("LONG Compact Number Format");
		System.out.println( fmt.format(100) );
		System.out.println( fmt.format(1000) );
		System.out.println( fmt.format(10000) );
		System.out.println( fmt.format(100000) );
		
		NumberFormat fmtShort = NumberFormat
		        .getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		
		System.out.println("SHORT Compact Number Format");
		System.out.println( fmtShort.format(100) );
		System.out.println( fmtShort.format(1000) );
		System.out.println( fmtShort.format(10000) );
		System.out.println( fmtShort.format(100000) );
		
	}

}

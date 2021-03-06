package com.revature.primitives;

public class PrimitivePlayground {
	
	public static void main(String[] args) {
		/*
		 * Variables
		 * 
		 * All variables only hold a single value
		 * 
		 * Primitives reserve a fixed amount of memory to hold a specific value of a specific type
		 * 
		 * In Java - there are 8 primitives
		 * 
		 * Whole Numbers:
		 * byte 
		 * short
		 * int 
		 * long
		 * 
		 * Decimal Numbers:
		 * float 
		 * double
		 * 
		 * Other:
		 * boolean
		 * 
		 * EVERYTHING else are reference variables (hold a reference to an object's location in memory)
		 * 
		 * 
		 */
		
		//Remember - Java is statically typed
		byte b = 127;
		short s = 32767;
		char c = 'c';
		int i = 2147483647;
		long l = 9223372036854775807L;
		float f = 3.4f;
		double d = 688.77;
		boolean bool = false;
		
		System.out.println( b + s + c + i + l + f + d);
		
	}
}

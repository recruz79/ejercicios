package com.recs.ejercicios.primitives.bitoperators;

public class PrimitiveTypes {

	public static void main(String args[]) {

		// Primitives initialize with 0 value or false
		// literals can be used used for primitives

		byte byteValue = 0xF;  // 8 bits signed, 
		short shortValue = 0xF; // 16 bits 
		int intValue = 0xF; // 32 bits two's complement 
		long longValue = 0xCAFEBABE; //64 bits 	two's complement 
		float floatValue = 0x0; // 32 bits IEEE 754 floating point.
		double doubleValue = 0xffffffffffffffffL; // precision 64 bits IEEE 754 floating point.
		boolean booleanValue = false; // can have a value of true or false 
		char charValue = 'a'; // 16 bits unicode
		
		System.out.println("byte value is " + byteValue);
		System.out.println("short value is " + shortValue);
		System.out.println("int value is " + intValue);
		System.out.println("long value is " + longValue);
		System.out.println("float value is " + floatValue);
		System.out.println("double value is " + doubleValue);
		System.out.println("booleans value is " + booleanValue);
		System.out.println("char value is " + charValue);

	}
}

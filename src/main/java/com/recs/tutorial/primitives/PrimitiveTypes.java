package com.recs.tutorial.primitives;
//The term "instance variable" is another name for non-static field.
//The term "class variable" is another name for static field.
//A local variable stores temporary state; it is declared inside a method.
//A variable declared within the opening and closing parenthesis of a method is called a parameter.
//What are the eight primitive data types supported by the Java programming language? byte, short, int, long, float, double, booleans, char
//Character strings are represented by the class java.lang.String.
//An array is a container object that holds a fixed number of values of a single type.

public class PrimitiveTypes {

	public static void main(String args[]) {

		// usually primitives initialize with 0 value
		// literals are used for primitives 
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
		System.out.println("char value is  " + charValue);

		// long creditCardNumber = 1234_5678_9012_3456L; only for Java 1.7
		// long socialSecurityNumber = 999_99_9999L; only for Java 1.7
		// float pi =  3.14_15F; only for Java 1.7
		// long hexBytes = 0xFF_EC_DE_5E;only for Java 1.7
		// long hexWords = 0xCAFE_BABE;only for Java 1.7
		// long maxLong = 0x7fff_ffff_ffff_ffffL;only for Java 1.7
		// byte nybbles = 0b0010_0101; only for Java 1.7
		// long bytes = 0b11010010_01101001_10010100_10010010; only for Java 1.7
		
	}
}

package com.javaintroduction;

public class DataTypesDemo {
	byte b =(byte) 12;
	short s = (short)478;
	int i = 345678;
	long l = 5467380987L;
	float f = 345678;
	double d = 546738;
	char c = 'a';
	char c1 = 9876;
	char c2 = 65;
	boolean b1;
	
	public static void main(String[] args) {
		System.out.println("main method from data type");
		DataTypesDemo t1 = new DataTypesDemo();
		System.out.println("byte value:" + t1.b);
		System.out.println("short value:" + t1.s);
		System.out.println("int value:" + t1.i);
		System.out.println("long value:" + t1.l);
		System.out.println("float value:" + t1.f);
		System.out.println("double value:"+ t1.d);
		System.out.println("char value:"+ t1.c);
		System.out.println("char value:"+ t1.c1);
		System.out.println("boolean value:"+ t1.b1);
		System.out.println("char value:"+ t1.c2);
	}

}

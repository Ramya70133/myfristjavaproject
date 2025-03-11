package com.Methods;

public class TestMethodDemo1 {
	// static TestMethodDemo1 t1 = new TestMethodDemo1();
	void method1() {
		System.out.println("method1 called");
		       method4();
	}
  void method2() {
	 System.out.println("method2 called");
	method5();
 }
  void method3() {
	  System.out.println("method3 called");
	  method6();
  }
  static void method4() {
	  System.out.println("method4 call");
	TestMethodDemo1 t1 = new TestMethodDemo1();
	t1.method2();
  }
  
  static void method5() {
	  System.out.println("method5 call");
		TestMethodDemo1 t1 = new TestMethodDemo1();
		t1.method3();
	  
  }
  static void method6() {
	  System.out.println("method6 call");
  }
	public static void main(String[] args) {
		System.out.println("main method started");
    TestMethodDemo1 t1 = new TestMethodDemo1();
		t1.method1();
		method4();

	}

}

package com.Methods;

public class TestMethodDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		TestMethodDemo2 t1 = new TestMethodDemo2();
		t1.method1();
		t1.method2();
		t1.method3();
	//	method4();
	
	}
		 void method1 ()
		   {
			System.out.println("method1 call");
			//TestMethodDemo2 t1 = new TestMethodDemo2();
			method4();
		}
          void method2()
          {
	       System.out.println("method2 call");
	      // TestMethodDemo2 t1 = new TestMethodDemo2();
	      method5();
       }
          void method3()
          {
          System.out.println("method3 call");
          method6();
          }
          static void method4() {
        	  System.out.println("method4 call");
        	 
          }
          static void method5() {
        	  System.out.println("method5 call");
          }
          static void method6() {
        	  System.out.println("method6 call");
          }
         
	}



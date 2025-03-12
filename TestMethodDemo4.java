package com.Methods;

public class TestMethodDemo4 {

	void method1() {
		System.out.println("hello method1");
	}
	public void method2()
	{
		System.out.println("hello method2 !!");
	}
      void method3(int a) 
      {
	System.out.println("hello method3 !!" + a);
	}
      public void method4(int id, String name,String loc) {
    	  System.out.println("hello method4!! ");
    	  System.out.println(id);
    	  System.out.println(name);
    	  System.out.println(loc);
      }
	public static void main(String[] args) {
		System.out.println("my first  java method starts");
        TestMethodDemo4 t4 = new TestMethodDemo4();
          t4.method1();
          t4.method2();
          t4.method3(20);
          t4.method4(101, "swathi", "nellore");
	}

}

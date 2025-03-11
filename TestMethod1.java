package com.Methods;

public class TestMethod1 {

	public static void main(String[] args) {
		System.out.println("good morning : hello guys");
		method1();
		//method2();
		TestMethod1 t1 = new TestMethod1();
	   t1.method3();
	   t1.method4();
	}
		static void method1() {
		System.out.println("hello method1");
		method2();
	}
		static void method2() {
         System.out.println("hello method2");
         
   }
		//TestMethod1 t1 = new TestMethod1();
		void method3() {
			System.out.println("hello vcube");
		}
		void method4() {
			System.out.println("hello method3");
		}
}
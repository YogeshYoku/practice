package org.variables;

public class A {
	static int a=5;
	
	public static void test1() {


	System.out.println("Welcome");

	}
	
	private static void test2() {
test1();


		}
public static void main(String[] args) {

test2();
test1();
	
	
}
}

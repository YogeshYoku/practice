package org.fb;
public class B   {
private static void method3() {
System.out.println(A.i);
}
public static void main(String[] args) {
B b= new B();
method3();
System.out.println(A.i);
	
}
}
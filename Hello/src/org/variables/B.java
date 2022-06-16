package org.variables;

public class B extends A {
	private void method1() {
		
int a2 = A.a;
System.out.println(a2);
int i = super.a;
System.out.println(i);
System.out.println(a);
System.out.println(super.a);

	}
	public static void main(String[] args) {
		
	
B a=new B();
a.method1();
		
		
	
	
	}

}

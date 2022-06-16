package org.data;

import org.junit.Test;

public class Sample1 {
	 
	@Test

	public void test1() {
System.out.println("start");
try {
	System.out.println(10/0);
	System.out.println("true");
}
	catch(Exception e) {
		System.out.println("Welcome");
		

}
	}
		

	@Test
	public void test2() {
System.out.println("test2");
	
	}
}

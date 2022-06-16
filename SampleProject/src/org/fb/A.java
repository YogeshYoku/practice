package org.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class A {
static int i=20;	
WebDriver driver;
public static void method1(int a,int b) {
	int sum=a+b;
System.out.println(sum);
}
private void method2() {
	method1(70, 80);
	A.method1(80, 99);
	}


public static void main(String[] args) {
A.method1(20, 40);	
method1(20, 40);
A a=new A();




}}

package org.fb;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Employee extends BaseClass {
@BeforeClass
	public void BeforeClass() {
		webdriver();
		enterUrl("https://adactinhotelapp.com/");
		maximize();
		}

@AfterClass
public void AfterClass() {
	quit();
}
@org.junit.Test
public void login() {
	WebElement txtUserName = findElementId("username");
	

}
}

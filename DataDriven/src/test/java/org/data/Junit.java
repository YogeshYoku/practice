package org.data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
	}
	@Ignore
	public static void afterClass() {
driver.quit();

}
@Test
public void businessLogics() {
WebElement usrName = driver.findElement(By.id("email"));
usrName.sendKeys("Hello");
String attribute = usrName.getAttribute("value");
Assert.assertEquals("verify userName", "Hello", attribute);
WebElement passwd = driver.findElement(By.id("pass"));
passwd.sendKeys("hello");
String attribute2 = passwd.getAttribute("value");

Assert.assertEquals("Verify Password", "hello", attribute2);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
boolean contains = currentUrl.contains("https://www.facebook.com/");
Assert.assertTrue("Verify Url", contains);

}

@Before
public void before() {
	long currentTimeMillis = System.currentTimeMillis();
	System.out.println(currentTimeMillis);
	}
@After
public void after() {
long currentTimeMillis = System.currentTimeMillis();

System.out.println(currentTimeMillis);
}
}

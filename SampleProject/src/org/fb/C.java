package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\SampleProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hello");
		WebElement pass = driver.findElement(By.xpath("//input[@id='email']//parent::div[@class='_6lux']//following-sibling::div[@class='_6lux']//child::input[@id='pass']"));
	pass.sendKeys("welcome");
	

	}	

}

package org.data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> findElements = driver.findElements(By.id("mail"));
		WebElement webElement = findElements.get(0);
		System.out.println(webElement);
		webElement.sendKeys("Yogesh");
		driver.quit();
}
}
//If we Try with the Invalid Locator with the Help of driver.findElements It will Not Throw NoSuchException & also If We get the element which is Not 
//Available in the DOM. It will throw an Exception call IndexOutOfBoundException
package org.data;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement {
static	WebDriver driver;
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		WebElement txtUserName = driver.findElement(By.id("email"));
//		txtUserName.sendKeys("hello");
//		driver.navigate().refresh();
//		txtUserName.clear();
//		txtUserName.sendKeys("hai");
	//String attribute = txtUserName.getAttribute("placeholder");
	//System.out.println(attribute);
	
	

}
}
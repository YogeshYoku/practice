package org.data;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {	
	 static WebDriver driver;
	public static void main(String[] args) throws InvalidFormatException, IOException {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("http://adactinhotelapp.com/");
    driver.manage().window().maximize();
    driver.findElement(By.cssSelector("#username")).sendKeys("hello");
    driver.findElement(By.cssSelector(".login_input")).sendKeys("Raga Priya");
    
		
}
	
	


}
package org.fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
WebElement courses = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
//Select select=new Select(courses);
Actions action=new Actions(driver);
action.moveToElement(courses).perform();
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_UP);

	}

}

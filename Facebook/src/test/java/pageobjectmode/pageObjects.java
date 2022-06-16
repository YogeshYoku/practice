package pageobjectmode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObjects {
   static WebDriver driver;
static	WebElement  userName(WebDriver driver) {
return driver.findElement(By.name("username"));	
}
static public WebElement password(WebDriver driver) {
return driver.findElement(By.name("password"));	
}

static WebElement loginButton(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
	
	

}
}


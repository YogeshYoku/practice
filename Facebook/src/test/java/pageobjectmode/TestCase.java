package pageobjectmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	WebDriver driver;
	
	
	@Test
	public void methods() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		pageObjects.userName(driver).sendKeys("YogeshYoku");
		pageObjects.password(driver).sendKeys("PR9Z29");
		pageObjects.loginButton(driver).click();
	}

}

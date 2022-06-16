package org.fb;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
		}
		@Test
		public  void login() {
			WebElement usrname = driver.findElement(By.id("username"));
			usrname.sendKeys("YogeshYoku");
			WebElement passwd = driver.findElement(By.id("password"));
			passwd.sendKeys("PR9Z29");
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			}
		@Before
		public void beforeMethod() {
			long time = System.currentTimeMillis();
			System.out.println(time);
		}
		@After
		public void afterMethod() {
			long time1 = System.currentTimeMillis();
			System.out.println(time1);

		}
	
	
	

}

package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void launchBrowser() {
		long startTime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Test
	public void openGoogle() {

		driver.get("https://www.google.com/");
	}
	@Test
	public void openBing() throws InterruptedException {
		driver.get("https://www.bing.com/");
	}
	@Test
	public void openYahoo() throws InterruptedException {

		driver.get("https://www.yahoo.com/");
	}
	@AfterSuite
	public void closeBrowser() {
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time Taken:"+totalTime);
		driver.quit();

	}
}

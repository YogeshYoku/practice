package hello;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\Hello\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("hello");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("hello");
		TakesScreenshot screenshot= (TakesScreenshot) driver;
	File s = txtpassword.getScreenshotAs(OutputType.FILE);
	File d=new File("C:\\Users\\orton\\eclipse-workspace\\Hello\\screenshot\\hello1.png");
	FileUtils.copyFile(s, d);

}
}
package hello;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptt {
	

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\Hello\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		WebElement txtUserName = driver.findElement(By.id("email"));
		executor.executeScript("arguments[0].setAttribute('value','hello')",txtUserName);
		WebElement txtpassword = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','hai')",txtpassword);
		Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')",txtUserName);
		System.out.println(executeScript);
		//WebElement btnClick = driver.findElement(By.name("login"));
	//	executor.executeScript("arguments[0].click()",btnClick);
		WebElement terms = driver.findElement(By.xpath("//a[@title='Review our terms and policies.']"));
executor.executeScript("arguments[0].scrollIntoView(true)",terms);		
		Select select=new Select(txtpassword);
		
		
		
}
}
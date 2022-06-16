package hello;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Whatsapp {
	
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\Hello\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement findElement = driver.findElement(By.xpath("//div[@class='_11Jja']"));
JavascriptExecutor executor=(JavascriptExecutor) driver;

	
	findElement.click();
	
	}
}
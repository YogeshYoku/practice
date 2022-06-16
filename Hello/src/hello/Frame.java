package hello;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\Hello\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");
		 driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();	
Actions action=new Actions(driver);
WebElement framesoption = driver.findElement(By.xpath("//a[text()='Frames']"));
action.moveToElement(framesoption).click().perform();
}
}
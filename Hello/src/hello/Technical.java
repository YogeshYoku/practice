package hello;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Technical {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\Hello\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
List<WebElement> tables = driver.findElements(By.tagName("table"));
for (WebElement table : tables) {
	//Dimension size = table.getSize();
	//System.out.println(size);
//String text = table.getText();
//System.out.println(text);
//List<WebElement> amazontxt = driver.findElements(By.xpath("//*[contains(text(),'amazon')]"));
//for (WebElement amaz : tables) {
//	Thread.sleep(3000);
//	String text2 = amaz.getText();
//
//	int size3 = driver.getWindowHandles().size();
//	System.out.println(size3);
	//driver.findElement(By.xpath("//div[@id='nav-main']//child::div[@id='nav-xshop']//a[@data-csa-c-slot-id='nav_cs_0']")).click();
	driver.findElement(By.xpath("//div[@id='nav-main']//a[@data-csa-c-slot-id='nav_cs_4']")).click();
}

}


	
	

}

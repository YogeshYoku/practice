package hello;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\Hello\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));		
	
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	//WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-testid='open-registration-form-button']")));
	
	//until.click();
	
	Wait<WebDriver>waitt=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(4)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	
	WebElement until=waitt.until(new Function<WebDriver, WebElement>()
	
	{

		@Override
		public WebElement apply(WebDriver t) {
			
			return driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		}
	});
	
	until.click();
	}
	
	}
	


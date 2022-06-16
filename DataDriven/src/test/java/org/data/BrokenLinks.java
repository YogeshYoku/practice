package org.data;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	List<WebElement> brokenlinks = driver.findElements(By.tagName("a"));
	int size = brokenlinks.size();
	System.out.println(size);
	for (int i = 0; i < brokenlinks.size(); i++) {
		WebElement links = brokenlinks.get(i);
		String attribute = links.getAttribute("href");
		System.out.println(attribute);

		URL url=new URL(attribute);
URLConnection openConnection = url.openConnection();
HttpURLConnection urlConnection=(HttpURLConnection) openConnection;
int responseCode = urlConnection.getResponseCode();
if (responseCode>=400) {
	System.out.println(responseCode);
	
}
}
	
	
	}

}

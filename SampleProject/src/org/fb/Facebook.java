package org.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\orton\\eclipse-workspace\\SampleProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tableData = driver.findElement(By.id("customers"));
		List<WebElement> allRow = tableData.findElements(By.tagName("tr"));
		for (int i = 0; i < allRow.size(); i++) {
			WebElement ele = allRow.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		List<WebElement> allData = tableData.findElements(By.tagName("td"));
		for (int i = 0; i < allData.size(); i++) {
			WebElement eleq = allData.get(i);
			String text1 = eleq.getText();

			System.out.println(text1);
		}	
		System.out.println();

		//AlternativeValue
		WebElement findElement3 = tableData.findElement(By.xpath("//td[normalize-space()='Alfreds Futterkiste']//following::td[1]"));
		String text5 = findElement3.getText();
		System.out.println(text5);
		//MiddleRow Value
		WebElement findElement4 = tableData.findElement(By.xpath("//th[normalize-space()='Country']//following::tr[3]"));
		String text6 = findElement4.getText();
		System.out.println(text6);
		//LastRow Value
		WebElement findElement5 = tableData.findElement(By.xpath("//th[normalize-space()='Country']//following::tr[6]"));
		String text7 = findElement5.getText();
		System.out.println(text7);

	}}
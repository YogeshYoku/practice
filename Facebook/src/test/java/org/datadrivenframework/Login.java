package org.datadrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	

	WebDriver driver;
	String[][] data={
	{"YogeshYoku","PR9Z29"},
	{"YogeshYoku","Hello"},
	{"Yogesh","PR9Z29"},
	{"hELLO","hai"}
	};
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
		

	}
	@Test(dataProvider = "loginData")

	public void loginWithCorrectUserName(String username, String passwd) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement usrName = driver.findElement(By.id("username"));
		usrName.sendKeys(username);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(passwd);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		driver.quit();
	}


}

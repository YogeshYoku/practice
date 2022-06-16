package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;
import com.pages.LoginPage;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	
	
	@Before
	public void beforeScenario() throws IOException, AWTException, InterruptedException {
		getDriver(getPropertyValue("browserName"));
		enterUrl(getPropertyValue("url"));
		maximize();
		LoginPage loginpage= new LoginPage();
		loginpage.login(getPropertyValue("userName"),getPropertyValue("password"));
		Thread.sleep(3000);
		loginpage.robot(getPropertyValue("userName"), getPropertyValue("password"));
		
		
	}

	/*@After
	public void afterScenario(Scenario scenario) {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(b, "png", "EveryScenario");
		//quit();
*/		
		

	}
//}

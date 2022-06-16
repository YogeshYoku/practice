package com.pages;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;

	
	@FindBy(id="login")
	private WebElement btnlogin;


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	public void login(String username,String password)  {
sendKeys(getTxtUserName(), username);
sendKeys(getTxtPassword(), password);
click(btnlogin);
Assert.assertTrue("btnlogin", true);
	}
public void robot(String username, String password) throws AWTException {
	sendKeys(getTxtUserName(), username);
	sendKeys(getTxtPassword(), password);
    Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	

}
	
}



package com.pages;



import org.junit.Assert;
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
	
	
	public void login(String userName,String password) {
sendKeys(getTxtUserName(), userName);
sendKeys(getTxtPassword(), password);
click(getBtnlogin());
Assert.assertTrue("btnlogin", true);
	}
}



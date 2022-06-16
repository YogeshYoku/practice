package org.pom;

import org.fb.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	public void login(String username,String password) {
sendKeys(getTxtUserName(), username);
sendKeys(getTxtPassword(), password);
click(getBtnlogin());
Assert.assertTrue("btnlogin", true);
	}
}



package org.pom;

import org.fb.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagee extends BaseClass {
	
	
	public LoginPagee() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	
	@FindBy(id="password")
	private WebElement txtPassword;

	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getBtnLogin() {
		return btnLogin;
	}


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}

	
	public void login(String userName, String password) {
		LoginPagee loginPagee=new LoginPagee();
	sendKeys(getTxtUserName(), userName);
	sendKeys(getTxtPassword(), password);
	click(btnLogin);
	Assert.assertTrue("btnLogin", true);
	}
	
}


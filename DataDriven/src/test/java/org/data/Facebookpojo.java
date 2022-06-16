package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpojo extends BaseClass {
 
	
	
	public Facebookpojo() {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id="email")
	private WebElement txtUserName;

	@FindBy(id="pass")
	private WebElement txtPassword;


	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	
	public void methods(String userName, String password) {
Facebookpojo facebookpojo=new Facebookpojo();
sendKeys(txtUserName, userName);
sendKeys(txtPassword, password);
	
	
	}
 {
	
}



}

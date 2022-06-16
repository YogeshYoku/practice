package com.pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(id="radiobutton_0")
private WebElement btnSelect;

@FindBy(id="continue")
private WebElement btnContinue;

@FindBy(xpath="//td[@class='login_title']")
private WebElement txtMsg;


public WebElement getBtnSelect() {
	return btnSelect;
}



public WebElement getTxtMsg() {
	return txtMsg;
}



public void setTxtMsg(WebElement txtMsg) {
	this.txtMsg = txtMsg;
}



public WebElement getBtnContinue() {
	return btnContinue;
}

public void select() {
	click(btnSelect);
	Assert.assertTrue("btnSelect", true);
	click(btnContinue);
	Assert.assertTrue("continue", true);
	
}


}

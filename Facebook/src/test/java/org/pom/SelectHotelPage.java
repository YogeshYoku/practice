package org.pom;

import org.fb.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(id="radiobutton_0")
private WebElement btnSelect;

@FindBy(id="continue")
private WebElement btnContinue;



public WebElement getBtnSelect() {
	return btnSelect;
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

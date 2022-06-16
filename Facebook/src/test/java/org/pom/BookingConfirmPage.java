package org.pom;

import java.io.IOException;

import org.fb.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement txtOrderNo;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
	public void orderNo() throws IOException {
				String value = getAttribute(txtOrderNo);
				//createNewCell("AdactinHotel", 1, 18, value);
				

	}
	
	

}

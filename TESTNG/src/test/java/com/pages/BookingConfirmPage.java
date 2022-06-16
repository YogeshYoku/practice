package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtmsg() {
		return txtmsg;
	}

	public void setTxtmsg(WebElement txtmsg) {
		this.txtmsg = txtmsg;
	}

	@FindBy(id = "order_no")
	private WebElement txtOrderNo;
	@FindBy(xpath = "//td[contains(text(),'Booking Confirmation')]")
	private WebElement txtmsg;
		public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public void orderNo() throws IOException {
		String value = getAttribute(txtOrderNo);
		System.out.println(value);
	}
	
}

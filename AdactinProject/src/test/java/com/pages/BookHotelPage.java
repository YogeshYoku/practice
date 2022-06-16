package com.pages;



import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtUserName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddressName;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement dtnCcType;
	@FindBy(id="cc_exp_month")
	private WebElement dtnCcExpMonth;
    @FindBy(id="cc_exp_year")
	private WebElement dtnCcExpYear;
	@FindBy(id="cc_cvv")
	private WebElement txtcCCvv;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	public WebElement getTxtMsg() {
		return txtMsg;
	}
	public void setTxtMsg(WebElement txtMsg) {
		this.txtMsg = txtMsg;
	}

	@FindBy(xpath="//td[contains(text(),'Book A Hotel')]")
	private WebElement txtMsg;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddressName() {
		return txtAddressName;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getDtnCcType() {
		return dtnCcType;
	}
	public WebElement getDtnCcExpMonth() {
		return dtnCcExpMonth;
	}
	public WebElement getDtnCcExpYear() {
		return dtnCcExpYear;
	}
	public WebElement getTxtcCCvv() {
		return txtcCCvv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public void bookAHotel(String firstName,String lastName,String address,String ccNum, String ccType, String expMonth, int expYear,String cvvNo) {
		sendKeys(getTxtUserName(), firstName);
		sendKeys(getTxtLastName(), lastName);
		sendKeys(getTxtAddressName(), address);
		sendKeys(getCcNum(), ccNum);
		selectByText(getDtnCcType(), ccType);
		selectByText(getDtnCcExpMonth(), expMonth);
		selectByIndex(getDtnCcExpYear(), expYear);
		sendKeys(getTxtcCCvv(), cvvNo);
		click(btnBookNow);
		Assert.assertTrue("Booked", true);
		
	}
}

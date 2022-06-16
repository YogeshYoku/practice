package com.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.datatable.DataTable;
public class BookHotel extends BaseClass{
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtUserName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddressName;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
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
	private WebElement clickbook;
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
		
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddressName() {
		return txtAddressName;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	@FindBy(xpath = "//td[contains(text(),'Booking Confirmation')]")
	private WebElement txtmsg;
	@FindBy(xpath = "//label[text()='Please Enter your First Name']")
	private WebElement txtFirstName;
	@FindBy(xpath = "//label[text()='Please Enter you Last Name']")
	private WebElement txtLastNamee;
	@FindBy(xpath = "//label[text()='Please Enter your Address']")
	private WebElement txtAddress;
	@FindBy(xpath = "//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private WebElement ccNo;
	@FindBy(xpath = "//label[text()='Please Select your Credit Card Type']")
	private WebElement ccType;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public WebElement getTxtLastNamee() {
		return txtLastNamee;
	}

	public void setTxtLastNamee(WebElement txtLastNamee) {
		this.txtLastNamee = txtLastNamee;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public void setTxtAddress(WebElement txtAddress) {
		this.txtAddress = txtAddress;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public void setCcNo(WebElement ccNo) {
		this.ccNo = ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public void setCcType(WebElement ccType) {
		this.ccType = ccType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(WebElement expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	@FindBy(xpath = "//label[text()='Please Enter your Credit Card CVV Number']")
	private WebElement cvvNo;


	public WebElement getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(WebElement cvvNo) {
		this.cvvNo = cvvNo;
	}

	@FindBy(xpath = "//label[text()='Please Select your Credit Card Expiry Month']")
	private WebElement expiryMonth;
	@FindBy(xpath = "order_no")
	private WebElement expiryYear;

	
	
	public void bookAHotel(String firstName,String lastName,String address ,DataTable dataTable) {
		sendKeys(getTxtUserName(), firstName);
		sendKeys(getTxtLastName(), lastName);
		sendKeys(getTxtAddressName(), address);
		List<Map<String, String>> map = dataTable.asMaps();
		Map<String, String> map2 = map.get(0);
		String ccNo = map2.get("Credit Card No");
		String ccType = map2.get("Credit Card Type");
		String month = map2.get("Select Month");
		String cvv = map2.get("Cvv");
		sendKeys(getCcNum(), ccNo);
		selectByIndex(getDtnCcType(), 1);
		selectByIndex(getDtnCcExpMonth(), 12);
		selectByIndex(getDtnCcExpYear(),12);
		sendKeys(getTxtcCCvv(), cvv);
		click(btnBookNow);
		Assert.assertTrue("Booked", true);
		
	}

	}

package org.pom;

import org.fb.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CancelBookingPage extends BaseClass{
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
		
	}
	

	
	@FindBy(linkText="Booked Itinerary")
	private WebElement txtClick;

	@FindBy(id="order_id_text")
	private WebElement txtorderrId;
	

	@FindBy(id="search_hotel_id")
	private WebElement txtSearchHotelId;
	
	@FindBy(xpath="//input[@value=Cancel Selected]")
	private WebElement txtValueId;
	
	@FindBy(name="cancelall")
	private WebElement btncancel;
	
	

	public WebElement getTxtClick() {
		return txtClick;
	}

	public WebElement getBtncancel() {
		return btncancel;
	}

	public WebElement getTxtorderrId() {
		return txtorderrId;
	}

	public WebElement getTxtSearchHotelId() {
		return txtSearchHotelId;
	}

	public WebElement getTxtValueId() {
		return txtValueId;
	}
	
	
	
	public void cancelBooking(String txt) throws InterruptedException {
		
		click(getTxtClick());
		Thread.sleep(2000);
		sendKeys(getTxtorderrId(), txt);
		//click(getTxtorderrId());
		//sendKeys(getTxtorderrId(),"Value");
		click(getTxtSearchHotelId());
		click(btncancel);
		Assert.assertTrue(true, "cancelled");
		alertAccept();
		
		

	}
	
	
	}
	
	

	
	
	
	
	


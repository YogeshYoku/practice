package com.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pages.BookHotel;
import com.pages.BookHotelPage;
import com.pages.BookingConfirmPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingHotelStep extends BaseClass {

	
	@When("User Must Verify {string}")
	public void user_Must_Verify(String expValue) {
		SearchHotelPage searchhotelpage = new SearchHotelPage();
		String actValue = getAttribute(searchhotelpage.getTxtMessage());
		Assert.assertEquals("verifyLogin", expValue, actValue);
	}
	
	
	
	

	@When("User Search{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_Search_and(String location, String hotels, String roomType, String noOfRooms, String checkIn,
			String checkOut, String adultPerRoom, String childPerRoom) {
		SearchHotelPage searchhotelpage = new SearchHotelPage();
		searchhotelpage.searchHotels(location, hotels, roomType, noOfRooms, checkIn, checkOut, adultPerRoom,
				childPerRoom);
	}

	@When("User have to Verify {string}")
	public void user_have_to_Verify(String expValue) {
		SelectHotelPage selecthotelpage = new SelectHotelPage();
		String actValue = getText(selecthotelpage.getTxtMsg());
		Assert.assertEquals("Verify Select Hotel", expValue, actValue);
	}

	@When("Select Hotel")
	public void select_Hotel() {
		SelectHotelPage selecthotelpage = new SelectHotelPage();
		selecthotelpage.select();

	}

	@When("User Should be Verify {string}")
	public void user_Should_be_Verify(String expValue) {
		BookHotelPage bookhotelpage = new BookHotelPage();
		String actValue = getText(bookhotelpage.getTxtMsg());
		Assert.assertEquals("Verify Book A Hotel", expValue, actValue);
	}

	@When("User Should book hotel {string},{string},{string} and payment")
	public void user_Should_book_hotel_and_payment(String firstName, String lastName, String billingAddress,
			io.cucumber.datatable.DataTable dataTable) {
		BookHotel bookhotel = new BookHotel();
		bookhotel.bookAHotel(firstName, lastName, billingAddress, dataTable);
			}

	@Then("User Should Verify {string}")
	public void user_Should_Verify(String expValue) throws InterruptedException {
		BookingConfirmPage bookingconfirmpage = new BookingConfirmPage();
		implicitWaits(6);
		String actValue = getText(bookingconfirmpage.getTxtmsg());
        Assert.assertEquals("Verify Booking Confirmation", expValue, actValue);
	}

	@When("User Should Click book")
	public void user_Should_Click_book() {
		BookHotel bookhotel=new BookHotel();
		WebElement btnBookNow = bookhotel.getBtnBookNow();

		click(btnBookNow);
	}

	@Then("User Should Verify {string},{string},{string},{string},{string},{string} and {string}")
	public void user_Should_Verify_(String PleaseEnteryourFirstName, String expValuePleaseEnteryouLastName,
			String expValuePleaseEnteryourAddress, String expValuePleaseEnteryour16DigitCreditCardNumber,
			String expValuePleaseSelectyourCreditCardType, String expValuePleaseSelectyourCreditCardExpiryMonth,
			String expValuePleaseEnteryourCreditCardCVVNumber) throws InterruptedException {
		maximize();
		implicitWait();

		BookHotel bookhotel=new BookHotel();

		String frstName = getText(bookhotel.getTxtFirstName());

		Assert.assertEquals("Verify firstName Confirmation", PleaseEnteryourFirstName, frstName );

		String lstName = getText(bookhotel.getTxtLastNamee());
		Assert.assertEquals("Verify lasstName Confirmation", expValuePleaseEnteryouLastName, lstName);

		String address = getText(bookhotel.getTxtAddress());
		Assert.assertEquals("Verify lasstName Confirmation", expValuePleaseEnteryourAddress, address);

		String ccNo = getText(bookhotel.getCcNo());
		Assert.assertEquals("Verify lasstName Confirmation", expValuePleaseEnteryour16DigitCreditCardNumber, ccNo);

		String ccType = getText(bookhotel.getCcType());
		Assert.assertEquals("Verify lasstName Confirmation", expValuePleaseSelectyourCreditCardType, ccType);
		String expMonth = getText(bookhotel.getExpiryMonth());
		Assert.assertEquals("Verify lasstName Confirmation", expValuePleaseSelectyourCreditCardExpiryMonth, expMonth);

		String cvv = getText(bookhotel.getCvvNo());
		Assert.assertEquals("Verify lasstName Confirmation", expValuePleaseEnteryourCreditCardCVVNumber, cvv);
	}
	
}

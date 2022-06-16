package org.testng;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.BookHotelPage;
import com.pages.BookingConfirmPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class DataProvider extends BaseClass {


	@Test(dataProvider = "SampleData",priority = 1)

	public void login(String userNameData, String passwordData,String location,String hotels,String roomType,String firstName,String lastName,String address) throws IOException, InvalidFormatException {
		browserLaunch("http://adactinhotelapp.com/");
		enterUrl("http://adactinhotelapp.com/");
		LoginPage loginPage=new LoginPage();
		WebElement txtUserName = loginPage.getTxtUserName();
		Assert.assertTrue(txtUserName.isDisplayed());
		System.out.println("UserName is Displayed");
		WebElement txtPassword = loginPage.getTxtPassword();
		Assert.assertTrue(txtPassword.isDisplayed());
		System.out.println("password is Displayed");
		WebElement btnlogin = loginPage.getBtnlogin();
		txtUserName.sendKeys(userNameData);
		txtPassword.sendKeys(passwordData);
		btnlogin.click();
		Assert.assertEquals(driver.getTitle().contains("Adactin"),true);
		SearchHotelPage searchHotelPage=new SearchHotelPage();
		WebElement dtnLocation = searchHotelPage.getDtnLocation();
		WebElement dtnHotels = searchHotelPage.getDtnHotels();
		WebElement dtnRoomType = searchHotelPage.getDtnRoomType();
		WebElement dtnRoomNo = searchHotelPage.getDtnRoomno();
		WebElement dtnAdultRoom = searchHotelPage.getDtnAdultRoom();
		WebElement dtnChildRoom = searchHotelPage.getDtnChildRoom();
		selectByText(dtnLocation, location);
		selectByText(dtnHotels, hotels);
		selectByText(dtnRoomType, roomType);
		selectByIndex(dtnRoomNo, 1);
		selectByIndex(dtnAdultRoom, 1);
		selectByIndex(dtnChildRoom, 1);
	WebElement btnSearch = searchHotelPage.getBtnSearch();
	btnSearch.click();
	SelectHotelPage selectHotelPage=new SelectHotelPage();
	selectHotelPage.select();
	BookHotelPage bookHotelPage=new BookHotelPage();
	WebElement txtFirstName = bookHotelPage.getTxtUserName();
	sendKeys(txtFirstName, firstName);
	WebElement txtLastName = bookHotelPage.getTxtLastName();
	sendKeys(txtLastName, lastName);
	WebElement txtAddress = bookHotelPage.getTxtAddressName();
	sendKeys(txtAddress, address);
	WebElement ccNum = bookHotelPage.getCcNum();
	sendKeys(ccNum, "5454565654545656");
	WebElement dtnCcType = bookHotelPage.getDtnCcType();
	WebElement dtnCcExpMonth = bookHotelPage.getDtnCcExpMonth();
	WebElement dtnCcExpYear = bookHotelPage.getDtnCcExpYear();
	selectByIndex(dtnCcType, 1);
	selectByIndex(dtnCcExpMonth, 12);
	selectByIndex(dtnCcExpYear, 12);
	
	WebElement cvv = bookHotelPage.getTxtcCCvv();
	sendKeys(cvv, "256");
	WebElement btnBookNow = bookHotelPage.getBtnBookNow();
	btnBookNow.click();
	BookingConfirmPage bookingConfirmPage=new BookingConfirmPage();
	WebElement txtOrderNo = bookingConfirmPage.getTxtOrderNo();
	String attribute = getAttribute(txtOrderNo);
	System.out.println(attribute);

	
	}
			
		@org.testng.annotations.DataProvider(name="SampleData")
		public Object[][] dataProviderLogin() throws IOException {
			return new Object[][] {

				{dataFromExcel(1, 0),dataFromExcel(1, 1),dataFromExcel(1, 2),dataFromExcel(1, 3),dataFromExcel(1, 4),dataFromExcel(1, 10),dataFromExcel(1, 11),dataFromExcel(1, 12)}


			};
		}


	


}


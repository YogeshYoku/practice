package org.testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.BookHotelPage;
import com.pages.BookingConfirmPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class ParameterizationExample extends BaseClass {
WebDriver driver;

@BeforeClass
public void beforeClass() {
webdriver();
enterUrl("http://adactinhotelapp.com/");
}


@Parameters({"userName","password"})
@Test(priority = 1)
public void login(String userName, String password) {

	LoginPage loginPage=new LoginPage();
	
	loginPage.login(userName, password);
}

@Parameters({"Location","Hotels","Room Type","Number of Rooms","Adults per Room","Children per Room"})
@Test(priority = 2)
public void searchHotels(String location, String hotels,String roomType, String noOfRooms,String adultsPerRoom,String childerenPerRoom) {
SearchHotelPage searchHotelPage=new SearchHotelPage();
searchHotelPage.searchHotels(location, hotels, roomType, noOfRooms,"","",  adultsPerRoom, childerenPerRoom);
}

@Test(priority =3)
public void selectHotel() {
SelectHotelPage selectHotelPage=new SelectHotelPage();
selectHotelPage.select();
}

@Parameters({"First Name","Last Name","Billing Address","Credit Card No","Credit Card Type","Expiry Month","Expiry Year","CVV"})
@Test(priority = 4)
public void bookHotel(String firstName,String lastName,String address,String ccNum, String ccType, String expMonth, int expYear,String cvvNo) {
BookHotelPage bookHotelPage=new BookHotelPage();
bookHotelPage.bookAHotel(firstName, lastName, address, ccNum, ccType, expMonth, expYear, cvvNo);
}
@Test(priority = 5)
public void bookingConfirmation() throws IOException, InterruptedException {
BookingConfirmPage bookingConfirmPage=new BookingConfirmPage();
Thread.sleep(6000);
bookingConfirmPage.orderNo();

}

}

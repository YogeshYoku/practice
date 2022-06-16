

package org.pom;

import java.io.IOException;

import org.fb.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class ExecuteAll extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		webdriver();
		enterUrl("https://adactinhotelapp.com/");
		maximize();
	}

	/*
	 * @AfterClass public static void afterClass() { quit(); }
	 */
	@Test
	public void booking() throws IOException, InterruptedException {
		
		
		
		String userName = getData("AdactinHotel", 1, 0);
		String passWord = getData("AdactinHotel", 1, 1);
		String location = getData("AdactinHotel", 1, 3);
		String hotels = getData("AdactinHotel", 1, 4);
		String roomType = getData("AdactinHotel", 1, 5);
		String roomNos = getData("AdactinHotel", 1, 6);
		String adultPerRoom = getData("AdactinHotel", 1, 7);
		String childPerRoom = getData("AdactinHotel", 1, 8);
		
		  String firstName = getData("AdactinHotel", 1, 9);
		  String lastName =getData("AdactinHotel", 1, 10);
		  String billingAddress =getData("AdactinHotel", 1, 11); 
		  String ccNO = getData("AdactinHotel", 1, 12);
		  String ccType = getData("AdactinHotel", 1, 13);
		  String month =getData("AdactinHotel", 1, 14);
		  String year = getData("AdactinHotel", 1, 15);
		  String cvv = getData("AdactinHotel", 1, 16);
		  String data = getData("AdactinHotel",1, 17);
		  LoginPage loginpage=new LoginPage(); 
loginpage.login(userName, passWord);
SearchHotelPage searchhotelpage=new SearchHotelPage();
searchhotelpage.searchHotels(location, hotels, roomType, hotels, roomType, roomNos, adultPerRoom, childPerRoom);
SelectHotelPage selecthotelpage=new SelectHotelPage();
selecthotelpage.select();
BookHotelPage bookhotelpage=new BookHotelPage();
bookhotelpage.bookAHotel(firstName, lastName, billingAddress, ccNO, ccType, month, 12, cvv);
CancelBookingPage cancelbookingpage=new CancelBookingPage();
//String data2 = getData("AdactinHotel", 0, 18);
cancelbookingpage.cancelBooking(data);



//BookingConfirmPage bookingconfirmpage=new BookingConfirmPage();
//bookingconfirmpage.orderNo();



	}
}

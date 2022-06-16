package org.pom;
import org.fb.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dtnLocation;
	@FindBy(id="hotels")
	private WebElement dtnHotels;
	@FindBy(id="room_type")
	private WebElement dtnRoomType;
	@FindBy(id="room_nos")
	private WebElement dtnRoomno;
	@FindBy(id="datepick_in")
	private WebElement txtCheckDateIn;
	@FindBy(id="datepick_out")
	private WebElement txtCheckDateOut;
	@FindBy(id="adult_room")
	private WebElement dtnAdultRoom;
	@FindBy(id="child_room")
	private WebElement dtnChildRoom;
	@FindBy(id="Submit")
	private WebElement btnSearch;
	public WebElement getDtnLocation() {
		return dtnLocation;
	}
	public WebElement getDtnHotels() {
		return dtnHotels;
	}
	public WebElement getDtnRoomType() {
		return dtnRoomType;
	}
	public WebElement getDtnRoomno() {
		return dtnRoomno;
	}
	public WebElement getTxtCheckDateIn() {
		return txtCheckDateIn;
	}
	public WebElement getTxtCheckDateOut() {
		return txtCheckDateOut;
	}
	public WebElement getDtnAdultRoom() {
		return dtnAdultRoom;
	}
	public WebElement getDtnChildRoom() {
		return dtnChildRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}

	
	public void searchHotels(String location, String hotels,String roomType, String noOfRooms,String checkInDate,String checkOutDate,String adultsPerRoom,String childerenPerRoom)
{
		selectByText(getDtnLocation(), location);
		selectByText(getDtnHotels(), hotels);
		selectByText(getDtnRoomType(), roomType);
		selectByIndex(getDtnRoomno(), 1);
		//selectByText(getDtnRoomno(), noOfRooms);
		sendKeys(getTxtCheckDateIn(), checkInDate);
		sendKeys(getTxtCheckDateOut(), checkOutDate);
		selectByIndex(getDtnAdultRoom(), 1);
		selectByIndex(getDtnChildRoom(), 1);
		//selectByText(getDtnAdultRoom(), adultsPerRoom);
		//selectByText(getDtnChildRoom(), childerenPerRoom);
		click(btnSearch);
		Assert.assertTrue("btnSearch", true);
	}
}

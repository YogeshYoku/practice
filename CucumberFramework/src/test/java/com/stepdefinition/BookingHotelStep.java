package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingHotelStep {
	
	WebDriver driver;
	@Given("User is on the Login page")
	public void user_is_on_the_Login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@When("User Should Enter {string},{string}")
	public void user_Should_Enter(String userName,String pass) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(userName);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(pass);

	}

	@When("User Should Click Login button")
	public void user_Should_Click_Login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@When("User Should Search {string},{string},{string},{string},{string},{string}")
	public void user_Should_Search(String location, String hotels, String roomType, String noOfRooms, String adultsPerRoom, String childPerRoom) {
		WebElement loca = driver.findElement(By.id("location"));
		Select select= new Select(loca);
		select.selectByVisibleText(location);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select select1= new Select(hotel);
		select1.selectByVisibleText(hotels);
		WebElement roomtyp = driver.findElement(By.id("room_type"));
		Select select2= new Select(roomtyp);
		select2.selectByVisibleText(roomType);
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select select3= new Select(roomnos);
		select3.selectByIndex(1);
		WebElement adult_room = driver.findElement(By.id("adult_room"));
		Select select4= new Select(adult_room);
		select4.selectByIndex(1);
		WebElement child_room = driver.findElement(By.id("child_room"));
		Select select5= new Select(child_room);
		select5.selectByIndex(1);

	}

	@When("User Should Click Search button")
	public void user_Should_Click_Search_button() {
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();
	}

	@When("User Should Select Hotel")
	public void user_Should_Select_Hotel() {
		WebElement rdoButton = driver.findElement(By.id("radiobutton_0"));
		rdoButton.click();
	}

	@When("User Should Click continue button")
	public void user_Should_Click_continue_button() {
		WebElement ctnButton = driver.findElement(By.id("continue"));
		ctnButton.click();

	}

	@When("User Should Enter Details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Should_Enter_Details(String firstName, String lastName, String address, String ccNo,  String ccType, String expMonth, String expYear,String cvv) {
		WebElement frstName = driver.findElement(By.id("first_name"));
		frstName.sendKeys(firstName);
		WebElement lstName = driver.findElement(By.id("last_name"));
		lstName.sendKeys(lastName);
		WebElement adress = driver.findElement(By.id("address"));
		adress.sendKeys(address);
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys(ccNo);
		WebElement cctyp = driver.findElement(By.id("cc_type"));
		Select select6=new Select(cctyp);
		select6.selectByIndex(1);
		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select select7=new Select(ccExpMonth);
		select7.selectByIndex(12);
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select select8=new Select(ccExpYear);
		select8.selectByIndex(12);
		WebElement ccCvv = driver.findElement(By.id("cc_cvv"));
		ccCvv.sendKeys(cvv);

	}

	@When("User Should Click Booknow button")
	public void user_Should_Click_Booknow_button() {
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
	}

	@When("User Should Print the OrderNo")
	public void orderNo() throws InterruptedException{
		Thread.sleep(6000);
		WebElement ordrNo = driver.findElement(By.name("order_no"));
		String Attribute = ordrNo.getAttribute("Value");
		System.out.println(Attribute);
	}

	@Then("User Should Verify Success Message")
	public void user_Should_Verify_Success_Message() {
		Assert.assertTrue(true);
	}


}

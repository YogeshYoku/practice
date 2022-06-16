package org.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Connection.Base;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Sample extends BaseClass {
	//static WebDriver driver;
	@BeforeClass
	public static void startTime() {
		 webdriver();
		enterUrl("https://adactinhotelapp.com/");
		 time();
		}
	@SuppressWarnings("deprecation")
	@Test	
	public  void test() throws  IOException, InterruptedException {
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * driver.get("https://adactinhotelapp.com/");
		 */
		 File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("AdactinHotel");
		
		
        WebElement username = findElementId("username");
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		username.sendKeys(stringCellValue);
		
	     WebElement passwd = findElementId("password");
		Cell cell2 = row.getCell(1);
		String stringCellValue2 = cell2.getStringCellValue();
		passwd.sendKeys(stringCellValue2);
		WebElement loginclick = findElementId("login");
		click(loginclick);
		Assert.assertTrue("loginclick", true);
		WebElement location =findElementId("location");
		Thread.sleep(2000);
		Cell cell3 = row.getCell(3);
		String stringCellValue3 = cell3.getStringCellValue();
		selectByText(location, stringCellValue3);
		WebElement hotels = findElementId("hotels");
		Cell cell4 = row.getCell(4);
		String stringCellValue4 = cell4.getStringCellValue();
		selectByText(hotels, stringCellValue4);
		WebElement room = findElementId("room_type");
		Cell cell5 = row.getCell(5);
		String stringCellValue5 = cell5.getStringCellValue();
		selectByText(room, stringCellValue5);
		WebElement roomnos = findElementId("room_nos");
		Cell cell6 = row.getCell(6);
		CellType cellType = cell6.getCellType();
		//String stringCellValue6 = cellType.toString();
		//Thread.sleep(2000);
		selectByIndex(roomnos,1);
		WebElement adultroom = findElementId("adult_room");
		Cell cell7 = row.getCell(7);
		CellType cellType2 = cell7.getCellType();
		//String stringCellValue7 = cellType2.toString();
		selectByIndex(adultroom, 1);
		WebElement childroom = findElementId("child_room");
		Cell cell8 = row.getCell(8);
		CellType cellType3 = cell8.getCellType();
		//String stringCellValue8 = cellType3.toString();
		selectByIndex(childroom, 1);
		WebElement submit = findElementId("Submit");
		click(submit);
		Assert.assertTrue("submit", true);
		WebElement radiobutton = findElementId("radiobutton_0");
		click(radiobutton);
		WebElement continuebtn = findElementId("continue");
		click(continuebtn);
		WebElement firstname = findElementId("first_name");
		Cell cell9 = row.getCell(9);
		String stringCellValue6 = cell9.getStringCellValue();
		sendKeys(firstname, stringCellValue6);
		WebElement lstname = findElementId("last_name");
		Cell cell10 = row.getCell(10);
		String stringCellValue7 = cell10.getStringCellValue();
		sendKeys(lstname, stringCellValue7);
		WebElement address = findElementId("address");
		Cell cell11 = row.getCell(11);
		String stringCellValue8 = cell11.getStringCellValue();
		sendKeys(address, stringCellValue8);
		WebElement ccnumber = findElementId("cc_num");
		Cell cell12 = row.getCell(12);
		double numericCellValue = cell12.getNumericCellValue();
		BigDecimal b= BigDecimal.valueOf(numericCellValue);
		String num = b.toString();
		sendKeys(ccnumber, num);
		WebElement cctype =findElementId("cc_type");
	    Cell cell13 = row.getCell(13);
	    String stringCellValue9 = cell13.getStringCellValue();
	    selectByText(cctype, stringCellValue9);
	    WebElement ccexpmonth = findElementId("cc_exp_month");
	    Cell cell14 = row.getCell(14);
	    String stringCellValue10 = cell14.getStringCellValue();
	    selectByText(ccexpmonth, stringCellValue10);
	    WebElement ccexpyear = findElementId("cc_exp_year");
	    Cell cell15 = row.getCell(15);
	    CellType cellType4 = cell15.getCellType();
		/*
		 * String string = cellType4.toString(); String stringCellValue11 =
		 * cell15.getStringCellValue();
		 */
	    selectByIndex(ccexpyear,12);
	    WebElement cvv = findElementId("cc_cvv");
	    Cell cell16 = row.getCell(16);
	    double numericCellValue2 = cell16.getNumericCellValue();
	    BigDecimal b1=BigDecimal.valueOf(numericCellValue2);
	    String num1 = b1.toString();
	    sendKeys(cvv, num1);
	    WebElement booknow = findElementId("book_now");
	    click(booknow);
	    Assert.assertTrue("Booked", true);
	    
	   Thread.sleep(5000);
	    WebElement orderno = findElementId("order_no");
	    String attribute = getAttribute(orderno);
	    Thread.sleep(1000);
	    System.out.println(attribute);
	    Cell createCell = row.createCell(17);
	    createCell.setCellValue(attribute);
	    FileOutputStream out=new FileOutputStream(file);
	    workbook.write(out);

		

	}
	@AfterClass
	public static void endTime() {
		time();
	}
				
	}


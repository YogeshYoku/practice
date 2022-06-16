package com.base;


import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	  public static WebDriver driver;
//1.To Get the URL
public static void enterUrl(String url) {
driver.get(url);

}
public void browserLaunch(String url) {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get(url);

}

public void enterText(WebElement element, String text) {
element.sendKeys(text);
}

public static String dataFromExcel(int rowNum, int cellNum) throws IOException, IOException{
	Workbook workbook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\orton\\eclipse-workspace\\TESTNG\\Folder\\DATAS.xlsx")));
return workbook.getSheet("data").getRow(rowNum).getCell(cellNum).getStringCellValue();

}
public static void getDriver(String browserName) {
	switch (browserName) {
	case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "IE":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		break;
	case "Firefox":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		break;
	case "Edge":
		WebDriverManager.firefoxdriver().setup();
		driver=new EdgeDriver();
		break;

	default:
		break;
	}
}


//public static String writeToExcel(WebElement element) throws IOException, IOException{
//	Workbook workbook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\orton\\eclipse-workspace\\TESTNG\\Folder\\DATAS.xlsx")));
//return workbook.write(element);
//
//}




public static String getPropertyValue(String key) throws IOException {
	Properties properties=new Properties();
	String path = System.getProperty("user.dir");
	FileInputStream stream=new FileInputStream(path+"\\src\\test\\resources\\config.properties");
properties.load(stream);	
String value=(String)properties.get(key);
return value;

}

//2.To Close the url
public void close() {
	driver.close();
}
//3.To get the Currenturl
public String currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}
//4.To get the Title
public String title() {
	String title = driver.getTitle();
	return title;
}
//5.To get the CurrentWindowID
public String windowHandle() {
	String windowHandle = driver.getWindowHandle();
	return windowHandle;
}
//6.To Get the allwindowsId
public Set<String> windowHanldles() {
 Set<String> windowHandles = driver.getWindowHandles();
return windowHandles;
}
//7.Manage returns instance of options Interface
public Options manage() {
Options manage = driver.manage();
return manage;
}
//8.
public Window manageWindow() {
	Window window = driver.manage().window();
	return window;

}
//9.maximize it Doesnt Return Anything
public static void maximize() {
	driver.manage().window().maximize();
}
//10.To Close All the Window
public static void quit() {
	quit();
}
//11.findElementByid
public  WebElement findElementId(String attributevalue) {
	WebElement Element = driver.findElement(By.id(attributevalue));
	return Element;
}
//12.findElementByName
public WebElement findElementByName(String attributevalue) {
	WebElement Element = driver.findElement(By.name(attributevalue));
	return Element;
}
//13.findElementByClassName
public WebElement findElementByClassName(String attributevalue) {
	WebElement Element = driver.findElement(By.className(attributevalue));
	return Element;
}
//14.findElementByLinkText
public WebElement findElementByLinkText(String text) {
	WebElement Element = driver.findElement(By.linkText(text));
	return Element;
}
//15.findElementsByTagName
public List<WebElement> findElementsByTagName(String tagname) {
List<WebElement> findElements = driver.findElements(By.tagName(tagname));
return findElements;
}
//16.Navigation
public Navigation navigate() {
	Navigation navigate = driver.navigate();
	return navigate;
}
//17.navigagteBack It doesn't return Anything
public void navigagteBack() {
	driver.navigate().back();
}
//18.navigateForward It doesn't return Anythig
public void navigateForward() {
	driver.navigate().forward();
}
//19.navigateRefresh-It doesn't return Anything
public void navigateRefresh() {
	driver.navigate().refresh();
}
//20.navigateTo
public void navigateTo(String url) {
	driver.navigate().to("String url");
}
//21.switchTo--Used to Locate a Different Frame or Window
public TargetLocator switchTo() {
	TargetLocator switchTo = driver.switchTo();
	return switchTo;
}
//22.switchToAlert---To Handle the Alert
public void switchToAlert() {
	Alert alert = driver.switchTo().alert();
	
}
//23.alertAccept
public void alertAccept() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	
	
}
//24.alertDismiss--It doesn't return anything
public void alertDismiss() {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	
}
//25.alertSendKeys
public void alertSendKeys(String keys) {
Alert alert=driver.switchTo().alert();
alert.sendKeys(keys);
}
//26.clear---To Clear the Text in the WebEelemt
public void clear(WebElement element) {
	element.clear();
}
//27.Click--To Click the WebElement
public void click(WebElement element) {
element.click();
}
//28.getAttribute
public String getAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;
	}
//29.getLocation
public Point getLocation(WebElement element) {
Point location = element.getLocation();
return location;
}
//30.getScreenShot
public Object getScreenShot(WebElement element) {
	Object screenshotAs = element.getScreenshotAs(null);
	return screenshotAs;
}
//31.getSize
public Dimension getSize(WebElement element) {
	Dimension size = element.getSize();
	return size;
}
//32.gettagName
public String gettagName(WebElement element) {
	String tagName = element.getTagName();
	return tagName;
}
//33.getText
public String getText(WebElement element) {
	String text = element.getText();
	return text;
}
//34.isDisplayed
public boolean isDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	return displayed;
}
//35.isEnabled
public boolean isEnabled(WebElement element) {
	boolean enabled = element.isEnabled();
	return enabled;
}
//36.isSelected
public boolean isSelected(WebElement element) {
	boolean selected = element.isSelected();
	return selected;
	}
//40.submit--It doesn't return Anything
public void submit(WebElement element) {
	element.submit();
}
//41.selectById
public void selectByIndex(WebElement element,int index) {
	Select select=new Select(element);
	select.selectByIndex(index);
	
}
//42.selectByValue
public void selectByValue(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByValue(value);
	}
//43.selectByText
public void selectByText(WebElement element,String text) {
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
//44.switchToFrameByIndex
public void switchToFrameByIdex(int index) {
	driver.switchTo().frame(index);
}
//45.switchToFrameByStringName
public void switchToFrameByStringName(String name) {
	driver.switchTo().frame(name);
}
//46.switchToFrameByWebElement
public void switchToFrameByWebElement(WebElement frameelement) {
	driver.switchTo().frame(frameelement);
}
//47.deSelectAll
public void deSelectAll(WebElement element) {
	Select select=new Select(element);
	select.deselectAll();
}
//48.deSelectById
public void deselectById(WebElement element,int id) {
	Select select=new Select(element);
	select.deselectByIndex(id);
	
}
//49.deselectByValue
public void deselectByValue(WebElement element,String value) {
	Select select=new Select(element);
	select.deselectByValue(value);
	
	}
//50.deselectByText
public void deselectByText(WebElement element,String text) {
	Select select=new Select(element);
	select.deselectByVisibleText(text);
	
}
//51.Implicit wait.
public void implicitWait() {
	Timeouts timeouts = driver.manage().timeouts();

}
//52.implicitWaits
public void implicitWaits(int i) {
	Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

}
//53.action
public void Actions() {
Actions action=new Actions(driver);
action.click();
}
//54.Double Click
public void doubleClick(WebElement element) {
	Actions action=new Actions(driver);
	 action.doubleClick(element);
}
//55.rightClick
public void rightClick(WebElement element) {
	Actions action=new Actions(driver);
	 action.contextClick(element);
	
}
//56.dragAndDrop
public void dragAndDrop(WebElement source,WebElement target) {
	Actions action=new Actions(driver);
	action.dragAndDrop(source, target);
}
//57keyDown
public void keyDown(WebElement element) {
	Actions action=new Actions(driver);
	action.keyDown((CharSequence) element);
}
//58.keyUp
public void keyUp(WebElement element) {
	Actions action=new Actions(driver);
	action.keyUp((CharSequence) element);
}

//59.moveToElement
public void moveToElement(WebElement element) {
	Actions action=new Actions(driver);
	action.moveToElement(element);
}

//60.Exist
public boolean Exist(File f) {
	boolean exists = f.exists();
	return exists;
	
}
//61.webdriver
public static void webdriver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

}
//62 newfile
public static  void newFile(String data) {

File file=new File(data);

}
//63.Sendkeys

public void sendKeys( WebElement element, String data) {
	element.sendKeys(data);
	
}

public void sendKeysInt( WebElement element, CharSequence[] data) {
	element.sendKeys(data);
	
}



//64.xpath
public WebElement xpath(String xpathname) {
	WebElement element = driver.findElement(By.xpath(xpathname));
	return element;
	
}
	public WebElement linkText(String xpathname) {
		WebElement element = driver.findElement(By.linkText(xpathname));
		return element;
	}

//65.
public static void time() {
	long currentTimeMillis = System.currentTimeMillis();
	System.out.println(currentTimeMillis);
}
	//66.getData
public String getData(String sheetName,int rowNo,int cellNo) throws IOException {
	String data=null;
	File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book1.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(sheetName);
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	
	CellType cellType = cell.getCellType();
	
	
	switch(cellType) {
	case STRING:
		data=cell.getStringCellValue();
		break;
	case NUMERIC:
		if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
			data = format.format(dateCellValue);
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
			BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
			data = valueOf.toString();
		}
			break;
	default:
		break;
			
		}
		
		
	return data;
	}


public void createNewCell(String sheetName,int rowNo,int cellNo,String data) throws IOException {
File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book1.xlsx");
FileInputStream stream=new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(stream);
Sheet sheet = workbook.getSheet(sheetName);
Row row = sheet.getRow(rowNo);
Cell createCell = row.createCell(cellNo);
createCell.setCellValue(data);
FileOutputStream out=new FileOutputStream(file);
workbook.write(out);
}


}




/*
  public void fileInputStream() throws FileNotFoundException { FileInputStream
  stream=new FileInputStream(file); // TODO Auto-generated method stub
 

public static void main(String[] args) {
	//BaseClass b=new BaseClass();

}

}*/

		
			
package org.fb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Excelpractise2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/");



		Thread.sleep(3000);
		driver.findElement(By.linkText("Signup here")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@name='month']"));
		Select select=new Select(month);

		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		Thread.sleep(3000);

		for (WebElement webElement : options) { 
			String text = webElement.getText();
			System.out.println(text);	

			File file =new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book2.xlsx");
			Workbook workbook= new XSSFWorkbook();
			Sheet createSheet =workbook.createSheet("text"); 
			for (int i = 0; i <options.size(); i++) {
				WebElement webElement2 = options.get(i);
				String text2 = webElement2.getText();
				System.out.println(text2);
				Row createRow = createSheet.createRow(i);
				Cell createCell = createRow.createCell(0); 
				createCell.setCellValue(text2);
				FileOutputStream out=new FileOutputStream(file);
				workbook.write(out);
			}}
	}}
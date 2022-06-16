package org.fb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public void readExcel() throws IOException {
File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book1.xlsx");
FileInputStream stream=new FileInputStream(file);
Workbook workbook =new XSSFWorkbook(stream);
Sheet sheet = workbook.getSheetAt(0);
Iterator<Row> rowIterator = sheet.iterator();
while(rowIterator.hasNext()) {
Row rowvalue = rowIterator.next();	

Iterator<Cell> cellIterator = rowvalue.iterator();
while(cellIterator.hasNext()) {
	Cell cellvalue = cellIterator.next();
	
}

}



	}
public static void main(String[] args) throws IOException {
	
	
	Demo d=new Demo();
	d.readExcel();
	/*
	 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
	 * driver.get("https://www.facebook.com/");
	 */




}
}

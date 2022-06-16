package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee1 {
	
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\orton\\eclipse-workspace\\DataDriven\\Excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Datas");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(13);
	   String stringCellValue = cell.getStringCellValue();
	   System.out.println(stringCellValue);
	   
	   if(stringCellValue.equals("Hello")) {
		   Cell createCell = row.createCell(13);
		  createCell.setCellValue("Hei");
	   }
	  Row row2= sheet.getRow(0);
	   Cell createCell = row2.createCell(14);
	   createCell.setCellValue("Yogesh");
	   Row createRow = sheet.createRow(10);
	   Cell createCell2 = createRow.createCell(0);
	   createCell2.setCellValue("RagaPriya");
	   FileOutputStream out=new FileOutputStream(file);
	   workbook.write(out);
		
	}

}

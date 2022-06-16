package org.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass1 {
	
		
	public void writeData(String sheetName,int rowNo,int cellNo,String data) throws IOException {
		File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book2.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
        Cell createCell = row.createCell(cellNo);
        createCell.setCellValue(data);
        FileOutputStream out=new FileOutputStream(file);
        workbook.write(out);
		
	}
public static void main(String[] args) throws IOException {
		BaseClass1 b=new BaseClass1();
		//b.writeData("yogesh", 0, 1, "Hello");
		
	}
	

}

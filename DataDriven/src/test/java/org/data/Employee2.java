package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee2 {
	
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\orton\\eclipse-workspace\\DataDriven\\Excel\\Yogesh.xlsx");
		//FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook();
	Sheet createSheet = workbook.createSheet("Yogesh");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Yogesh & RagaPriya");
	FileOutputStream out=new FileOutputStream(file);
	workbook.write(out);
	
		
	}

}

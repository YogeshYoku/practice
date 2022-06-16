package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {
	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\orton\\eclipse-workspace\\DataDriven\\Excel\\Book1.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Datas");
	Row row = sheet.getRow(1);
	System.out.println(row);
	Cell cell = row.getCell(1);
	System.out.println(cell);
	//CellType cellType = cell.getCellType();
	//System.out.println(cellType);
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	System.out.println(physicalNumberOfCells);
	for (int i = 0; i <physicalNumberOfRows; i++) {
		
		Row row2 = sheet.getRow(i);
	System.out.println();
	for (int j = 0; j < physicalNumberOfCells; j++) {
		Cell cell2 = row.getCell(j);
		System.out.println(cell2);
		
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell2)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyy");
				format.format(dateCellValue);
				System.out.println(format);
			}else {
			double numericCellValue = cell.getNumericCellValue();
			BigDecimal bigdecimal = BigDecimal.valueOf(numericCellValue);
		String string = bigdecimal.toString();
		System.out.println(string);
				}
		default:
			break;
			}
			

		
		}
	}
	
	}
	
	
	}
	


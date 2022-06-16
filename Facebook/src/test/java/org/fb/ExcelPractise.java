package org.fb;

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
public class ExcelPractise {
public static void main(String[] args) throws IOException {
File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book1.xlsx");
FileInputStream stream=new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(stream);
Sheet sheet=workbook.getSheet("Datas");
Row row = sheet.getRow(3); 
//Cell cell = row.getCell(1);
//System.out.println(cell); 
int physicalNumberOfRows =sheet.getPhysicalNumberOfRows(); 
System.out.println(physicalNumberOfRows);
int physicalNumberOfCells = row.getPhysicalNumberOfCells();
System.out.println(physicalNumberOfCells); 
for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			 Row row2 = sheet.getRow(i);
			 System.out.println();
			 for(int j=0;j<row2.getPhysicalNumberOfCells();j++) {
				 Cell cell2 = row2.getCell(j);
				 System.out.println(cell2);
				 /*CellType type=cell2.getCellType();
				 switch(type) {
					case STRING:
						String stringCellValue = cell2.getStringCellValue();
						System.out.println(stringCellValue);
						break;
					case NUMERIC:
						if(DateUtil.isCellDateFormatted(cell2)) {
							Date dateCellValue = cell2.getDateCellValue();
							SimpleDateFormat format=new SimpleDateFormat("dd-mm-yy");
							String format2 = format.format(dateCellValue);
							System.out.println(format2);
							
						}else {
							double numericCellValue = cell2.getNumericCellValue();
							BigDecimal b= BigDecimal.valueOf(numericCellValue);
							String num = b.toString();
							System.out.println(num);
						}
						
						default:
						break;
			}
		
				
						 		 }
		 
		 

		 

		 }

*/
}

}}}
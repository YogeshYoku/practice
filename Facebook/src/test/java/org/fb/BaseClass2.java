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

public class BaseClass2 {
	
	public void updateData(String sheetName,int rowNo,int cellNo,String olddata,String newData) throws IOException {
		File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book2.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook("text1");
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String Value = cell.getStringCellValue();
		if (Value.equals(olddata)) {
			 cell.setCellValue(newData);
		}
FileOutputStream out=new FileOutputStream(file);
workbook.write(out);
		}

}

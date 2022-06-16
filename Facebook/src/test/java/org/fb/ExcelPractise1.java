package org.fb;
import java.awt.Window.Type;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.print.DocFlavor.STRING;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelPractise1 {
public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\orton\\eclipse-workspace\\Facebook\\ExcelFile\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet("Datas");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			System.out.println();
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				CellType type=cell.getCellType();
						switch(type) {
						case STRING:
							String stringCellValue = cell.getStringCellValue();
							System.out.println(stringCellValue);
							break;
						case NUMERIC:
							if(DateUtil.isCellDateFormatted(cell)) {
								Date dateCellValue = cell.getDateCellValue();
								SimpleDateFormat format=new SimpleDateFormat("dd-MM-yy");
								String format2 = format.format(dateCellValue);
								System.out.println(format2);

							}else {
								double numericCellValue = cell.getNumericCellValue();
								BigDecimal b= BigDecimal.valueOf(numericCellValue);
								String num = b.toString();
								System.out.println(num);
							}

						default:
							break;
						}}

		}}}

					
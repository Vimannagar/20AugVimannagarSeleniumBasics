package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	
	
	

	public static void main(String[] args) throws IOException {

//		String path = "F:\\Desktop\\VimanNagar\\20 Aug\\VimannagarTestData.xlsx";
		
		String path= System.getProperty("user.dir")+"\\VimannagarTestData.xlsx";

		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugBatch");

//		read the value from row and column

//		String value = sh1.getRow(5).getCell(0).getStringCellValue();
		
		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(sh1.getRow(5).getCell(0));

		System.out.println(value);
		
		int numberofrows = sh1.getLastRowNum();
		
		System.out.println("total number of row are :"+numberofrows);
		
		
		int totalcolumncount = sh1.getRow(0).getLastCellNum();
		
		System.out.println("Total number of column are :"+totalcolumncount);
		
		

		
	}

}

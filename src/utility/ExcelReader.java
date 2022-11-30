package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static void writeData() throws IOException
	{
		String path= System.getProperty("user.dir")+"\\VimannagarTestData.xlsx";

		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugBatch");
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
//		Creating a new row as it doesn't have the data already available
		
		sh1.createRow(22).createCell(2).setCellValue("Test to write data");
		
		sh1.getRow(5).getCell(1).setCellValue("existing row adnd column");
		
		wb.write(fos);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String readData(int row, int column) throws IOException
	{
		String path= System.getProperty("user.dir")+"\\VimannagarTestData.xlsx";

		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugBatch");

		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(sh1.getRow(row).getCell(column));

		System.out.println(value);
		
		int numberofrows = sh1.getLastRowNum();
		
		System.out.println("total number of row are :"+numberofrows);
				
		int totalcolumncount = sh1.getRow(0).getLastCellNum();
		
		System.out.println("Total number of column are :"+totalcolumncount);
		
		
		return value;
	}
	
	
	
	
	
	
	
	
	
	
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
		
		
		writeData();
		
		

		
	}

}

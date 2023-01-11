package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	
	@DataProvider(name = "testdata")
	public static String [][] dpTest() throws IOException
	{
		String path= "C:\\Users\\DELL\\Desktop\\DPTestdata.xlsx";

		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);

		DataFormatter df = new DataFormatter();
		
	int numberofrows = sh1.getLastRowNum();
		
		System.out.println("total number of row are :"+numberofrows);
				
		int totalcolumncount = sh1.getRow(0).getLastCellNum();
		
		System.out.println("Total number of column are :"+totalcolumncount);
		
		String [][] data = new String [numberofrows+1][totalcolumncount];
		
		for(int i=0; i<=numberofrows; i++)
		{
			for(int j=0; j<totalcolumncount; j++ )
			{
		data [i][j]	= df.formatCellValue(sh1.getRow(i).getCell(j));
			}
		}
		
		return data;
		
	}

}

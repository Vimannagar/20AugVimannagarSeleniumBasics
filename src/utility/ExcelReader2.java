package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {
	
	
	public static void main(String[] args) throws IOException {
//		String path = "F:\\Desktop\\VimanNagar\\20 Aug\\VimannagarTestData.xlsx";
		
		String path= "C:\\Users\\DELL\\Desktop\\TestDataVimannagar.xlsx";

		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

//		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		XSSFSheet sh1 = wb.getSheetAt(0);

//		read the value from row and column

//		String value = sh1.getRow(5).getCell(0).getStringCellValue();
		
		DataFormatter df = new DataFormatter();
		
		
		
		int rowcount = sh1.getLastRowNum();//LastRowNum method will always return the max index value of the row
		
		int columncount = sh1.getRow(0).getLastCellNum();// actual column count
		
		for(int i=0; i<=rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
				String value = df.formatCellValue(sh1.getRow(i).getCell(j));
				System.out.print(value+" ");
			}
			
			System.out.println();
			
			
			
			
		}
	}

}

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
		
		String path= System.getProperty("user.dir")+"\\VimannagarTestData.xlsx";

		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugBatch");

//		read the value from row and column

//		String value = sh1.getRow(5).getCell(0).getStringCellValue();
		
		DataFormatter df = new DataFormatter();
		
		
		
		int rowcount = sh1.getLastRowNum();
		
		int columncount = sh1.getRow(0).getLastCellNum();
		
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

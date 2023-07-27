package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//Read Data From IPL Sheet

		//Implementation of read the data ftom excel
		//Read multiple values value or data from excel sheet by using for loop
  for(int i = 3;i<=12;i++)
  {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//Provide path of file

		Workbook wb = WorkbookFactory.create(fis);//make file ready to read
		Sheet sheet = wb.getSheet("IPL"); //Get into the Sheet
		Row row = sheet.getRow(i);//Get into desire row
		Cell cell = row.getCell(1); //get into desire cell or column
		String data = cell.getStringCellValue(); //Read value from cell
		Thread.sleep(2000);
		System.out.println(data);
		
  }

	}

}

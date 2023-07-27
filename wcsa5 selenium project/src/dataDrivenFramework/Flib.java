package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	
		// to Store generic reusable methods 
		// all the methods are non static
		public String readExcelData (String excelpath, String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException  {
			
			FileInputStream fis = new FileInputStream(excelpath);//provide path of file
			Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet =wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
		
		}
		
  public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
	  FileInputStream fis =new FileInputStream(excelPath);
	Workbook wb= WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet(sheetName);
	int rc = sheet.getLastRowNum();
	return rc;
  }
  
  public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount, String data) throws EncryptedDocumentException, IOException {
	  
	    FileInputStream fis = new FileInputStream(excelPath);//Provide path of the file
	     Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
	    Sheet sheet = wb.getSheet(sheetName);//get into the sheet
	  Row row = sheet.getRow(rowCount);//pass the row count
	 Cell cell = row.createCell(cellCount);//pass the cell count
	 cell.setCellValue(data);//pass the String argument as data
	 
	 FileOutputStream fos = new FileOutputStream(excelPath);
	 wb.write(fos);
	    
  }

 
}
  
	
  


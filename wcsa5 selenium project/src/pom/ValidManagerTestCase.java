package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidManagerTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		
		
		 LoginPage lp = new LoginPage(driver);
		 HomePage hp = new HomePage(driver);
		 UsersPage up = new UsersPage(driver);
		 
		 WorkLib worklib = new WorkLib();
		 
		 //perform valid login
		 
		 lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		 
		 //click on user Module
		 
		  hp.cliclOnUserModule();
		  
		  //create manager
		 up.createManager(flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0), flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1), flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2), flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3));
		 
		 //Delete user
		 up.deleteManager();
		 worklib.handleConfirmationPopup();
		 
		 Thread.sleep(1000);
		 
		 bt.tearDown();
		 
		 

	}

	
}

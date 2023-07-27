package practicePom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateUserTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		 practicePom.BaseTest bt = new practicePom.BaseTest();
			bt.setUp();
			practicePom.Flib flib = new practicePom.Flib();
			LoginPage lp = new LoginPage(driver);
			Homepage hp = new Homepage(driver);
			DropdownPage dp = new DropdownPage();
		UserManagementPage um = new UserManagementPage(driver);
		
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		hp.clickOnAdmin();
		um.getAddElement().click();
		
		um.createUser(flib.readExcelData(EXCEL_PATH, "userdata", 1, 0), flib.readExcelData(EXCEL_PATH, "userdata", 1, 1), flib.readExcelData(EXCEL_PATH, "userdata", 1, 2), flib.readExcelData(EXCEL_PATH, "userdata",1,2));
	    um.getSaveButton().click();
	   
	
	}

}

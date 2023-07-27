package pom;

import java.io.IOException;

public class validLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();
		
		//to call the webelements of login page
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"), flib.readPropertyData(PROP_PATH, "Password"));
		
		//useHomepage elements create object of Homepage
		 HomePage hp = new HomePage(driver);
		 hp.clickOnLogoutLink();
		 
	}

}

package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://hp/login.do");
		 
		 //read the data from excel file and test the login page
		Flib flib = new Flib();
		//String validUsername = flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 0);
	   // String validPassword = flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 1);

	    
	    driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 0));
	    driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 1));
	    driver.findElement(By.id("loginButton")).click();
	}

}

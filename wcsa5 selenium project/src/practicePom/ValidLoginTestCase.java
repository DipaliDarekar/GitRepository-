package practicePom;

import java.io.IOException;

import org.openqa.selenium.By;

import keywordDrivenFramework.BaseTest;
import keywordDrivenFramework.Flib;

public class ValidLoginTestCase extends practicePom.BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
	  practicePom.BaseTest bt = new practicePom.BaseTest();
		bt.setUp();
		practicePom.Flib flib = new practicePom.Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "Username"));
		driver.findElement(By.name("password")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
        Thread.sleep(2000);
		
		bt.tearDown();

	}

}

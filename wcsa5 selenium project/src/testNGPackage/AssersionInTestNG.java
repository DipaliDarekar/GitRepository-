package testNGPackage;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssersionInTestNG {

@Test
	
public void verificationMethod() throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://hp/login.do");
		String actualTitle = driver.getTitle();
		//Critical Feature
		//if (driver.getTitle().equalsIgnoreCase(actualTitle)) {
			//driver.findElement(By.name("username")). sendKeys("admin");
			//driver.findElement(By.name("pwd")). sendKeys("manager");
			//driver.findElement(By.id("loginButton")).click();
		//	System.out.println("Title  match  Testcase pass");
			
		//}
		//else {
		//	System.out.println("Title not match  Testcase Fail");
		//}
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), actualTitle);
		driver.findElement(By.name("username")). sendKeys("admin");
		driver.findElement(By.name("pwd")). sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Title  match  Testcase pass");
		sa.assertAll();
		
		//Critical festure
		//if (driver.getTitle().equalsIgnoreCase("title") ) {
			
		//	System.out.println(" Home pageTitle  match  Testcase pass");
		//}
		//else {
			//System.out.println("Title not match  Testcase Fail");
		//}
	  String actualTitleHomePage = driver.getTitle();
	  Assert.assertEquals(driver.getTitle(), actualTitleHomePage);
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Logout")).click();
		
	
	
	}

}

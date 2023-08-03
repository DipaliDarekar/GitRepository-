package testNGAnnotation_Flags;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class OrangeHRMDataprovider {
  @Test(dataProvider = "testData")
  public void orangehrmlogin(String usn, String pass) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.name("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(1000);
	  driver.quit();
	  
  }

  @DataProvider
  public Object[][] testData() {
     Object[][] testData = new Object[1][2];
     testData [0][0]="Admin";
     testData[0][1]="admin123";
	return testData;
     
  }
}

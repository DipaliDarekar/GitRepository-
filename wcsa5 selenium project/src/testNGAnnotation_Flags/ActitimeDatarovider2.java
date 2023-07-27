package testNGAnnotation_Flags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeDatarovider2 {
  @Test(dataProvider = "actitimeData")
  public void invalidLoginMethod(String usn,String pass) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://hp/login.do");
		 
		 driver.findElement(By.name("username")).sendKeys(usn);
		 driver.findElement(By.name("pwd")).sendKeys(pass);
		 driver.findElement(By.id("loginButton")).click();
		 
		 driver.findElement(By.name("username")).clear();
		 	
  }
  
  @DataProvider(name="actitimeData")
  public Object[][] testData() {
	 Object[][] testData1 = new Object[5] [2];
	 testData1 [0] [0]="ad-min";
	 testData1 [0] [1]="manager";
	 
	 testData1 [1] [0]="manager";
	 testData1 [1] [1]="admin";
	 
	 testData1 [2] [0]="@admin";
	 testData1 [2] [1]="@manager";
	 
	 testData1 [3] [0]="admin123";
	 testData1 [3] [1]="manager123";
	 
	 testData1 [4] [0]="123admin";
	 testData1 [4] [1]="123manager";
	 
	 return testData1;
	 
	 
    
  }
}

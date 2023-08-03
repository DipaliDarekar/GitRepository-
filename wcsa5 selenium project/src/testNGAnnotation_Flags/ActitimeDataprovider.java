package testNGAnnotation_Flags;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ActitimeDataprovider {
  @Test(dataProvider = "testData")
  public void f(String username, String password) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("http://hp/login.do");
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();
	  driver.quit();
	  
	  
	  
  }

  @DataProvider//(name="actitimeData")
  public Object[][] testData() {
	 Object[][] testData = new Object[1] [2];
	 testData [0] [0]="admin";
	 testData [0] [1]="manager";
	 
	
	 
	 return testData;
	 
	 
    
  }
}

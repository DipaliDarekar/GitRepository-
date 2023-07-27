package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void method3() {
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.google.co.in/");
		 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		 driver.quit();
		 Reporter.log("This is TestNG from Remo1 !!!!", true);
  }
}

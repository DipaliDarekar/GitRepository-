package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void method2() {
	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.google.co.in/");
		 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		 driver.quit();
		 Reporter.log("This is TestNG from Remo1 !!!!", true);
  }
}

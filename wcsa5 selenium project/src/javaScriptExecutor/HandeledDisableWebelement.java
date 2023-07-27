package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandeledDisableWebelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/Disable2.html");
          //Identify webelement
          driver.findElement(By.id("i1")).sendKeys("admin");
         // driver.findElement(By.id("i2")).sendKeys("manager");
          //handele webelement
          JavascriptExecutor jse = (JavascriptExecutor) driver;
          jse.executeScript("alert('hello there');");
          
          Thread.sleep(1000);
          driver.switchTo().alert().accept();
          jse.executeScript("document.getElementById('i2').value='manager'");
          
	}

}

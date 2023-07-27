package popupHandling;

import java.awt.AWTException;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;



public class Alertpopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/Popup.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		 Alert al = driver.switchTo().alert();
		 
		 al.accept();
		
                
		 
		 

	}

}
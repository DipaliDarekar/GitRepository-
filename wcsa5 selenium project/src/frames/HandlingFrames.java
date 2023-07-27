package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.bluestone.com/");
	 //Handle hidden division popup
	 driver.findElement(By.id("denyBtn")).click();
	 Thread.sleep(2000);
	 WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
	 
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster ']"))).click();
	 //handle frame by using switch to 
	 //driver.switchTo().frame("fc_widget");//using name or id
	 driver.switchTo().frame(frameElement);
	driver.findElement(By.id("chat-icon")).click();
	 
	 Thread.sleep(2000);
	 driver.switchTo().defaultContent();
	 
	 driver.findElement(By.id("chat-fc-name")).sendKeys("DipaWalunj");
	 driver.findElement(By.id("chat-fc-email")).sendKeys("dipa1@gmail.com");
	 driver.findElement(By.id("chat-fc-phone")).sendKeys("8888888888");
	// driver.findElement(By.xpath("//a[@class='fc-button']")).click();
	 
	 driver.findElement(By.xpath("//span[text()='X']")).click();
	 
	 
	} 
}

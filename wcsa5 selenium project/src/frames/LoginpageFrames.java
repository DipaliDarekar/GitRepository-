package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/Logon%20page.html");
		 driver.findElement(By.id("i1")).sendKeys("dips");
		 Thread.sleep(1000);
		 driver.findElement(By.id("i1")).clear();
		WebElement frame = driver.findElement(By.xpath("//iframe[@frameName='frameName']"));
				
		 driver.switchTo().frame(frame);
		 driver.findElement(By.id("i2")).sendKeys("1235dipa");
	      Thread.sleep(2000);
	      
		
		
	}

}

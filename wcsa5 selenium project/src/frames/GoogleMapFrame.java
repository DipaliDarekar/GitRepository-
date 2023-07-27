package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapFrame {																																																				

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          driver.get("https://www.google.co.in/");
          
          driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
         // driver.findElement(By.xpath("//a[@class='gb_d']")).click();
          driver.switchTo().frame("yDmH0d");
          driver.switchTo().defaultContent();
          driver.findElement(By.id("//span[text()='Maps']")).click();
          
          
          
         // driver.findElement(By.id("yDmH0d")).click();
	}

}

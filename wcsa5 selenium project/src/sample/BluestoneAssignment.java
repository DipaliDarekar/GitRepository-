package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(2000);
	   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	     //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon']")));
	    		 
	    driver.switchTo().frame("chat-icon"); 
		 
		 driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		 driver.findElement(By.id("chat-fc-name")).sendKeys("DipaWalunj");
		 driver.findElement(By.id("chat-fc-email")).sendKeys("dipa1@gmail.com");
		 driver.findElement(By.id("chat-fc-phone")).sendKeys("8888888888");
		 driver.findElement(By.xpath("//a[@class='fc-button']")).click();

	}

}

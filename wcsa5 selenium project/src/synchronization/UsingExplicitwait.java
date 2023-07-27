package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 
		 driver.get("https://www.shoppersstack.com/");
		 driver.findElement(By.xpath("//a[@name='women']")).click();
		 
		driver.findElement(By.xpath("//a[text()='Shorts & Skirts']")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Shorts & Skirts']"))).click();
		driver.findElement(By.xpath("//button[@name='Add To Cart']")).click();
		driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__gWfky']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
		 
	
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//input[@id='Check Delivery']\""))).click();
		 
		 //  ExpectedConditions class To provide condition for until method
		 
		 
	}

} 

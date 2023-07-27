package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDependentandIndependent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Processor']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Brand']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='HP']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='HP 14s Intel Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14s - dy2508TU Thin and Light Laptop']/../..//div[text()='₹39,990']")).click();
		 
		 
		 

	}

}

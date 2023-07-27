package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//div[text()='Processor']")).click();
		 //Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i9']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Brand']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		 //Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 10']")).click();
		// Thread.sleep(2000);
		 
		 
		 

	}

}

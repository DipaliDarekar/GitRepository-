package sample;

import java.time.Duration;
import java.util.Set;

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
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("samsung mobile");
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']")).click();
		String parentHandle = driver.getWindowHandle();
		 Set<String> allHandles = driver.getWindowHandles();
         //Read address by using looping statement
         
		 for(String wh:allHandles) {
		    	Thread.sleep(3000);
		    	if (!parentHandle.equals(wh)) {
		    		
					driver.switchTo().window(wh);
				
				}
		    }
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		 driver.findElement(By.xpath("//button[text()='Enter Delivery Pincode']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("411033");
		 driver.findElement(By.xpath("//div[text()='Submit']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='Remove']")).click();
		 driver.findElement(By.xpath("//div[text()='Remove']")).click();
		 
         
	}
}

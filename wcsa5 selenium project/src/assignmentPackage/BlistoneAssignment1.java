package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlistoneAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(2000);
		 WebElement target = driver.findElement(By.xpath("//span[text()='Offers ']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(target).perform();
		 driver.findElement(By.xpath("//span[text()='25% Off your first Gold Mine installment']")).click();
		 
		 if (driver.findElement(By.xpath("//strong[text()='25% DISCOUNT ']")).isDisplayed()) {
			 driver.quit();
			
		}
		 else {
			 System.out.println("Exception!!");
		 }

	}

}

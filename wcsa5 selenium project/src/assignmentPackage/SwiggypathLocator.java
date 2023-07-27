package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggypathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();     
		 driver.manage().window().maximize();
		 driver.get("https://www.swiggy.com/");
		 Thread.sleep(2000);
		 //bY USING TEXT FUNCTION
		 driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		 Thread.sleep(2000);
		 //By using unique attribute
		 driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8888888888");
		 Thread.sleep(2000);
		//By using multiple attribute
		 driver.findElement(By.xpath("//input[@type='text' and @name='name']")).sendKeys("dipali");
		 Thread.sleep(2000);
		 //Using contains function
		 driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("dipa@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='a-ayg']")).click();

	}

	
}

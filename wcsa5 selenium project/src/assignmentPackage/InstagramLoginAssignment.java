package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();     
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/accounts/login/");
		 driver.findElement(By.name("username")).sendKeys("dipali@123");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("password")).sendKeys("123");
		 Thread.sleep(2000);
		 
	}

}

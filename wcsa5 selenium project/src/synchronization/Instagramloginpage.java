package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramloginpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dipa@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dipa123");
		 
		 driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@ id ='email']")).sendKeys("dipa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
				}
}

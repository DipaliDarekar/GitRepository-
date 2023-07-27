package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("idontknow");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='_acan _acap _acas _aj1-']")).click();
        Thread.sleep(2000);
	}

}

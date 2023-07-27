package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.instagram.com/accounts/login/");
		 
		 driver.findElement(By.name("username")).sendKeys("Dipa1@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("123dipa");
		 
		WebElement  loginButton= driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		loginButton.submit();
		
		Thread.sleep(2000);
		driver.navigate().to("http://hp/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement Button = driver.findElement(By.id("loginButton"));
		
		 Button.submit();

	}

}

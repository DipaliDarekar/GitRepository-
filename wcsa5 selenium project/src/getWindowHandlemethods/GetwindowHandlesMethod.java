package getWindowHandlemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandlesMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.amazon.com/");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 

	}

}

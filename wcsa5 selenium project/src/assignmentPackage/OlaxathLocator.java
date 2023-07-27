package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlaxathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();     
		 driver.manage().window().maximize();
		 driver.get("https://book.olacabs.com/login?utm_source=book_now_top_right");
		 driver.findElement(By.xpath("//input[@id='phone-number']")).click();
		 Thread.sleep(2000);
		 
	}

}

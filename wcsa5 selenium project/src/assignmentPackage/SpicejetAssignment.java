package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SpicejetAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/profile/sign-in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Signup']")).click();
		Thread.sleep(2000);

	}
}

package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver  driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("Pass the url of web page");
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("Pass the syntactical value")).sendKeys("pass data");
        Thread.sleep(2000);
        String pagetitle = driver.getTitle();
        System.out.println( pagetitle);
	}
	

}

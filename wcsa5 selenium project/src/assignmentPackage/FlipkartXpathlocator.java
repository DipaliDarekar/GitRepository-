package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpathlocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();     
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/search?q=hp%20laptop&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]"));
	   Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
	     Thread.sleep(2000);
	     String pagetitle = driver.getTitle();
	     System.out.println(pagetitle);
	     

	}

}

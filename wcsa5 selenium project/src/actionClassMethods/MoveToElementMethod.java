package actionClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		  
	    	Actions act = new Actions(driver);
		 
	    	 act.moveToElement(target).perform();
	    	 driver.findElement(By.xpath("//a[.='Band']")).click();
	    
	        Thread.sleep(2000);
	    	WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
	    	for(int i=1;i<=2;i++)
	    	{
	    	act.clickAndHold(target2).perform();
	    	}
	    	 
	    	Robot robot = new Robot();
	    	robot.keyPress(KeyEvent.VK_CONTROL);
	    	robot.keyPress(KeyEvent.VK_C);
	    	
	    	robot.keyRelease(KeyEvent.VK_CONTROL);
	    	robot.keyRelease(KeyEvent.VK_C);
	    	
	    	
	    	Thread.sleep(1000);
	    	//driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Filter by");
	    	driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).click();
	    	robot.keyPress(KeyEvent.VK_CONTROL);
	    	robot.keyPress(KeyEvent.VK_V);
	    	
	    	
	    	//robot.keyRelease(KeyEvent.VK_CONTROL);
	    	//robot.keyRelease(KeyEvent.VK_V);
	    
	    	driver.findElement(By.xpath("//input[@name = 'submit_search']")).click();
	    	Thread.sleep(2000);
	    	
	    	
	    	if (driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed()) {
	    		Thread.sleep(2000);
	    		driver.quit();
				
			}
	    	else {
				System.out.println("exception!!!");
			}
	    	

	} 
	

}

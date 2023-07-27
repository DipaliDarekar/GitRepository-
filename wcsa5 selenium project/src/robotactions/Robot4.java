package robotactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//handeled hidden division popup
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		//Move to watch Jewellery
		 Actions act = new Actions(driver);
		 //act.moveToElement(driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"))).perform();
		 WebElement target =  driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
	     act.moveToElement(target).perform();
	
	     driver.findElement(By.xpath("//a[.='Band']")).click();

         Thread.sleep(2000);
         //Click and hold filter by text
	     WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
	    
	    for(int i = 1;i<=2;i++)
	    {
	    	 act.doubleClick(target2).perform();
	    	act.clickAndHold(target2).perform();
	    }
	    
	    //copy filter by
	   Robot robot = new Robot();
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_C);
	   
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   robot.keyRelease(KeyEvent.VK_C);
	   //identify search box
	   driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).click();
	   //paste filter by text
	   robot.keyPress(KeyEvent.VK_CONTROL);
	   robot.keyPress(KeyEvent.VK_V);
	   
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   robot.keyRelease(KeyEvent.VK_V);
	   
	  // driver.findElement(By.xpath("//input[@name = 'submit_search']")).click();
	   //hit enter button
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   //Verify one design display or not
	   
	   if (driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed()) {
   		Thread.sleep(2000);
   		driver.quit();
			
		}
   	else {
			System.out.println("exception!!!");
   	}
	
	

	 
	 
	

	}

}

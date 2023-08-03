package assignmentPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import robotactions.robot1;

public class BlustoneAssignment {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 //wait.until(ExpectedConditions.elementToBeClickable(By.id("denyBtn")))
		 
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']")); 
	    Actions act = new Actions(driver);
	    act.moveToElement(target).perform();
	    driver.findElement(By.xpath("//a[text()='Band']")).click();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	   
	      Robot robot = new Robot();
	      
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_P);
	      Thread.sleep(2000);
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_P);
			 
			 Thread.sleep(2000);
			 
			   TakesScreenshot ts = (TakesScreenshot)driver;
			    File src = ts.getScreenshotAs(OutputType.FILE);
			  File dest = new File("./Sceernshots/Blustone.png");
			  Files.copy(src, dest);
			 
			 
			 robot.keyPress(KeyEvent.VK_TAB);
			 robot.keyRelease(KeyEvent.VK_TAB);
			  
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			 //js.executeAsyncScript("window.ScrollBy(0,500)");
	      
	      
	      
			 driver.quit();

	    
		 
		

	}

}

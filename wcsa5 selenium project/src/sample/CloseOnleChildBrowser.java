package sample;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnleChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("http://omayo.blogspot.com/");
     
      //launch child window
      Thread.sleep(2000);
     WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
     Point elementlocation = childWindow.getLocation();
     int xaxis = elementlocation.getX();
     int yaxis = elementlocation.getY();
     //scroll till open popup link
    JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
     //click on link
     childWindow.click();
     Thread.sleep(2000);
     //Get address of parent window
   String parentHandle = driver.getWindowHandle();
   //get Address  or handle of parent and child window
    Set<String> allHandles = driver.getWindowHandles();
    
    //How to close only child browser
    
    for(String wh:allHandles) {
    	Thread.sleep(3000);
    	if (!parentHandle.equals(wh)) {
    		
			driver.switchTo().window(wh).close();
			break;
		}
    }
     
     

	}

}

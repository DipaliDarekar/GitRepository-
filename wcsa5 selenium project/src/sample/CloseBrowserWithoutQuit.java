package sample;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserWithoutQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://omayo.blogspot.com/");
       WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
       Point elementlocation = childWindow.getLocation();
       int xaxis = elementlocation.getX();
       int yaxis = elementlocation.getY();
       //scroll till open popup link
      JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
       //click on link
       childWindow.click();
       //close all browsers Without using quit
       Thread.sleep(2000);
       
       // driver.quit();
       //Get the handle or address of parent and child window
       
       Set<String> allHandles = driver.getWindowHandles();
       //close the browser by reading  the address of each window
       
       for(String wh:allHandles) {
    	   
     	 //Swithc control to each browser using switch to method
    	  Thread.sleep(2000);
    	   driver.switchTo().window(wh).close();
       }
        

	}

}

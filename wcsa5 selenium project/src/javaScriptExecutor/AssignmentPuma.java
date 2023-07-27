package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPuma {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://in.puma.com/");
          //  System.out.println(driver.findElement(By.xpath("//div[@data-id='ae724115-4fd6-433a-982e-f25ffe7cf76f']")).getLocation());
            //(32,873)
           JavascriptExecutor jse = (JavascriptExecutor) driver;
           //Thread.sleep(1000);
          // jse.executeScript("window.scrollBy(32,873)");
          // driver.findElement(By.xpath("//div[@class='flex flex-col flex-shrink-0 w-full']")).click();
             
            WebElement shoe = driver.findElement(By.xpath("//div[@data-id='ae724115-4fd6-433a-982e-f25ffe7cf76f']"));
            Point loc = shoe.getLocation();
           int xaxis = loc.getX();
            int yaxis = loc.getY();
            jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-300)+")");
                  
	}

}

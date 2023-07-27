package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev/");
		 //To perform Scrolling Operation
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 //Scroll Down
		   jse.executeScript("window.scrollBy(0,1000)");
		   //To perform Scroll up first we have to perform scroll down
		   Thread.sleep(1000);
               jse.executeScript("window.scrollBy(0,-1000)");
	}

}

package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindoHanlesMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.amazon.com/");
		 String parentHandle = driver.getWindowHandle();
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'SAMSUNG Galaxy A14 (128GB, 4GB) 6.6\", Android 13, 5000mAh Battery, 50MP Triple Camera, Dual SIM 4G Volte GSM Unlocked International Model A145M/DS (w/ 256GB SD, Black)')]")).click();
		 
		 Set<String> allHandles = driver.getWindowHandles();
         //Read address by using looping statement
         
		 for(String wh:allHandles) {
		    	Thread.sleep(3000);
		    	if (!parentHandle.equals(wh)) {
		    		
					driver.switchTo().window(wh);
				
				}
		    }
		// driver.findElement(By.xpath("//span[text()='India']")).click();
         //driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")).sendKeys("41103");
         
		
         //Read address by using looping statement
         
        
         driver.findElement(By.xpath("//SPAN[@id='mbc-buybutton-addtocart-1']/descendant::INPUT[@type='submit']")).click();
         driver.findElement(By.xpath("//SPAN[@id='mbc-offer-view-cart-1']/descendant::INPUT[@type='submit']")).click();
         
       Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@value='Delete']")).click();
         driver.quit();
         
         
	}

}


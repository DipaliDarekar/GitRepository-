package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           driver.get("http://omayo.blogspot.com/");
          Actions act = new Actions(driver);
          WebElement uploadbutton = driver.findElement(By.xpath("//input[@id='uploadfile']"));
          act.doubleClick(uploadbutton).perform();
          File file = new File("./autoItPrograms/OmayoFile1.exe");
          String absolutepath = file.getAbsolutePath();
          Thread.sleep(4000);
          Runtime.getRuntime().exec(absolutepath);
          Thread.sleep(4000);
          Runtime.getRuntime().exec(absolutepath);
          Thread.sleep(4000);
          
         
	}
}

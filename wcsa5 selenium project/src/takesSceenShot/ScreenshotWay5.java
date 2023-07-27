package takesSceenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;



public class ScreenshotWay5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/accounts/login/");
	    EventFiringWebDriver ef = new EventFiringWebDriver(driver);
	   File src = ef.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Sceernshots/instagram.png");
	    
		Files.copy(src, dest);
		

	}

}

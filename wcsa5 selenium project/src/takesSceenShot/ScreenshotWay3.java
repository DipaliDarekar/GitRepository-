package takesSceenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {
//By Creating Object Of Browser Specific Classes
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cdriver.get("https://www.selenium.dev/");
		
		File src = cdriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Sceernshots/selenium.png");
		Files.copy(src, dest);
		

	}

}

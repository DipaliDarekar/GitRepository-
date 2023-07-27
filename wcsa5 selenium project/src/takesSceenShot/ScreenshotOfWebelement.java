package takesSceenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ScreenshotOfWebelement {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/MutiSelectDropDown.html");
	
	 WebElement dropdown = driver.findElement(By.id("menu"));
	 File src = dropdown.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Sceernshots/dropdown.png");
	Files.copy(src, dest);
	 
	
}
}

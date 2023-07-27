package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	driver.quit();
	
	
	
	

	

	
		
	}}
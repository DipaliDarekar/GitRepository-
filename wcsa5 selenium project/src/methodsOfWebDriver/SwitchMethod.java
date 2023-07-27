package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver  driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.switchTo().activeElement().sendKeys( "selenium",Keys.ENTER);
	}

}

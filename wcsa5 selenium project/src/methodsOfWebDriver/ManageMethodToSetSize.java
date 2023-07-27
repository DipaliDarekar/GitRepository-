package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        Dimension size = new Dimension(500,400);
        driver.manage().window().setSize(size);
        
	}

}

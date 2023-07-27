package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodAssignment {

	public static void main(String[] args)throws InterruptedException 
	{
	 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 //Thread.sleep(2000);
		 
		 Dimension size = new Dimension(400,500);
		 driver.manage().window().setSize(size);
		 Thread.sleep(2000);
		 
		 Point point = new Point(100, 200);
		 driver.manage().window().setPosition(point);
		 Thread.sleep(2000);
        //driver.close();
	}

}

package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import robotactions.robot1;

public class SpicejetPopuphandling {
static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser value");
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-Notifications");
			driver= new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.spicejet.com/");
			 
			
		}
		else if (browserValue.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe" );
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-Notifications");
			driver= new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.spicejet.com/");
			
			
			
			}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-Notifications");
			driver = new FirefoxDriver(fo);
			// Robot robot = new Robot();
			// robot.keyPress(KeyEvent.VK_TAB);
			// robot.keyRelease(KeyEvent.VK_TAB);
			 
			// robot.keyPress(KeyEvent.VK_ENTER);
			// robot.keyRelease(KeyEvent.VK_ENTER);
			 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.spicejet.com/");
			
		}
		else {
			System.out.println("Enter valid Browser Value");
		}
	}

}

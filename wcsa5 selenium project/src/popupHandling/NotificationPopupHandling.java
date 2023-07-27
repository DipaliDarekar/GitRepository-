package popupHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.netty.util.internal.SystemPropertyUtil;

public class NotificationPopupHandling {
    static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser value!!");
		String browserValue = sc.next();
		
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/?utm_source=webredirect&utm_medium=cpc&utm_campaign=esemytrip");
		}
		else if (browserValue.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			 EdgeOptions eo = new EdgeOptions();
					eo.addArguments("--disable-notifications");
			driver=new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/?utm_source=webredirect&utm_medium=cpc&utm_campaign=esemytrip");	
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			driver=new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/?utm_source=webredirect&utm_medium=cpc&utm_campaign=esemytrip");
			
		}
		else {
			System.out.println("Enter valid Browser!!");
		}

	}

}

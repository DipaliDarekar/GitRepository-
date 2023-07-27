package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeImplicitexplicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
        driver.get("http://hp/login.do");
               String actualpagetitle = driver.getTitle();
               
         if (actualpagetitle.equals("actiTIME - Login")) {
        	 System.out.println("Page title is matched");
        	 driver.findElement(By.name("username")).sendKeys("admin");
        	 driver.findElement(By.name("pwd")).sendKeys("manager");
        	 driver.findElement(By.id("loginButton")).click();
			
		}      
         else {
        	 System.out.println("page title not matched");
         	}
                String actualhomepagetitle = driver.getTitle();
                
                if (actualhomepagetitle.equals("actiTIME - Enter Time-Track")) {
                	System.out.println("Page title is mathced");
                	driver.findElement(By.linkText("Logout")).click();
                	
					
				}
	}

}

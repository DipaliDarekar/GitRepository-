package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();     
		 driver.manage().window().maximize();
		 driver.get("https://www.zomato.com/");
		 //To Click oN Sign up Link
		 
		 driver.findElement(By.linkText("Sign up")).click();
		 driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("afgdg");
         Thread.sleep(2000);
		 driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("afguuudg");
		 
	}

}

package xpathlocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathloctorcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/mypage#mp-login");
		Thread.sleep(2000);
		
	}

}

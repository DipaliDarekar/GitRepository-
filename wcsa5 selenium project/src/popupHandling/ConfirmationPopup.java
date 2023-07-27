package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/confirmationpopup.html");
		 driver.findElement(By.tagName("input")).click();
		 Alert al = driver.switchTo().alert();
		// al.accept();
		// al.dismiss();
		 System.out.println(al.getText());
		 Thread.sleep(2000);
		 al.accept();

	}

}

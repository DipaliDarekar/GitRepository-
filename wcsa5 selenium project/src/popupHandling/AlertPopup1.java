package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/Popup.html");
		 //to generate popup
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 Robot robot = new Robot();
		 Alert al = driver.switchTo().alert();
		 al.accept();
		 al.dismiss();
		 System.out.println(al.getText());
		al.accept();
		 
		 
		 //robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 

	}

}

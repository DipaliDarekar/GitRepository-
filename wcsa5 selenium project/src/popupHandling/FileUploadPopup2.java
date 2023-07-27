package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
          driver.get("http://hp/login.do");
          driver.findElement(By.name("username")).sendKeys("admin");
 		 driver.findElement(By.name("pwd")).sendKeys("manager");
 		 driver.findElement(By.id("loginButton")).click();
 		 driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
 		 driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();	
 		 Thread.sleep(2000);
 		 driver.findElement(By.id("uploadNewLogoOption")).click();
         Actions act = new Actions(driver);
         WebElement uploadbutton = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
         act.doubleClick(uploadbutton).perform();
         File file = new File("./autoItPrograms/ActitimeFileUpload1.exe");
         String absolutepath = file.getAbsolutePath();
         Thread.sleep(4000);
         Runtime.getRuntime().exec(absolutepath);
         Thread.sleep(4000);
         Runtime.getRuntime().exec(absolutepath);

         

	}

}

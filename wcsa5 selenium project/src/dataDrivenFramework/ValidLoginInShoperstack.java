package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidLoginInShoperstack {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Flib flib = new Flib();
         //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
        // wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/orangehrm.xlsx", "validData", 1, 0));
		driver.findElement(By.name("password")).sendKeys(flib.readExcelData("./data/orangehrm.xlsx", "validData", 1, 1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}

package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("Poha");
		List<WebElement> pohasuggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(int i = 0;i<pohasuggestion.size();i++) {
			WebElement element = pohasuggestion.get(i);
			String poha = element.getText();
			Thread.sleep(2000);
			System.out.println(poha);
		}

	}

}

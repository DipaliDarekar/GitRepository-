package dropDownHandlings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/SingleSelectDropdown.html");
		WebElement singleSelectDD = driver.findElement(By.id("menu"));
		//handling dropdown by creating object
		Select sel = new Select(singleSelectDD);
		//Read all option of single select dropdown
		List<WebElement> allops = sel.getOptions();
		//To read list use looping statements

		for(WebElement op : allops) {
			if (op.getText().equals("Pav Bhaji")) {
				Thread.sleep(2000);
				op.click();
				break;

			}
		}



	}

}

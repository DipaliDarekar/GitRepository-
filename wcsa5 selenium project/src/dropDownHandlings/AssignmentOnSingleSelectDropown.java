package dropDownHandlings;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnSingleSelectDropown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/SingleSelectDropdown.html");
		 WebElement singleSelectDD = driver.findElement(By.id("menu"));
		  Select sel = new Select(singleSelectDD);
			//Select the Option From dropdown by using selection method
	               sel.selectByIndex(3);
		          Thread.sleep(2000);
			
			
			//sel.deselectByIndex(3);//get Exception because Deselect method not applicable for single select dropdown

	}

}

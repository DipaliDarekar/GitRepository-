package dropDownHandlings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/MutiSelectDropDown.html");
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		 Select sel = new Select(multiSelectDD);
		  WebElement allops = sel.getWrappedElement();
		   System.out.println(allops.getText());
    //similar to getoptions
		   List<WebElement> ops = sel.getOptions();
			 for (WebElement we:ops) {
				String textOps = we.getText();
				System.out.println(textOps);
				 
			 }
	}

}

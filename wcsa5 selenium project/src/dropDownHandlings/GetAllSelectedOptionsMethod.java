package dropDownHandlings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/MutiSelectDropDown.html");
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		 Select sel = new Select(multiSelectDD);
		 //select multiple options From Dropdown
		 for(int i = 1;i<5;i++) {
			    sel.selectByIndex(i);
			  Thread.sleep(1000);
		  }
		  Thread.sleep(2000);
		  //To read all selected options from dropdown
		  List<WebElement> ops = sel.getAllSelectedOptions();
			// for (WebElement we:ops) {
			//	String textOps = we.getText();
				//System.out.println(textOps);

	//}
		  for(int i = 0;i<ops.size();i++)
		  {
			  System.out.println(ops.get(i).getText());
		  }

	}
}

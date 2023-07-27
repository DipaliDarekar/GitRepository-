package assignmentPackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicates {
	
	 //By Using Hashset
	
	private static final String String = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/multiselectfruits.html");
		 
		 // Identify Dropdown
		    WebElement dropDownElement = driver.findElement(By.id("menu"));
		    
		    //Handle dropdown
		      Select sel = new Select(dropDownElement);
		      
		      HashSet<java.lang.String> hs = new HashSet<String>();
		      
		      // to get all options from dropdown and add into set
		 List<WebElement> allops = sel.getOptions();
		 
		 //To Read optio from dropdown
		 
		 for(int i = 0;i<allops.size();i++)
		 {
			WebElement op = allops.get(i);
			//get text of webelement and add into set
			String value = op.getText();
			
			//add the value into set that means duplicate not allowed 
			// insersion order not maintained
			
			hs.add(value);
			
			  }
		 //Read the value from set
		 for(String element:hs)
		 {
			 Thread.sleep(1000);
			 System.out.println(element);
		 }
		

	}

}

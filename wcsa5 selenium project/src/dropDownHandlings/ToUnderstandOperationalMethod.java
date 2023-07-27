package dropDownHandlings;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/MutiSelectDropDown.html");
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		  
			Select sel = new Select(multiSelectDD);
			//ismultiple Method
			
			//System.out.println(sel.isMultiple());
			boolean result = sel.isMultiple();
			System.out.println(result);
			
			//getOptions Method
			       /* List<WebElement> dropDownOptions = sel.getOptions();
			        for (int i = 0;i<dropDownOptions.size();i++) {
			        	 String options = dropDownOptions.get(i).getText();
			        	 System.out.println(options);
			        	 Thread.sleep(1000);
			        	 
			        }*/
			List<WebElement> ops = sel.getOptions();
			 for (WebElement we:ops) {
				String textOps = we.getText();
				System.out.println(textOps);
				 
			 }
			  
			 //GetfirstOptionSelectedMethod
			 for(int i = 2;i<=4;i++) {
                sel.selectByIndex(i);				
			}
			 String firstOption = sel.getFirstSelectedOption().getText();
			System.out.println("First Selected Option is : "+firstOption);
			 
			
			
			
		  

	}

}


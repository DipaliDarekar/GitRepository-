package dropDownHandlings;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/malhari/Desktop/WCSA5/webelements/MutiSelectDropDown.html");
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		  
		Select sel = new Select(multiSelectDD);
		//To select using Index
		  sel.selectByIndex(1);
		  
		  Thread.sleep(2000);
		  
		//To select using Text
		  sel.selectByVisibleText("MisalPav");
		  
		  Thread.sleep(2000);
		  
		//To select using value
		  sel.selectByValue("v4");
		  
		  Thread.sleep(2000);
		  
		// To Deselect the option  using Index
		  sel.deselectByIndex(2);
		  
		  Thread.sleep(2000);
		  
		  //To Deselect using value
		  sel.deselectByValue("v2");
		  
		  Thread.sleep(2000);
		  
		  //To Deselect using Visible Index
		  sel.deselectByVisibleText("PaniPuri");
		  Thread.sleep(1000);
		  //To Select multiple Options
		  for(int i = 0;i<7;i++) {
			  sel.selectByIndex(i);
			  Thread.sleep(1000);
		  }
		  Thread.sleep(2000);
		  
		 
		  
		  
		  //To Deselect all options
		  
		 // for(int i = 0;i<7;i++) {
		//	  sel.deselectByIndex(i);
		 // }
		  
		  //tO Deselect All option using DeselecAll
		  sel.deselectAll();
		 
	}

}

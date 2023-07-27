package practicePom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserManagementPage extends BaseTest{

	@FindBy(xpath="//button[contains(normalize-space(.),'Add')]")private WebElement addElement;
	@FindBy(xpath="//DIV[@class='oxd-form-row']/DIV/DIV[1]/DIV/DIV[2]/DIV/DIV[1]/DIV[@class='oxd-select-text-input']") private  WebElement userRole;
	@FindBy(xpath="//input[@placeholder='Type for hints...']") private WebElement empTB ;
	@FindBy(xpath="//DIV[@class=\"oxd-select-text oxd-select-text--focus\"]") private WebElement status;
	@FindBy(xpath="//INPUT[@class=\"oxd-input oxd-input--focus\"]") private WebElement usnTB;
	@FindBy(xpath="//INPUT[@class=\"oxd-input oxd-input--focus\"]") private WebElement passTB;
	@FindBy(xpath="//INPUT[@class=\"oxd-input oxd-input--focus\"]") private WebElement confirmPassTB;
	@FindBy(xpath="//button[contains(normalize-space(.),'Save')]") private WebElement saveButton;
	@FindBy(xpath="//button[contains(normalize-space(.),'Cancel')]") private WebElement cancelButton;
			

	public UserManagementPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	


	public WebElement getAddElement() {
		return addElement;
	}


	public WebElement getUserRole() {
		return userRole;
	}


	public WebElement getEmpTB() {
		return empTB;
	}


	public WebElement getStatus() {
		return status;
	}


	public WebElement getusnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getConfirmPassTB() {
		return confirmPassTB;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	
	public void createUser(String empName,String status,String username,String password) throws InterruptedException {
		Thread.sleep(1000);
	   addElement.click();
	   DropdownPage dp = new DropdownPage();
	   dp.dropDown1();
			  
	   empTB.sendKeys("empName");
	   dp.dropDown2();
	 
	  usnTB.sendKeys("username");
	  passTB.sendKeys("password");
	 confirmPassTB.sendKeys("password");
	 saveButton.click();
	 cancelButton.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	   
	   
	   
	   
		
		
	}
	
	
}

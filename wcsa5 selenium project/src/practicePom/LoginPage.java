package practicePom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
	
     @FindBy(name="username") private WebElement usn;
      @FindBy(name="password") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']") private WebElement button;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getUsn() {
		return usn;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getButton() {
		return button;
	}
	
	public void validLoginMethod(String validUsername,String validPassword) {
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		
	    button.click();
		
		
	}

}

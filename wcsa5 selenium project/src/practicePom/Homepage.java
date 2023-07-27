package practicePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//input[@placeholder='Search'] ") private WebElement searchTab;
	@FindBy(xpath="//span[.='Admin']")private WebElement admin;
	@FindBy(xpath="//span[.='PIM']")private WebElement pIM;
	@FindBy(xpath="//span[.='Leave']")private WebElement Leave;
	@FindBy(xpath="//span[.='Time']")private WebElement time;
	@FindBy(xpath="//span[.='Recruitment']")private WebElement Requirement;
	@FindBy(xpath="//a[.='My Info']")private WebElement MyInfoLink;
	@FindBy(xpath="//span[.='Performance']")private WebElement Performance;
	@FindBy(xpath="//A[@href='/web/index.php/dashboard/index']/descendant::SPAN[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")private WebElement	Dashboard; 
	@FindBy(xpath="//a[.='Claim']")private WebElement Claim;
	@FindBy(xpath="//span[.='Buzz']")private WebElement Buzz ;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	

	public WebElement getSearchTab() {
		return searchTab;
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getpIM() {
		return pIM;
	}

	public WebElement getLeave() {
		return Leave;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getRequirement() {
		return Requirement;
	}

	public WebElement getMyInfoLink() {
		return MyInfoLink;
	}

	public WebElement getPerformance() {
		return Performance;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getClaim() {
		return Claim;
	}

	public WebElement getBuzz() {
		return Buzz;
	}
	
	 public void clickOnSearchTab() {
		 searchTab.click();
	 }
	 public void clickOnAdmin() {
		admin.click();
	 }
	 
	 public void clickOnPIM() {
		 pIM.click();
	 }
	 
	 public void clickOnLeave() {
		Leave.click();
	 }
	 
	 public void clickOnTime() {
		time.click();
	 }
	 
	 public void clickOnRequirement() {
		Requirement.click();
	 }
	 
	 public void clickOnMyInfoLink() {
		MyInfoLink.click();
	 }
	 
	 public void clickOnPerformance() {
		Performance.click();
	 }
	 
	 public void clickOnDashboard() {
		 Dashboard.click();
	 }
	 
	 public void clickOnClaim() {
		Claim.click();
	 }
	 
	 public void clickOnBuzz() {
		Buzz.click();
	 }
	 
	 
	

	
}

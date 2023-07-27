package practicePom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownPage extends BaseTest{
 
	 public void dropDown1() {
		 driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//DIV[@class='oxd-form-row']/DIV/DIV[1]/DIV/DIV[2]/DIV/DIV[1]/DIV[@class='oxd-select-text-input']"))));
		 //driver.findElement(By.xpath("//DIV[@class='oxd-form-row']/DIV/DIV[1]/DIV/DIV[2]/DIV/DIV[1]/DIV[@class='oxd-select-text-input']")).click();
	 }
	 
	 public void dropDown2() {
		 driver.findElement(By.xpath("(//DIV[contains(@class,'oxd-select-wrapper')])[2]/DIV/DIV[2]/I")).click();
		 driver.findElement(By.xpath("//DIV[@class='oxd-form-row']/DIV/DIV[3]/DIV/DIV[2]/DIV/DIV[1]/DIV[@class='oxd-select-text-input']")).click();
	 }

}

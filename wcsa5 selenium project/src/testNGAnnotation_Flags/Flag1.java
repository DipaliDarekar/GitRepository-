package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	//It is Used to describe the method or test Case
	
  @Test(description = "Login method")
  public void method1() {
	  Reporter.log("method1 from flag1", true);
  }
  
  
  @Test(description = "Logout method")
  public void method2() {
	  Reporter.log("method2 from flag1", true);
  }
}

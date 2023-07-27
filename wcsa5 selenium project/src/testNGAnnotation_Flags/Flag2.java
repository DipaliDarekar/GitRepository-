package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	//It is used to disable or enable the methods /testCase
  @Test(description = "login method",enabled = true)
  
  public void method1() {
	  Reporter.log("Method1 from flag2", true);
  }
  
  
 @Test(description = "logout method",enabled = true)
  
  public void method2() {
	  Reporter.log("Method2 from flag2", true);
  }
}

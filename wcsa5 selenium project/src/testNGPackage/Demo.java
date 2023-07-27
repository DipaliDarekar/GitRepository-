package testNGPackage;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo {
  @Test
  public void f() {
	// System.out.println("Demo test case");
	  //Reporter.log("Demo testNG class"); //result in report on
	  Reporter.log("Demo testNG class", true); // Result in console and report
	  }
}

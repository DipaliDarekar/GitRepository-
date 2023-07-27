package testNGPackage;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Remo {
  @Test
  public void f() {
	  
	  int i = 2;
	  int j = 12;
	  int b = j/i;
	 Reporter.log("This is Remo TestNG", true);
  }
}

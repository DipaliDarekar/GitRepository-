package testNGPackage;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Sumo {
  @Test
  public void f() {
	  Reporter.log("This is sumo TestNG Class", true);
  }
}

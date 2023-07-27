package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	
  @Test(groups = "Functional TestCase")
  public void ft1() {
	  Reporter.log("ftc1", true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st1() {
	  Reporter.log("stc1", true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it1() {
	  Reporter.log("Itc1", true);
  }
  
  //---------------------------------------------
  @Test(groups = "Functional TestCase")
  public void ft2() {
	  Reporter.log("ftc2", true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st2() {
	  Reporter.log("stc2", true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it2() {
	  Reporter.log("Itc2", true);
  }
  
  //--------------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ft3() {
	  Reporter.log("ftc3", true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st3() {
	  Reporter.log("stc3", true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it3() {
	  Reporter.log("Itc3", true);
  }
  
  
  //----------------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ft4() {
	  Reporter.log("ftc4", true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st4() {
	  Reporter.log("stc4", true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it4() {
	  Reporter.log("Itc4", true);
  }
  
  //----------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ft5() {
	  Reporter.log("ftc5", true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st5() {
	  Reporter.log("stc5", true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it5() {
	  Reporter.log("Itc5", true);
  }
  
  //---------------------------------------
  
  @Test(groups = "Functional TestCase")
  public void ft6() {
	  Reporter.log("ftc6", true);
  }
  
  @Test(groups = "smoke TestCase")
  public void st6() {
	  Reporter.log("stc6", true);
  }
  
  @Test(groups = "Integration TestCase")
  public void it6() {
	  Reporter.log("Itc6", true);
  }
  
  
}

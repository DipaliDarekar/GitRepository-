package testNGAnnotation_Flags;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void method1() {
	  Reporter.log("testAnnotation", true);
	  
  }
  @AfterMethod
  public void method2() {
	  Reporter.log("This is method2 of Aftermethod Annotation", true);
  }
  
  @BeforeMethod
  public void method3() {
	  Reporter.log("This is method 3 of BeforemethodAnnotation", true);
  }
  
  @BeforeClass
  public void method4() {
	  Reporter.log("This is method 4 of BeforeClassAnnotation", true);
  }
  
  @AfterClass
  public void method5() {
	  Reporter.log("This is method5 of AfterClassAnnotation", true);
  }
  
  @BeforeSuite
  public void method6() {
	  Reporter.log("This is method 6 of BeforesuiteAnnotation", true);
  }
  @AfterSuite
  public void method7() {
	  Reporter.log("This is method 1 of AfterSuiteAnnotation", true);
  }
  @BeforeTest
  public void method8() {
	  Reporter.log("This is method6 of BeforeTestAnnotation", true);
  }
  @AfterTest
  public void method9() {
	  Reporter.log("This is method 9 of AfterTestAnnotation", true);
  }
  
  @Test
  public void method10() {
	  Reporter.log("TestAnnotation2", true);
  }
}

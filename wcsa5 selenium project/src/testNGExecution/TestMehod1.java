package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMehod1 {
  @Test
  public void testMethod1() {
	 long threadId1 = Thread.currentThread().getId();
	  Reporter.log("Thread Id of Test Method1 : "+threadId1, true);
  }
  
  public void testMethod2() {
	  long threadId2 = Thread.currentThread().getId();
	  Reporter.log("Thread Id of Test Method2 : "+threadId2, true);
  }
}

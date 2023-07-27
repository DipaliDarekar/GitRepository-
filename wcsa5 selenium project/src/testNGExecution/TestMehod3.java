package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMehod3 {
	 @Test
	  public void testMethod5() {
		 long threadId5 = Thread.currentThread().getId();
		  Reporter.log("Thread Id of Test Method5 : "+threadId5, true);
	  }
	  
	  public void testMethod6() {
		  long threadId6 = Thread.currentThread().getId();
		  Reporter.log("Thread Id of Test Method6 : "+threadId6, true);
	  }
}

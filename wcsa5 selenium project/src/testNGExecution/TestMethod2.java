package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	 @Test
	  public void testMethod3() {
		 long threadId3 = Thread.currentThread().getId();
		  Reporter.log("Thread Id of Test Method3 : "+threadId3, true);
	  }
	  
	  public void testMethod4() {
		  long threadId4 = Thread.currentThread().getId();
		  Reporter.log("Thread Id of Test Method4 : "+threadId4, true);
	  }
 }

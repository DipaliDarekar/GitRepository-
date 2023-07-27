package testNGAnnotation_Flags;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ActitimeDataprovider {
  @Test(dataProvider = "actitimeData")
  public void f(String username, String password) {
	  
  }

  @DataProvider(name="actitimeData")
  public Object[][] testData() {
	 Object[][] testData1 = new Object[5] [2];
	 testData1 [0] [0]="ad-min";
	 testData1 [0] [1]="manager";
	 
	 testData1 [1] [0]="manager";
	 testData1 [1] [1]="admin";
	 
	 testData1 [2] [0]="@admin";
	 testData1 [2] [1]="@manager";
	 
	 testData1 [3] [0]="admin123";
	 testData1 [3] [1]="manager123";
	 
	 testData1 [4] [0]="123admin";
	 testData1 [4] [1]="123manager";
	 
	 return testData1;
	 
	 
    
  }
}

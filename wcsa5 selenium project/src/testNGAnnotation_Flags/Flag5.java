package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag5 {
 @Test
  public void loginMethod() {
	   System.out.println("This is used to perform login");
  }
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod() {
	  System.out.println("This is used to create user");
  }
  @Test(dependsOnMethods = "createUserMethod")
  public void logoutMethod() {
	  System.out.println("This is used to perform logout");
  }
}

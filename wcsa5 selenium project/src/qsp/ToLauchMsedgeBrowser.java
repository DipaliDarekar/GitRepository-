package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLauchMsedgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
       new EdgeDriver();
	}

}

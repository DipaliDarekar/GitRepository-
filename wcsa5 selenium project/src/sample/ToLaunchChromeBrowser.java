package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) {
		 // Relative path of driver executable file
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		new ChromeDriver();// Launch Chrome Browser
	}

}

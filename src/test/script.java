package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://neverinstall.com");
	System.out.println(driver.getTitle());
	driver.quit();
	}

}

package Package_01_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro_04_class {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com");
		

	}

}

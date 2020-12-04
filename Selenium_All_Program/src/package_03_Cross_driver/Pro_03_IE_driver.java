package package_03_Cross_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Pro_03_IE_driver {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.ie.driver", "C:\\MY Testing File\\Selenium\\Tools\\IEDriverServer_Win32_3.9.0/IEDriver.exe");
		 
         WebDriver driver= new InternetExplorerDriver(); 
		  
		  driver.get("https://www.facebook.com/");

	}

}

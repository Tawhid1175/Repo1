package Package_01_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro_08_Contains_Xpath {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com");
		
		
		
		 //Basic Syntax
		  //// "//*[contains(@attribute,'value')]"
		  
		  driver.findElement(By.xpath("//*[contains(@class,'_58mt')]")).click();
		  

	}

}

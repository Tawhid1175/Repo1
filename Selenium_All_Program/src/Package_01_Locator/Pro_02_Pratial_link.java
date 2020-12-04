package Package_01_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro_02_Pratial_link {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com");
		 
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	        Thread.sleep(3000);
	        
	          
	       driver.findElement(By.partialLinkText("Cookies")).click();
		

	}

}

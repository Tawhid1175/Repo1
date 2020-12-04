package Package_01_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro_07_CSS {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com");
		 
		//CSS basic structure
	        // "tagname[attribute='value']"
	        
	      driver.findElement(By.cssSelector("input[name='email']")).sendKeys("alam@gamil.com");
	      
	      
	      // syntax #id
			
			driver.findElement(By.cssSelector("#u_0_m")).sendKeys("alam11"); 

	      
	      //basic syntax 
	      // css jodi class hoy , sekhere .
		  //.class

		  driver.findElement(By.cssSelector(".inputtext._58mg._5dba._2ph-")).sendKeys("alam11");
	        

		
	}

}

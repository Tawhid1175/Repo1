package Package_01_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pro_01_ID {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
    
        driver.findElement(By.id("email")).sendKeys("alam@gmail.com");
        Thread.sleep(3000);
        
        driver.findElement(By.id("pass")).sendKeys("1234");
     
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@name='login']")).click();
        

	}

}

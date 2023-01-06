package Jiya3.extract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\anony\\eclipse-workspace\\project3\\drivers\\chromedriver.exe");
 	   driver= new ChromeDriver(); 
 	   driver.get("https://www.facebook.com"); 
 	   
 	   driver.manage().window().maximize();
 	   Thread.sleep(5000);
 	   
 	   
 	   
 	   List<WebElement> Links= driver.findElements(By.tagName("a"));
 	   
 	   for (int i=0; i<Links.size()-1;i++) {
 		   System.out.println(Links.get(i).getAttribute("href"));
 		   
 		  
 	   }
    }
}

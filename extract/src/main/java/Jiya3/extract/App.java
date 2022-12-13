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
 	   driver= new ChromeDriver(); //opening browser
 	   driver.get("https://www.amazon.com"); //navigating to website
 	   
 	   driver.manage().window().maximize();
 	   Thread.sleep(5000);
 	   
 	   
 	   
 	   List<WebElement> Links= driver.findElements(By.tagName("img"));
 	   
 	   for (int i=0; i<Links.size()-1;i++) {
 		   System.out.println(Links.get(i).getAttribute("src"));
 	   }
    }
}

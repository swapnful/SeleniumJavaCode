package FlipBook;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipBookTesting {

	private static final boolean DetailPagePrice = false;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ashidiamonds.com/Flipbook/Bridal2023Book/index.html");
		
		driver.findElement(By.className("cursor_icon")).click();
		
		 Thread.sleep(1000);
		 Thread.sleep(1000);

		WebElement topHeader = driver.findElement(By.xpath("//*[@id=\"fb5-logo\"]/img"));
		if (topHeader.isEnabled())	
		{
			System.out.println("TopHeader is linked and clickable");
	
		}
		else
			System.out.println("TopHeader is not linked");
		 Thread.sleep(1000);
		 
		
		 
		

	     String ParantWindow = driver.getWindowHandle();
	     System.out.println("Parant window is" +ParantWindow);
	     
	     driver.findElement(By.xpath("//body/div[@id='fb5-ajax']/div[@id='fb5']/div[@id='fb5-container-book']/div[@id='fb5-book']/div[@class='turn-page-wrapper']/div/div[@class='even turn-page p1']/div[@class='links']/a[1]/div[1]")).click();
		 Thread.sleep(1000);
	     
	     driver.findElement(By.className("product-btn")).click();
		// driver.findElement(By.id("windowButton")).click();
		 Thread.sleep(1000);
		 Set<String> handles = driver.getWindowHandles();
		 
		 for (String handle: handles)
		 {
		     System.out.println(handle);
		     if(!handle.equals(ParantWindow))
		     {
		    	 
		    	 driver.switchTo().window(handle);
		    	 
		    	 driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
		    		driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
		    		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
		    		driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
		    		Thread.sleep(1000);  Thread.sleep(1000);  
		    	String DetailPagePrice = driver.findElement(By.id("sellpriceforspo")).getText();
	    		Thread.sleep(1000);  Thread.sleep(1000);  

			     System.out.println("Detail page price is" +DetailPagePrice);

		    	 driver.close();
		     }

			 
			 
		 }
		 driver.switchTo().window(ParantWindow);
 		Thread.sleep(1000);  Thread.sleep(1000);  

		 driver.findElement(By.id("v5_lightbox_close")).click();
	     driver.findElement(By.xpath("//body/div[@id='fb5-ajax']/div[@id='fb5']/div[@id='fb5-container-book']/div[@id='fb5-book']/div[@class='turn-page-wrapper']/div/div[@class='even turn-page p1']/div[@class='links']/a[1]/div[1]")).click();
 		Thread.sleep(1000);  Thread.sleep(1000);  

	     String PopupPrice = driver.findElement(By.className("stylePrice")).getText();
	     System.out.println("Detail page price is" +PopupPrice);
	     
	    
	}
	       
	}


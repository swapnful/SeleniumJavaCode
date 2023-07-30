package ASHI;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class marrketing {

	public static void main(String[] args) throws Exception 
	{
	//login
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
	Thread.sleep(1000);  Thread.sleep(2000);  
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
	Thread.sleep(1000);  Thread.sleep(2000);  

	//LIFESTYLE IMAGES

driver.get("https://www.ashidiamonds.com/Marketing/ContentListing.aspx?cntid=9");
Thread.sleep(5000);  

driver.findElement(By.xpath("(//a[@href='https://www.ashidiamonds.com/marketing/socialmedia/jewelrycollection/i-do-bridalcollection.aspx'][normalize-space()='View'])[1]")).click();
Thread.sleep(5000);  

driver.findElement(By.xpath("(//div[@class='overlay'])[1]")).click();


Thread.sleep(5000);  
		 int i = 1;  
		 while(i<=500) {  
		 try {
			
			 String x =" (//i[@class='fa fa-download'])["+i+"]";
			 Thread.sleep(2000);  

			 System.out.println(x);
			 
		 WebElement img = driver.findElement(By.xpath(x));
		 Thread.sleep(5000);  
		 if(img.isEnabled())
		 {
			 System.out.println("image is clickable:");
		 Thread.sleep(4000);  
		 i++;
		 }
		 }
		 catch (Throwable t)
		 {
		 System.out.println("");
		 System.out.println("In catch condition");
		 break;  
		 }

		 System.out.println("out of looop");
		 }    

	
	
	
	}
}

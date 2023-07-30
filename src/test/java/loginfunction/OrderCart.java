package loginfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderCart {
	
	public static void main(String[] args) throws Exception {

		//Login
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
	Thread.sleep(1000);  Thread.sleep(1000);  
	
	//order cart
	driver.findElement(By.id("btnOrderCart")).click();
	
	int i = 0;  
	
	while(i<=20) {   
		try {
	WebElement Remove = driver.findElement(By.xpath("//*[@id=\"OrderCartDetail\"]/div[2]/div[3]/div[3]/ul/li[3]/a"));
	Thread.sleep(1000);  Thread.sleep(1000);  
	System.out.println(i);  
		Thread.sleep(5000);   
	if(Remove.isDisplayed())
	{
	Remove.click();
	Thread.sleep(5000);   
	i++;
	}
		}	
	catch (Throwable t) 
	{
		
		System.out.println("Order cart is empty now");
		String EmptyCart = driver.findElement(By.className("EmptyOrderCart")).getText();
		System.out.println(EmptyCart);
		break;  
	}
	
	System.out.println("out of for loop");
}
}
	}

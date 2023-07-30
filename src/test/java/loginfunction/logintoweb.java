package loginfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintoweb {

	@Test
	
	public void login_test() throws Exception						
	{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
	Thread.sleep(1000);  Thread.sleep(1000);  
	driver.findElement(By.xpath("//input[@id='srchterm']")).sendKeys("208A0FRWG-SM-1.50");
	driver.findElement(By.className("search-mag")).click();
	
	//driver.findElement(By.xpath("//input[@id='srchterm")).clear();
	
	Thread.sleep(1000);  Thread.sleep(1000);  
	driver.findElement(By.className("info_icon")).click();
	//driver.findElement(By.className("img-responsive  ImagechangeListdata ImagechangeListdata_20245")).click();
	 Thread.sleep(1000); 
	String abc= driver.findElement(By.className("STC_SingleValue1")).getText();
	
	System.out.println(abc);
	
	
	String abc2 = driver.findElement(By.className("col-xs-6 col-sm-4 pull-left")).getText();
	System.out.println(abc2);


	//driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");	
			//driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("admin123");
	//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
	//Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	//driver.close();
	

	
}
}
package loginfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderCart2 {
	
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
	
	//Listpage
	driver.findElement(By.id("idjewelerymenu")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/a/div[1]/img")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("AddToCartShopping")).click();
	Thread.sleep(3000);

	//ordercart
	driver.findElement(By.xpath("//a[@class='btn btn-orange btn-block']")).click();
	
	//Inordercart
	Thread.sleep(3000);
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPONumber")).sendKeys("LiveTest-001");
	Thread.sleep(3000);	Thread.sleep(3000);
	Select shippingmethod = new Select(driver.findElement(By.className("form-control textboxbgspo")));
	shippingmethod.selectByValue("FEDEX_ECO");

	
	
	Select shippingaddress = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlShippingAddress")));
	shippingaddress.selectByValue("JEWELRY MARKETING, INC.");

	
}
}

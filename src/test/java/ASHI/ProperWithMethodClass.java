package ASHI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class ProperWithMethodClass {
	
	
	
static void Login() throws InterruptedException
 {
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
	System.out.println("Logged in successfully");
  }


class Car extends ProperWithMethodClass {
 public void RemoveCart()  {
	//Remove order cart
	driver.findElement(By.id("btnOrderCart")).click();
	int k = 1;  
	while(k<=50) {  
	try {
	WebElement Remove = driver.findElement(By.xpath("(//a[@title='Remove'])[1]"));
	Thread.sleep(5000);  
	if(Remove.isDisplayed())
	{
	Remove.click();
	Thread.sleep(4000);  
	k++;
	}
	}
	catch (Throwable t)
	{
	System.out.println("Total styles removed is   :"   +k);
	System.out.println("All Styles removed from Order cart");
	String EmptyCart = driver.findElement(By.className("EmptyOrderCart")).getText();
	System.out.println(EmptyCart);
	break;  
	}
	System.out.println("Style id removed successfully");
	}  
	System.out.println("CartRemove is successfully");
 }
}
 
 public void Data(){
    System.out.println("data is successfully");
 }
 
 public void CartDetail(){
    System.out.println("CartDetail is successfully");
 }
 
public void PlaceOrder(){ 
System.out.println("PlaceOrder is successfully"); 
 }
 
 // Inside main, call the methods on the MyObj object
public static void main(String[] args) throws InterruptedException {
 // Create a MyObj object
ProperWithMethodClass MyObj = new ProperWithMethodClass();    


MyObj.Login();
MyObj.RemoveCart();
MyObj.CartDetail();
MyObj.PlaceOrder();
 }
 }

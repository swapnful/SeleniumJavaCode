package AvalonProject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Personalized {
	@Test
	public void ScriptNN() throws Exception	 {

//login
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver(chromeOptions);
driver.manage().window().maximize();
driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
Thread.sleep(1000);  Thread.sleep(2000);  
driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
Thread.sleep(1000);  Thread.sleep(4000);  


//AttributeSelection

driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
Thread.sleep(7000);
driver.findElement(By.xpath("(//li[@id='14KT'])[1]")).click(); //14KT Box
Thread.sleep(1000);
driver.findElement(By.xpath("(//li[@id='RG'])[1]")).click();  //RG Box
Thread.sleep(1000);
// Create the object of the Select class
Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
// Select the option using the visible text
se.selectByVisibleText("Standard");    //Standard
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='largejewelery'])[1]")).click();  //Large
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testing");  //EnterName
Thread.sleep(1000);
driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click(); //Preview
Thread.sleep(15000);

//VerifyAmountOnDetailPage
String Amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
System.out.println(Amount);
if(Amount.contentEquals("$725"))
{
System.out.println("1 : Amount is correctly showing on detail page");
}
else
System.out.println("1 : Incorrect Amount on detail page");
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[name()='path'])[57]")).click(); //AddToCart
Thread.sleep(1000);

//VerifyAmountOnPopUp
String PopUpAmount = driver.findElement(By.xpath("(//big[normalize-space()='$725'])[1]")).getText();
//System.out.println(PopUpAmount);
if(PopUpAmount.contentEquals("$725"))
{
System.out.println("2 : Amount is correctly showing on PopUp");
}
else
System.out.println("2 : Incorrect Amount on PopUp");
Thread.sleep(500);
driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click(); //View Order Cart
Thread.sleep(4000);

//OrderCartPage
//SearchContext CartText = driver.findElement(By.xpath("(//div[@class='col-sm-1 SrNo1 nopadding paddingTop10 text-center'])[1]")).getShadowRoot();
//System.out.println(CartText);
String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();

//WebElement CartText = driver.findElement(By.xpath("(//div[@class='col-sm-1 SrNo1 nopadding paddingTop10 text-center'])[1]"));
//String ABC = CartText.getAttribute("contenttext");
System.out.println(CartText);
//Thread.sleep(2000);


if(CartText.contains("Name: Testing | 14 KT | Rose Gold"))
{
System.out.println("3 : All Attribute is correct in OrderCart");
}
else
System.out.println("3 : Incorrect Attribute in OrderCart");

driver.quit();
//driver.findElement(By.xpath("")).click();
}
}
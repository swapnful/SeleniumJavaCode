package ASHI;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


//not perfact kahi kahi rukta hai and kabhi chal jata hai 
public class OrderCart3 {

public static void main(String[] args) throws Exception {


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



//Remove order cart

/*driver.findElement(By.id("btnOrderCart")).click();
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
}   */ 

 

//bridals
driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=5&CategoryId=5&CategoryName=Bridals&PCategoryName=Bridals&KeyWord=&CategoryId=5&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Bridals%22%2C%22categoryid%22%3A%225%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676997704787");


Random rn = new Random();

for(int i =1; i < 3; i++)
{
int u= rn.nextInt(4);  

if(u==0)
{
u=4;	
}

String x ="(//*[name()='svg'][@class='icon_cart'])["+u+"]";
Thread.sleep(1000);  

System.out.println(x);

//style
Thread.sleep(6000);  
driver.findElement(By.xpath(x)).click();
Thread.sleep(4000);  
driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
Thread.sleep(3000);  
driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
System.out.println("Style added ");

}


//Stackable Jewelry

driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4006&CategoryId=4557&CategoryName=Bands%20Rings&PCategoryName=Stackable$Jewelry&KeyWord=&CategoryId=4006&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Bands+Rings%22%2C%22categoryid%22%3A%224557%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676642122345");
Random rn1 = new Random();

for(int j =1; j < 3; j++)
{
int d= rn1.nextInt(4);  

if(d==0)
{
d=4;	
}

String y ="(//*[name()='svg'][@class='icon_cart'])["+d+"]";
System.out.println(y);
Thread.sleep(1000); 

//style
Thread.sleep(6000);  
driver.findElement(By.xpath(y)).click();
Thread.sleep(4000);  
driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
Thread.sleep(3000);  
driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
System.out.println("Style added ");

}

//Paper Clip

driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4587&CategoryId=4591&CategoryName=Paper%20Clip&PCategoryName=Trending&KeyWord=&CategoryId=4587&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Paper+Clip%22%2C%22categoryid%22%3A%224591%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676642170506");
Random rn2 = new Random();

for(int p =1; p < 3; p++)
{
int a= rn2.nextInt(4);  

if(a==0)
{
a=4;	
}

String z ="(//*[name()='svg'][@class='icon_cart'])["+a+"]";
System.out.println(z);

//style
Thread.sleep(6000);  
driver.findElement(By.xpath(z)).click();
Thread.sleep(4000);  
driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
Thread.sleep(3000);  
driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
System.out.println("Style added ");

}


//Bracelets & Bangles

driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=9&CategoryId=115&CategoryName=Lariat%20Bracelets&PCategoryName=Bracelets$Bangles&KeyWord=&CategoryId=9&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Lariat+Bracelets%22%2C%22categoryid%22%3A%22115%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676641711856");
Random rn3 = new Random();

for(int h =1; h < 3; h++)
{
int b= rn3.nextInt(4);  

if(b==0)
{
b=4;	
}

String e ="(//*[name()='svg'][@class='icon_cart'])["+b+"]";
System.out.println(e);

//style
Thread.sleep(5000);  
driver.findElement(By.xpath(e)).click();
Thread.sleep(3000);  
driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
Thread.sleep(3000);  
driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
System.out.println("Style added ");

}




/*  //SPO
driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=16017&CategoryId=");
Thread.sleep(4000);  
driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
System.out.println("SPO Style added "); 

driver.findElement(By.id("btnOrderCart")).click();
//Detail ordercart
Thread.sleep(3000);  
driver.findElement(By.xpath("(//input[@id='ctl00_ContentPlaceHolder1_txtPONumber'])[1]")).sendKeys("LiveTest-001");
Thread.sleep(2000);  
driver.findElement(By.xpath("(//textarea[@id='ctl00_ContentPlaceHolder1_txtOrderComment'])[1]")).sendKeys("This is Test order from live website, Please ignore this");
Thread.sleep(2000);  
Select method = new Select(driver.findElement(By.xpath("(//select[@id='dropshippingmethod'])[1]")));
method.selectByValue("FEDEX_ECO");
Thread.sleep(2000);  
Select address = new Select(driver.findElement(By.xpath("(//select[@id='ctl00_ContentPlaceHolder1_ddlShippingAddress'])[1]")));
address.selectByValue("CARTJA            ");

//Shipping Method
Thread.sleep(2000);  
driver.findElement(By.xpath("(//input[@id='Mob_FEDEX_ECO'])[1]")).click(); */



System.out.println("Ho gya pura");


}}

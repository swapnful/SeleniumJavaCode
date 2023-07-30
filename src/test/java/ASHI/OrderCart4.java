package ASHI;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderCart4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		
		
		Random ML = new Random();

		for(int a=1; a<3; a++)
		{
			int M=ML.nextInt(6);  
	
			if(M==0)
			{
				//bridals
				driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=5&CategoryId=5&CategoryName=Bridals&PCategoryName=Bridals&KeyWord=&CategoryId=5&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Bridals%22%2C%22categoryid%22%3A%225%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676997704787");
	
	
				Random rn = new Random();
	
				for(int BS=1; BS<3; BS++)
				{
				int BS1=rn.nextInt(4);  
	
				if(BS1==0)
				{
				BS1=4;	
				}
	
				String BS2="(//*[name()='svg'][@class='icon_cart'])["+BS1+"]";
				Thread.sleep(1000);  
	
				System.out.println(BS2);
	
				//style
				Thread.sleep(6000);  
				driver.findElement(By.xpath(BS2)).click();
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style added ");
	
				}
			
			}
			
			
			if(M==1)
			{
				//Stackable Jewelry
	
				driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4006&CategoryId=4557&CategoryName=Bands%20Rings&PCategoryName=Stackable$Jewelry&KeyWord=&CategoryId=4006&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Bands+Rings%22%2C%22categoryid%22%3A%224557%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676642122345");
				Random rn1 = new Random();
	
				for(int SJ=1; SJ<3; SJ++)
				{
				int SJ1=rn1.nextInt(4);  
	
				if(SJ1==0)
				{
				SJ1=4;	
				}
	
				String SJ2 ="(//*[name()='svg'][@class='icon_cart'])["+SJ1+"]";
				System.out.println(SJ2);
				Thread.sleep(1000); 
	
				//style
				Thread.sleep(6000);  
				driver.findElement(By.xpath(SJ2)).click();
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style added ");
	
				}
				
				
			}
			
			
			if(M==2)
			{
				//Paper Clip
	
				driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4587&CategoryId=4591&CategoryName=Paper%20Clip&PCategoryName=Trending&KeyWord=&CategoryId=4587&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Paper+Clip%22%2C%22categoryid%22%3A%224591%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676642170506");
				Random rn2 = new Random();
	
				for(int PC=1; PC<3; PC++)
				{
				int PC1=rn2.nextInt(4);  
	
				if(PC1==0)
				{
				PC1=4;	
				}
	
				String PC2 ="(//*[name()='svg'][@class='icon_cart'])["+PC1+"]";
				System.out.println(PC2);
	
				//style
				Thread.sleep(6000);  
				driver.findElement(By.xpath(PC2)).click();
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style added ");
	
				}
	
			}
			
			
			if(M==3)
			{
				//Bracelets & Bangles
	
				driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=9&CategoryId=115&CategoryName=Lariat%20Bracelets&PCategoryName=Bracelets$Bangles&KeyWord=&CategoryId=9&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Lariat+Bracelets%22%2C%22categoryid%22%3A%22115%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1676641711856");
				Random rn3 = new Random();
	
				for(int BB=1; BB<3; BB++)
				{
				int BB1=rn3.nextInt(4);  
	
				if(BB1==0)
				{
				BB1=4;	
				}
	
				String BB2 ="(//*[name()='svg'][@class='icon_cart'])["+BB1+"]";
				System.out.println(BB2);
	
				//style
				Thread.sleep(5000);  
				driver.findElement(By.xpath(BB2)).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style added ");
	
				}
				
			}
				if(M==4)
				{
					//Fusion Bridals
					driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=300&CategoryId=300&CategoryName=Fusion%20Bridals&PCategoryName=Fusion$Bridals&KeyWord=&CategoryId=300&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Fusion+Bridals%22%2C%22categoryid%22%3A%22300%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678333032843");
					Random rn4 = new Random();
					
					for(int N=1; N< 3; N++)
					{
					int NK=rn4.nextInt(4);  
		
					if(NK==0)
					{
					NK=4;	
					}
		
					String e1 ="(//*[name()='svg'][@class='icon_cart'])["+NK+"]";
					System.out.println(e1);
		
					//style
					Thread.sleep(5000);  
					driver.findElement(By.xpath(e1)).click();
					Thread.sleep(3000);  
					driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
					Thread.sleep(3000);  
					driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
					System.out.println("Style added ");
					}
					
				}		
	
				if(M==5)
				{
					//Diamond Basics
					driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=185&CategoryId=185&CategoryName=Diamond%20Basics&PCategoryName=Diamond$Basics&KeyWord=&CategoryId=185&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Diamond+Basics%22%2C%22categoryid%22%3A%22185%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678333038792");
					Random rn5 = new Random();
					
					for(int DB=1; DB< 3; DB++)
					{
					int DB1=rn5.nextInt(4);  
		
					if(DB1==0)
					{
					DB1=4;	
					}
		
					String DB2 ="(//*[name()='svg'][@class='icon_cart'])["+DB1+"]";
					System.out.println(DB2);
		
					//style
					Thread.sleep(5000);  
					driver.findElement(By.xpath(DB2)).click();
					Thread.sleep(3000);  
					driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
					Thread.sleep(3000);  
					driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
					System.out.println("Style added ");
		
					
					}
				}	
				if(M==6)
				{
					//Gemstone Jewelry

					driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=102&CategoryId=102&CategoryName=Gemstone%20Jewelry&PCategoryName=Gemstone$Jewelry&KeyWord=&CategoryId=102&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Gemstone+Jewelry%22%2C%22categoryid%22%3A%22102%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678333045886");
	
					Random rn6 = new Random();
					
					for(int GJ=1; GJ< 3; GJ++)
					{
					int GJ1=rn6.nextInt(4);  
		
					if(GJ1==0)
					{
					GJ1=4;	
					}
		
					String GJ2 ="(//*[name()='svg'][@class='icon_cart'])["+GJ1+"]";
					System.out.println(GJ2);
		
					//style
					Thread.sleep(5000);  
					driver.findElement(By.xpath(GJ2)).click();
					Thread.sleep(3000);  
					driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
					Thread.sleep(3000);  
					driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
					System.out.println("Style added ");
		
					
					}
				}
				
		}
		
		
		Random ML2 = new Random();
		int SPO1=ML2.nextInt(2);  
				if(SPO1==0)
				{
					System.out.println("SPO1 placed");
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
					
				}
					
				if(SPO1==1)
				{
					System.out.println("SPO2 placed");
					driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=17243&ItemType=&PCategoryId=193&CategoryId=193&PCategoryName=Trending");
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
					
					
				}
				if(SPO1==2)
				{
					System.out.println("SPO3 placed");
					driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=20245&ItemType=&PCategoryId=193&CategoryId=193&PCategoryName=Trending");
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
					
				}
					
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
				driver.findElement(By.xpath("(//input[@id='Mob_FEDEX_ECO'])[1]")).click(); 		


}}
	
	

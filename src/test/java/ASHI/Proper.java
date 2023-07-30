		package ASHI;
		import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;
		import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
		public class Proper {
		public static void main(String[] args) throws InterruptedException {
		
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

		Random RanNumber1 = new Random();
		for(int a=1; a<4; a++)
		{
		int FL=RanNumber1.nextInt(7);  
		if(FL==0)
		{
		System.out.println("loopFL=0");
		//Trending
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=193&CategoryId=193&CategoryName=Trending&PCategoryName=Trending&KeyWord=&CategoryId=193&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Trending%22%2C%22categoryid%22%3A%22193%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678344157790");
		Thread.sleep(5000);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
			      .ignoring(NoSuchElementException.class);

				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
			
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");
		}
		
		if(FL==1)
		{
		System.out.println("loopFL=1");
		//Best Sellers---- Lovebright Jewelry
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=73&CategoryId=78&CategoryName=Bracelets%20&%20Bangles&PCategoryName=Lovebright&KeyWord=&CategoryId=73&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Bracelets+%26+Bangles%22%2C%22categoryid%22%3A%2278%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678346352838");
		Thread.sleep(5000);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
				.ignoring(ElementNotInteractableException.class);
		
				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");
		}
		if(FL==2)
		{
		System.out.println("loopFL=2");
		//Trending ------ Curb & Cuban
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4587&CategoryId=4593&CategoryName=Curb%20Cuban&PCategoryName=Trending&KeyWord=&CategoryId=4587&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Curb+Cuban%22%2C%22categoryid%22%3A%224593%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678346386413");
		Thread.sleep(5000);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
					.ignoring(ElementNotInteractableException.class);

				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");

		}
		if(FL==3)
		{
		System.out.println("loopFL=3");
		//Diamond Basics   --------Earrings
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4012&CategoryId=4604&CategoryName=Earrings&PCategoryName=Diamond$Basics&KeyWord=&CategoryId=4012&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Earrings%22%2C%22categoryid%22%3A%224604%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678346438460");
		Thread.sleep(5000);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
					.ignoring(ElementNotInteractableException.class);

				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");

		}
		if(FL==4)
		{
		System.out.println("loopFL=4");
		//Petite Collection ------- Huggies
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4044&CategoryId=4059&CategoryName=Huggies&PCategoryName=Petite$Collection&KeyWord=&CategoryId=4044&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Huggies%22%2C%22categoryid%22%3A%224059%22%2C%22%24%24hashKey%22%3A%22object%3A5%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678417195602");
		Thread.sleep(5000);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
					.ignoring(ElementNotInteractableException.class);

				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");

		}
		if(FL==5)
		{
		System.out.println("loopFL=5");
		//Pendants & Necklaces    -----Heart Pendants
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=4002&CategoryId=4529&CategoryName=Pendants%20Necklaces&PCategoryName=Best$Sellers&KeyWord=&CategoryId=4002&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Pendants+Necklaces%22%2C%22categoryid%22%3A%224529%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678416242468");
		Thread.sleep(5000);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
					.ignoring(ElementNotInteractableException.class);

				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");
		}
		if(FL==6)
		{
		System.out.println("loopFL=6");
		//Bridals ----Solitaire Rings
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=5&CategoryId=15&CategoryName=Solitaire%20Rings&PCategoryName=Bridals&KeyWord=&CategoryId=5&IsDesigner=0&PageSize=100&subPageSize=0&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22CategoryName%22%3A%22Solitaire+Rings%22%2C%22categoryid%22%3A%2215%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678346582306");
		Thread.sleep(5000);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
					.ignoring(ElementNotInteractableException.class);

				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");
		}
		if(FL==7)
		{
		System.out.println("loopFL=7");
		//Bridals ---Half Eternity Bands
		driver.get("https://www.ashidiamonds.com/Product/ProductList.aspx?PCategoryId=5&CategoryId=15&CategoryName=Solitaire%20Rings&PCategoryName=Bridals&KeyWord=&CategoryId=5&IsDesigner=0&PageSize=100&subPageSize=8&PageIndex=1&SubPageIndex=0&subPageIndex=1&Filter=12&Sort=12&ProductType=1&categorys=%5B%7B%22categoryid%22%3A172%2C%22CategoryName%22%3A%22Half+Eternity+Bands%22%2C%22%24%24hashKey%22%3A%22object%3A889%22%7D%5D&SpecificationAttributes=%5B%5D&FilterProductCollection=%5B%5D&searchKeywords=&FromPrice=0&ToPrice=0&CurrentSpecificationAttribute=%5B%5D&Programids=%5B%5D&Productsids=&datetime=1678346614276 ");
		Thread.sleep(5000);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(2))
					.ignoring(ElementNotInteractableException.class);

				WebElement FluWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[1]")));
				FluWait.click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 1 added ");
				
				WebElement FluWait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='icon_cart'])[2]")));
				FluWait1.click();	
				Thread.sleep(4000);  
				driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
				Thread.sleep(3000);  
				driver.findElement(By.xpath("(//span[@aria-hidden='true'][normalize-space()='×'])[2]")).click();
				System.out.println("Style 2 added ");
		}

		}
		Random RanNumber2 = new Random();
		for(int b=1; b<3; b++)
		{
		int SL=RanNumber2.nextInt(7);  
		if(SL==0)
		{
		System.out.println("loopSL=0");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=15783&ItemType=&PCategoryId=5&CategoryId=1010&PCategoryName=Bridals");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 

		}
		if(SL==1)
		{
		System.out.println("loopSL=1");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=12701&ItemType=&PCategoryId=5&CategoryId=1010&PCategoryName=Bridals");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 
		
		
		}
		if(SL==2)
		{
		System.out.println("loopSL=2");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=15965&ItemType=&PCategoryId=5&CategoryId=1010&PCategoryName=Bridals");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 
		
		}
		if(SL==3)
		{
		System.out.println("loopSL=3");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=12324&ItemType=&PCategoryId=false&CategoryId=false");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 
		
		}
		if(SL==4)
		{
		System.out.println("loopSL=4");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=16379&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 
		
		}
		if(SL==5)
		{
		System.out.println("loopSL=5");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=16073&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 
		
		}
		if(SL==6)
		{
		System.out.println("loopSL=6");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=20103&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 
		
		}
		if(SL==7)
		{
		System.out.println("loopSL=7");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=17287&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		System.out.println("SPO Style added "); 
	

		//Detail ordercart
		driver.get("https://www.ashidiamonds.com/Ordercart/OrderCart.aspx");

		driver.findElement(By.xpath("(//a[normalize-space()='Go to Order Cart'])[1]")).click();
		Thread.sleep(4000);  
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

		//driver.findElement(By.xpath("(//input[@id='Mob_FEDEX_ECO'])[1]")).click(); 
		//driver.close();
		}
		}
		}
	}



package ASHI;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
//try catch se chalaya hai - shi chal rha hai
public class DetailPageCart 
{
	public static void main(String[] args) throws Exception 
	{
		//login
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver(chromeOptions);
		
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
		Thread.sleep(500);  Thread.sleep(2000);  
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
		Thread.sleep(1000);  Thread.sleep(2000);  

		
		
		Random RanNumber1 = new Random();
		for(int a=1; a<4; a++)
		{
		int FL=RanNumber1.nextInt(6);  
		if(FL==0)
		{
		System.out.println("Stackable Fusion Diamond Open Cuff Bangle --- 7992HFVWG");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=16345&ItemType=&PCategoryId=43&CategoryId=51&PCategoryName=Fusion$Diamonds");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
	
		}
		else if(FL==1)
		{
		System.out.println("Scatter Zig-Zag Baguette Diamond Fashion Band ---- 360B3FHYG");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=20389&ItemType=&PCategoryId=193&CategoryId=235&PCategoryName=Trending");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();

		}
		else if(FL==2)
		{
		System.out.println("Baguette Diamond Fashion Ring ---- 362D0FHWG-1.25");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=21151&ItemType=&PCategoryId=193&CategoryId=235&PCategoryName=Trending");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();

		}
		else if(FL==3)
		{
		System.out.println("Lovebright Essential Diamond Ring ----36900FVYW-1.50");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=15323&ItemType=&PCategoryId=19&CategoryId=255&PCategoryName=Lovebright$Bridals");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		}
		else if(FL==4)
		{
		System.out.println("Horseshoe Petite Diamond Fashion Pendant ---647B8TSPDYG");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=20577&ItemType=&PCategoryId=7&CategoryId=139&PCategoryName=Pendants@Necklaces");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();

		}
		else if(FL==5)
		{
		System.out.println("Diamond Wedding Band ---14728FHWG-WB");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=8141&ItemType=&PCategoryId=5&CategoryId=1010&PCategoryName=Bridals");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();

		}
		else if(FL==6)
		{
		System.out.println("Paper Clip Diamond Fashion Necklace ----998GQFHNKYG");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=19409&ItemType=&PCategoryId=4587&CategoryId=4062&PCategoryName=Trending");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		}
		else if(FL==7)
		{
		System.out.println("Curb & Cuban Diamond Fashion Ring\r\n----364C3FGYG");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=19719&ItemType=&PCategoryId=4587&CategoryId=4593&PCategoryName=Trending");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		}
		else if(FL==8)
		{
		System.out.println("Aries Zodiac Diamond Pendant----635Y9TSPDYG-ARIE");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=22878&ItemType=&PCategoryId=4079&CategoryId=4080&PCategoryName=Personalized$Jewelry");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		}
		else if(FL==9)
		{
		System.out.println("Gemini Zodiac Diamond Pendant ----635Y9TSPDYG-GEMI");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=22880&ItemType=&PCategoryId=4079&CategoryId=4080");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		}
		else if(FL==10)
		{
		System.out.println("Capricorn Zodiac Diamond Pendant ----635Y9TSPDYG-CAPR");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=22879&ItemType=&PCategoryId=4079&CategoryId=4080");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		}
		}
try {
		Random RanNumber2 = new Random();
		for(int b=1; b<3; b++)
		{
		int SL=RanNumber2.nextInt(7);  
		if(SL==0)
		{
		System.out.println("loopSL=0");

		}
		else if(SL==1)
		{
		System.out.println("loopSL=1");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=12701&ItemType=&PCategoryId=5&CategoryId=1010&PCategoryName=Bridals");
		//SPO
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
		System.out.println("SPO Style added ");

		}
		else if(SL==2)
		{
		System.out.println("loopSL=2");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=15965&ItemType=&PCategoryId=5&CategoryId=1010&PCategoryName=Bridals");
		//SPO
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
		System.out.println("SPO Style added ");
		}
		else if(SL==3)
		{
		System.out.println("loopSL=3");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=12324&ItemType=&PCategoryId=false&CategoryId=false");
		//SPO
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
		System.out.println("SPO Style added ");
		}
		else if(SL==4)
		{
		System.out.println("loopSL=4");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=16379&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		//SPO
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
		System.out.println("SPO Style added ");
		}
		else if(SL==5)
		{ 
		System.out.println("loopSL=5");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=16073&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		//SPO
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
		System.out.println("SPO Style added ");
		}
		else if(SL==6)
		{
		System.out.println("loopSL=6");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=20103&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		//SPO
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
		System.out.println("SPO Style added ");

		}
		else if(SL==7)
		{
		System.out.println("loopSL=7");
		driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=17287&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
		//SPO
		Thread.sleep(5000);  
		driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
		System.out.println("SPO Style added ");
		}
		}
		
}

catch(Throwable t)
{
	System.out.println("In catch");
	driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=17287&ItemType=&PCategoryId=4002&CategoryId=4076&PCategoryName=Best$Sellers");
	//SPO
	Thread.sleep(5000);  
	driver.findElement(By.xpath("(//a[@id='btnspoorder'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//li[@id='PG'])[1]")).click();
	driver.findElement(By.xpath("(//li[@id='18KT'])[2]")).click();
	driver.findElement(By.xpath("(//a[normalize-space()='ADD TO CART'])[1]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//button[@aria-label='Close'])[4]")).click();
	System.out.println("SPO Style added "); 
	
	Thread.sleep(3000);
	System.out.println("Gemini Zodiac Diamond Pendant ----635Y9TSPDYG-GEMI");
	driver.get("https://www.ashidiamonds.com/Product/ProductDetails.aspx?ITEM_ID=22880&ItemType=&PCategoryId=4079&CategoryId=4080");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
}
finally {
	//Detail ordercart
	System.out.println("In finally");
			driver.findElement(By.xpath("(//*[name()='svg'][@class='icon-header'])[3]")).click();
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
			System.out.println("order placed");
		
		}
	}
}
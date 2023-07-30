package loginfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class test1 {
	
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		int count;
		
		
		driver.get("https://appgrowthcompany.com/Strutootest/web/shop");
		Thread.sleep(6000); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int yOffset = count=6000; // Adjust the value as per your requirement
		js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
		
		Thread.sleep(1000);
		int yOffset1 = count=200; // Adjust the value as per your requirement
		js.executeScript("window.scrollBy(0, arguments[0]);", yOffset1);
		driver.findElement(By.xpath("(//li[@routerlink='/shop/ourpartner/seller'])[1]")).click();
		Thread.sleep(6000); 

	}

}

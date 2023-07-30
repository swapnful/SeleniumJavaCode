package loginfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipbookTrail1 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.digitalecatalog.com/catalog/Valentine2023/S/STD/AllurebyGreatons/index.html?MjYy#Valentines/page1");
	
	
		driver.findElement(By.className("cursor_icon")).click();
		//driver.findElement(By.xpath("//a[@id='fb5-logo']//img[@title=\"Greaton's Jewelers\"]")).isDisplayed();
		WebElement topHeader = driver.findElement(By.xpath("//a[@id='fb5-logo']//img[@title=\"Greaton's Jewelers\"]"));
		if (topHeader.isEnabled())	
		{
			System.out.println("TopHeader is linked and clickable");
	
		}
		else
			System.out.println("TopHeader is not linked");
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 
		 
		driver.findElement(By.xpath("//body/div[@id='fb5-ajax']/div[@id='fb5']/div[@id='fb5-container-book']/div[@id='fb5-book']/div[@class='turn-page-wrapper']/div/div[@class='even turn-page p1']/div[@class='links']/a[1]/div[1]")).click();
		 Thread.sleep(1000);
		 // String StyleId = driver.findElement(By.className("styleId")).getText();
		// System.out.println(StyleId);
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@id='v5_lightbox_close']")).click();
		driver.findElement(By.xpath("//body/div[@id='fb5-ajax']/div[@id='fb5']/div[@id='fb5-container-book']/div[@id='fb5-book']/div[@class='turn-page-wrapper']/div/div[@class='even turn-page p1']/div[@class='links']/a[6]/div[1]")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@id='v5_lightbox_close']")).click(); ////i[@id='v5_lightbox_close']
		 Thread.sleep(1000);
		//String MobileNumber = driver.findElement(By.xpath("//a[@id='fb5-label-phone-number']//span[contains(text(),'(651) 439-9200')]")).getText();
		//System.out.println(MobileNumber);
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='Main_right_arrow hidden-xs']//i[@class='C_Icons arrow-right-icon']")).click();
		 Thread.sleep(1000);
		 Thread.sleep(1000);

		// driver.findElement(By.xpath("//i[@class='C_Icons download-icon']")).click();
		 
		 driver.findElement(By.xpath("//body/div[@id='fb5-ajax']/div[@id='fb5']/div[@id='fb5-container-book']/div[@id='fb5-book']/div[@class='turn-page-wrapper']/div/div[@class='odd turn-page p2']/div[@class='links']/a[6]/div[1]")).click();
		 Thread.sleep(1000);
		 // String StyleId = driver.findElement(By.className("styleId")).getText();
		// System.out.println(StyleId);
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@id='v5_lightbox_close']")).click();
		
		 Thread.sleep(1000);
		 Thread.sleep(1000);

		driver.findElement(By.xpath("//body/div[@id='fb5-ajax']/div[@id='fb5']/div[@id='fb5-container-book']/div[@id='fb5-book']/div[@class='turn-page-wrapper']/div/div[@id='page3']/div[@class='links']/a[6]/div[1]")).click();
		 Thread.sleep(1000);
		 // String StyleId = driver.findElement(By.className("styleId")).getText();
		// System.out.println(StyleId);
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@id='v5_lightbox_close']")).click();
	}

}

package ASHI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LiveLogin {

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
	}

}

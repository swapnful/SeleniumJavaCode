package TestMaven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenClass {

	
	public static void main(String[] args) throws Exception {

		//Login
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	Thread.sleep(3000);  Thread.sleep(1000);  
	
	System.out.println("code true");
	driver.quit();
}
}
	

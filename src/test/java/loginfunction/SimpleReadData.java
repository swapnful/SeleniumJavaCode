package loginfunction;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleReadData {

	public static void main(String[] args) throws Exception {

		File excelFile = new File("./datafiles/loginData.xlsx");
		System.out.println(excelFile.exists());
		FileInputStream fis= new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		System.out.println(sheet.getPhysicalNumberOfRows());
	
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColm = sheet.getRow(0).getLastCellNum();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
		Thread.sleep(1000);  Thread.sleep(1000);  
		
		
		
		for(int i=1;i< noOfRows;i++) //1
		{
			for(int j=0; j< noOfColm;j++) //0
			{
				
			String Data1 = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(Data1);
			
			driver.findElement(By.xpath("//input[@id='srchterm']")).sendKeys(Data1);
			driver.findElement(By.className("search-mag")).click();			
			
			
			 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofSeconds(20))
				       .pollingEvery(Duration.ofSeconds(2))
				       .ignoring(NoSuchElementException.class);
			 
			WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ImagechangeListdata_1")));
			   e.click();

			   Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofSeconds(20))
				       .pollingEvery(Duration.ofSeconds(2))
				       .ignoring(NoSuchElementException.class);
			 
			WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("STC_SingleValue1")));
			 String abc =  e1.getText();
			   
			  // String abc= driver.findElement(By.className("STC_SingleValue1")).getText();
			System.out.println(abc);
			}
			System.out.println("out to 1st loop");
		}
		System.out.println("out to 2nd loop");

	workbook.close();
		fis.close();		
	}

}

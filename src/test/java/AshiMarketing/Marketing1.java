package AshiMarketing;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Marketing1 {

	public static void main(String[] args) throws IOException, Exception {
		
		//form-control
		File excelFile = new File("C:\\Users\\hp\\eclipse-workspace\\myproject1\\datafiles\\loginData.xlsx");
		
		System.out.println(excelFile.exists());
		FileInputStream fis= new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		System.out.println(sheet.getPhysicalNumberOfRows());

		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColm = sheet.getRow(0).getLastCellNum();

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
		Thread.sleep(1000);  Thread.sleep(2000);  
		
	
		for(int i=1;i< noOfRows;i++) //1
		{
		for(int j=0; j< noOfColm;j++) //0
		{

		String Data1 = sheet.getRow(i).getCell(j).getStringCellValue();
		//System.out.println(Data1);
		driver.get(Data1);
		Thread.sleep(5000);  
		String Header = driver.findElement(By.className("MarketingHead")).getText();
		System.out.println("");
		System.out.println("");
		System.out.println(Header); 

		int k = 1;  
		 
		while(k<=300)
		{  
		try 
		{
			
			String x ="//*[@id=\"thumnailContainer\"]/li["+k+"]/div/img";
			Thread.sleep(500);  
			WebElement imgx = driver.findElement(By.xpath(x));

			if(imgx.isEnabled() && (imgx.isDisplayed()))
			{
				//System.out.println(x);
				System.out.println("image number-"+k+"  is displaying & clickable:");
				Thread.sleep(500);  
				k++;
			}
			else 
			{
			System.out.println("image is not diaplay or clickable:");
			System.out.println("=================================");

			}
			/*if(imgx.isDisplayed())
			{
				
				System.out.println("image number-"+k+"  is displayed:");
				Thread.sleep(500);  
				System.out.println(" ");
				k++;
			}
			else 
			{
			System.out.println("image is not display:");
			}*/
		}
				catch (Throwable t)
			{
				System.out.println("");
				System.out.println("In catch");
				System.out.println("Total images found =" +(k-1));
				break;  
			}
		}//while    
			}
		}
	}
}
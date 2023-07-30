package ASHI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class marketing3 {

public static void main(String[] args) throws Throwable {

//form-control
File excelFile = new File("./datafiles/loginData.xlsx");
System.out.println(excelFile.exists());
FileInputStream fis= new FileInputStream(excelFile);
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheet("Sheet3");
System.out.println(sheet.getPhysicalNumberOfRows());

int noOfRows = sheet.getPhysicalNumberOfRows();
int noOfColm = sheet.getRow(0).getLastCellNum();

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

for(int i=1;i< noOfRows;i++) //1
{
for(int j=0; j< noOfColm;j++) //0
{
	driver.get("https://url-opener.com/");
	Thread.sleep(3000);
	
String Data1 = sheet.getRow(i).getCell(j).getStringCellValue();
System.out.println(Data1);
driver.findElement(By.className("form-control")).sendKeys(Data1);
driver.findElement(By.className("form-control")).sendKeys(" ");
Thread.sleep(3000);

//driver.findElement(By.xpath("//input[@id='srchterm']")).sendKeys(Data1);
//driver.findElement(By.id("openUrls")).click();


/*String parentWindowHandle = driver.getWindowHandle();
System.out.println("Parent window's handle -> " + parentWindowHandle);

 
Set<String> allWindowHandles = driver.getWindowHandles();
 
	for(String handle : allWindowHandles)
	{
	System.out.println("Window handle - > " + handle);
	Thread.sleep(3000);
	Thread.sleep(3000);*/
	}
int k = 1;  
while(k<=500) {  
try {
	 String x ="//*[@id=\"thumnailContainer\"]/li["+k+"]/div/img";
	 Thread.sleep(2000);  
	 Thread.sleep(2000);  

	 System.out.println(x);
	 Thread.sleep(2000);  
	 System.out.println("xpath created in whie loop");
	 Thread.sleep(3000);  

WebElement img = driver.findElement(By.xpath(x));
Thread.sleep(4000); 
System.out.println("line 90");

if(img.isEnabled())
{	 Thread.sleep(2000);  

	 System.out.println("image is clickable:");
	 

Thread.sleep(4000);  
i++;
}
else
{
	 System.out.println("image not clickable:");

}

}
catch (Throwable t)
{
System.out.println("");
System.out.println("In catch condition");
throw(t);
  
}

System.out.println("out of looop");
}    



}
 
}
 
}


}


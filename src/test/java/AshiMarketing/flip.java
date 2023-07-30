package AshiMarketing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flip
{

public static void main(String[] args) throws IOException, Exception
{

//form-control
File excelFile = new File("C:/Users/hp/eclipse-workspace/myproject1/datafiles/loginData.xlsx");

System.out.println(excelFile.exists());
FileInputStream fis= new FileInputStream(excelFile);
XSSFWorkbook workbook = new XSSFWorkbook(fis);
//XSSFSheet sheet = workbook.getSheet("DailySocialMedia");
XSSFSheet sheet = workbook.getSheet("Flip");

System.out.println(sheet.getPhysicalNumberOfRows());

int noOfRows = sheet.getPhysicalNumberOfRows();
int noOfColm = sheet.getRow(0).getLastCellNum();

//login
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver(chromeOptions);
driver.manage().window().maximize();


for(int i=1;i< noOfRows;i++) //1
{
for(int j=0; j< noOfColm;j++) //0
{
String Data1 = sheet.getRow(i).getCell(j).getStringCellValue();
//System.out.println(Data1);
driver.get(Data1);
Thread.sleep(5000);
driver.findElement(By.xpath("(//img[@class='cursor_icon'])[1]")).click();
//String Header = driver.findElement(By.className("MarketingHead")).getText();
//System.out.println("");
///System.out.println("");
//System.out.println(Header);
Thread.sleep(500);

driver.navigate().refresh();
Thread.sleep(5000);

 //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());  
     
        //checking the links fetched.
        for(int p=0;p<links.size();p++)
        {
            WebElement E1= links.get(p);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
}
}
 driver.quit();
}

public static void verifyLinks(String linkUrl)
   {
       try
       {
           URL url = new URL(linkUrl);

           //Now we will be creating url connection and getting the response code
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           httpURLConnect.setConnectTimeout(5000);
           httpURLConnect.connect();
           if(httpURLConnect.getResponseCode()>=400)
           {
            System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+" is a broken link");
           }    
     
           //Fetching and Printing the response code obtained
           else{
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
           }
       }catch (Exception e)
{

}
  }

}


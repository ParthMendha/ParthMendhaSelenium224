import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

public static void main(String[] args) throws InterruptedException  {

// TODO Auto-generated method stub

         System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");

         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         Thread.sleep(1000);

         driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//       //a[@value='MAA']
//       (//a[@value='MAA'])[2]  
         
         Thread.sleep(2000);
         
         //System.out.println(driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
         //Thread.sleep(2000);
         
         driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//a[@value='BLR']")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("(//a[@value='MAA'])[2] ")).click();
         
         
        // driver.close();
 
}

}
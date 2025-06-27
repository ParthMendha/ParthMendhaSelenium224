import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutosugesstionAssignmentWithKeys {



public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe"); // please use your loacl location over here 

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    long time = 5000;
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    
    
    //URL
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    
    
    //WebElement dropdown = driver.findElement(By.id("autocomplete"));

    
    driver.findElement(By.id("autocomplete")).sendKeys("Can");

    Thread.sleep(2000);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"ui-id-43\"]")).click();
    
    Thread.sleep(1000);
    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

       
   Thread.sleep(5000);
   driver.close();
   
       

}

}
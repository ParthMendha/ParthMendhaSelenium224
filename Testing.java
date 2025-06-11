import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Testing {

	
	public static void main(String[] args) throws InterruptedException {
		
		
	     System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver(); 
		 
		 
	     driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
	    
	     
	     driver.manage().window().maximize();
	     
	     
	     WebElement ForgotPasswordClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div[2]/a"));
		 ForgotPasswordClick.click();
		 
		 Thread.sleep(4000);
			
		 WebElement ResetLoginClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/form/div/button[2]"));
		 ResetLoginClick.click();
		 
		 Thread.sleep(2000);
		 
		 System.out.println(driver.findElement(By.cssSelector("form p")).getText());	   
		 
		 Thread.sleep(2000);
		 
		 driver.close();
	
	}	
	
}

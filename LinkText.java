import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	
	public static void main(String[] args) throws InterruptedException {
		
			
	 System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver(); //driver
     
    
     driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
     Thread.sleep(1000);
     
     driver.manage().window().maximize();
     
     //implicityWaits
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
     
     Thread.sleep(2000);
     
     WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[1]"));							
     Username.sendKeys("parthhmendha@gmail.com"); 
     
     WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[2]"));
     Password.sendKeys("Parth2241*");
     
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/button")).click();
     
     Thread.sleep(4000);
     
     System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
     
     Thread.sleep(2000);
     
      ///WebElement Forgotpasswordclick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div[2]/a"));
      //Forgotpasswordclick.click();
     
      driver.findElement(By.linkText("Forgot your password?")).click();
      
      Thread.sleep(2000);
      
      driver.close();
      
    
}
	
}
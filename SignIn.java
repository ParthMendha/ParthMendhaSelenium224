import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	//Path of the ChromeDriver				
	 System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
	 
    //Make object for Chromedriver	
	 WebDriver driver = new ChromeDriver(); 
     
     Thread.sleep(1000); // Timespace
     
     driver.get("https://rahulshettyacademy.com/locatorspractice/"); // URL
     Thread.sleep(1000);
     
     driver.manage().window().maximize();// If user want maximize window tab 
     
     //implicityWaits
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
     
     Thread.sleep(2000);
     
     WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[1]"));							
     Username.sendKeys("parthhmendha@gmail.com"); 
     
     WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[2]"));
     Password.sendKeys("Parth2241*");
     
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/button")).click();
     
     Thread.sleep(4000);
     
    //to print error message in console by Css selector 
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
   
    
    Thread.sleep(2000);
    
    driver.close();
     
   
}
	
}
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CaptureDynamicPassword {

	public static void main(String[] args) throws InterruptedException {
	 
	 System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver(); //driver
	 
	//implicityWaits
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
     String name = "parth";	
	 //Extract password from method
	 String password = getPassword(driver);
	  
     driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
     
     Thread.sleep(2000);
     
     driver.manage().window().maximize();
     
     Thread.sleep(1000);
     
     WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[1]"));							
     Username.sendKeys(name); 
     
     Thread.sleep(1000);
     
     WebElement Passwordd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[2]"));
     Passwordd.sendKeys(password);
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/button")).click();
     
     Thread.sleep(2000);
     
     System.out.println(driver.findElement(By.xpath("//h2")).getText());
     // assertion for greeting message using String variable
     Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText(),"Hello "+name+","); //name is variable o
     
     Thread.sleep(2000);
     System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/h1")).getText());
     Thread.sleep(2000);
     
     //Using tag name 
     System.out.println(driver.findElement(By.tagName("p")).getText());
     Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in."); 
     
     Thread.sleep(2000);
     
     WebElement logoutbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button"));
     logoutbutton.click();
     
     Thread.sleep(4000);
    
     driver.close();
    
     
	}
	
	//forgotpassword new Method for extraction...........................
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
	
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		
		Thread.sleep(1000);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
		
		WebElement ForgotPasswordClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div[2]/a"));
		ForgotPasswordClick.click();
		
		Thread.sleep(3000); 
		
		WebElement ResetLoginClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/form/div/button[2]"));
		ResetLoginClick.click();
		
        Thread.sleep(3000);
         
		String passwordText = driver.findElement(By.cssSelector("form p")).getText(); 
		//TEXT = --- Please use temporary password 'rahulshettyacademy' to Login. ---- 
		
		String[] passwordArray = passwordText.split("'");
		//Text= Please use temporary password 'rahulshettyacademy' to Login. string will break into 2 peices 
		// 0th index = Please use temporary password '
		//1st index = rahulshettyacademy' to Login.
		
	
		//String password = passwordArray[1].split("'")[0];
		String[] passwordArray2 = passwordArray[1].split("'");
		String password = passwordArray2[0];
		
		//Text= 1st index = rahulshettyacademy' to Login.
	    // 0th index = rahulshettyacademy
		// 1st index = ' to Login.
		
		return password;
		
		 
	}
	
	
	
}
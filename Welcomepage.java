import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Welcomepage {

	
	public static void main(String[] args) throws InterruptedException {
		
			
	 System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver(); //driver
	 
     
	 String name = "parth";
	 
	 
     driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
     Thread.sleep(1000);
     
     driver.manage().window().maximize();
     
     //implicityWaits
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
     
     Thread.sleep(2000);
     
     WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[1]"));							
     Username.sendKeys(name); 
     
     WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[2]"));
     Password.sendKeys("rahulshettyacademy");
     
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
     
     
     Thread.sleep(5000);
     
     driver.close();
    
     
	}
	
}
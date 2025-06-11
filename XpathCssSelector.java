import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathCssSelector {

	
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
     Username.sendKeys("parthmendha@gmail.com"); 
     
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
      
      WebElement Name = driver.findElement(By.xpath("//input[@placeholder ='Name']"));
      Name.sendKeys("parth");
      
      Thread.sleep(1000);
      
      WebElement Email = driver.findElement(By.cssSelector("input[placeholder$='Email']"));
      Email.sendKeys("parthmendha@gmail.com");
      
      Thread.sleep(1000);
      
      WebElement phone = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]"));
      phone.sendKeys("9924627290");
      
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/form/div/button[2]")).click();
      
      Thread.sleep(1000);
      
      
      //System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
      
      System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/form/p")).getText());
      
      
      Thread.sleep(5000);
      
      WebElement Gotologin = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]"));
      Gotologin.click();
      
      
      Thread.sleep(2000);
      
      WebElement Username1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[1]"));							
      Username1.sendKeys("parth"); 
      
      WebElement Password1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/input[2]"));
      Password1.sendKeys("rahulshettyacademy");
      
      Thread.sleep(1000);
      WebElement chcbox1 = driver.findElement(By.id("chkboxTwo"));
      chcbox1.click();
      
      Thread.sleep(2000);
      
      WebElement signinB = driver.findElement(By.xpath("//button[@type='submit']"));
      signinB.click();
      
      
      //driver.close();
      
}
	
}
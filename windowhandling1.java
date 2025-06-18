import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling1 {

       public static void main(String[] args) throws InterruptedException  {
			
			// TODO Auto-generated method stub
			
	        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//long time = 5000;
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//a[contains(text(),'Free Access to')]")).click();
		    Thread.sleep(2000);
		    
		    //switch to child window 
		    Set<String> windows = driver.getWindowHandles(); // [parentId , ChildId]
		    
		    Iterator<String> iteratorr = windows.iterator(); // create iterator for moving to parentId to childId and viceversa
		    
		    String parentId = iteratorr.next(); // 0 iterator = ParentId
		    String childId = iteratorr.next();  // 1 index = ChildId 
		    
		    driver.switchTo().window(childId); // switch to child id 
		    
		    Thread.sleep(2000);
		    
		    System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		    
		    driver.findElement(By.cssSelector("p.im-para.red")).getText();
		    
		    String firstindex =  driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim();
		   
		    //[0] = Please email us 
			//[1] =  mentor@rahulshettyacademy.com with below templ
		    //[3] = e to receive response
		   
		    //driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		    //mentor@rahulshettyacademy.com
		    
		    String emailId = firstindex.split(" ")[0];
		    //mentor@rahulshettyacademy.com 
		    
		    
		    //switching to parentId 
		    driver.switchTo().window(parentId);
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("username")).sendKeys(emailId); //enter username  
		    
		  
		  
		    
	}

}

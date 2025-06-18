import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

       public static void main(String[] args) throws InterruptedException  {
			
	        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//implicitlyWait
			long time = 5000;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
			
			Thread.sleep(1000);
			

			driver.get("https://the-internet.herokuapp.com"); //URl

			
			driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
			Thread.sleep(1000);
			
			Set<String> windows = driver.getWindowHandles();
			
			Iterator<String> itObject = windows.iterator();
			
			String parentId = itObject.next();
			String childId = itObject.next();
			
			driver.switchTo().window(childId);
			Thread.sleep(1000);
			// On child window
			System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText()); // get text from child window
			//div[class='example'] h3 = cssselector  
			
		    driver.switchTo().window(parentId);
		    Thread.sleep(1000);
		    // on Parent Window 
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText()); // get text from parent window 
		    
		    driver.close();
			
       }
       
}
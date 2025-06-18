import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {

       public static void main(String[] args) throws InterruptedException  {
			
	        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//implicitlyWait
			//long time = 5000;
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
			
			Thread.sleep(1000);
			

			driver.get("https://jqueryui.com/droppable/"); //URl
			
			Thread.sleep(1000);
			
			System.out.println(driver.findElement(By.tagName("iFrame")).getSize());
			
			
			//drag and drop example using frames 
			//switch to frame (inside frame) 
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
			
			//driver.findElement(By.id("draggable")).click();
			
			
			//create action method for drag and drop 
			Actions actionObject = new Actions(driver);
			
			
			//actionObject.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
			
			WebElement Source = driver.findElement(By.id("draggable")); 
			
			WebElement Target = driver.findElement(By.id("droppable"));
			
			Thread.sleep(1000);
			
			actionObject.dragAndDrop(Source, Target).build().perform();
			
			
			driver.close();
			
			
  }
       
}
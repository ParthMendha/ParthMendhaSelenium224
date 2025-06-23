import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Define Variable 
		String monthNumber = "6" ;
		String date = "15";
		String year = "2027";
		
		
		System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe"); //chrome driver setup and loaction 

		WebDriver driver=new ChromeDriver(); //object for chrome driver

		driver.manage().window().maximize(); //maximize
		Thread.sleep(1000);
		
		//implicit wait
		//long time = 5000;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(2000);
		//top deal link click 
		driver.findElement(By.linkText("Top Deals")).click();
		
		//window handling 
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> itObject = windows.iterator();
		
		String parentId = itObject.next();
		String childId = itObject.next();
		
		driver.switchTo().window(childId);
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/button[2]")).click();
		
		//driver.findElement(By.cssSelector("button[class='react-calendar__navigation__label']")).click();
		
		Thread.sleep(3000);
		
		//action method
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/span/div/div/div[1]/button[5]"))).click().click().build().perform();
		Thread.sleep(1000);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/span/div/div/div[1]/button[2]"))).click().click().click().build().perform();
		Thread.sleep(1000);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/span/div/div/div[1]/button[4]"))).click().build().perform();
		
		List<WebElement> dates = driver.findElements(By.cssSelector("button[class$='react-calendar__tile react-calendar__month-view__days__day'] abbr"));
	      for(WebElement selectDate : dates) 
	      {
	    	   if(selectDate.getText().equalsIgnoreCase("22"))
	    	   {	
	    		   
	    		   Thread.sleep(2000);
	    		   selectDate.click();
	    		   break;
	    		   
	    		 }		
	    	   
	      }
	    	 
	      
	      
		
		
	}

}

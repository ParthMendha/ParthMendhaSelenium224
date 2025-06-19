import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	 public static void main(String[] args) throws InterruptedException  {
			
	        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//implicitlyWait
			long time = 8000;
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	        
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URl
			
			// total links count in the page 
			System.out.println(driver.findElements(By.tagName("a")).size()); // link having tagname a(ancor)
			
		    // total links present in footer section 
			Thread.sleep(1000);
			//driver.findElement(By.cssSelector("div.footer_top_agile_w3ls.gffoot.footer_style"));
		   	WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		   	System.out.println(footerdriver.findElements(By.tagName("a")).size());
		   	
		   	// total link on first coloumn of footer page 
		   	Thread.sleep(1000);
		   	WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		   	System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		   	
		   	// open the links for that 1st coloumn 
		   	
		   	for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		   	{
		   		Thread.sleep(1000);
		   		String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
		   		coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		   		
		   		Thread.sleep(5000);
		   	}	
		   	
		   	
		   	    //window handle
		   		Set<String> windows = driver.getWindowHandles();
			   	Iterator<String> iteratorObject = windows.iterator();
			   	
			   	while(iteratorObject.hasNext())
			   	{
	
			   		driver.switchTo().window(iteratorObject.next());
			   		System.out.println(driver.getTitle());
			   		
			   		
			   	}
			   	
	   	
		   	
   }
	 
	 
}
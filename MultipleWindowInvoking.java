import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindowInvoking {

	
	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		long time = 5000;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));


		driver.get("https://rahulshettyacademy.com/angularpractice/"); // URL
		
		
		//open new blank tab 
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//or 
		
		//open new blank window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(1000);
		
		
	    Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		String parentTab = it.next();
		String childTab = it.next();
		
		driver.switchTo().window(childTab);
		
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(5).getText();
		
	    driver.switchTo().window(parentTab);
	    
	    driver.findElement(By.name("name")).sendKeys(courseName);
	    
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}

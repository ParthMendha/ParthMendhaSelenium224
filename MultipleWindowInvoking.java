import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindowInvoking {

	
	public static void main(String[] args) throws InterruptedException, IOException {
	

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
	   
	    WebElement nameElenemt = driver.findElement(By.name("name"));
	    nameElenemt.sendKeys(courseName);
	   
	   
	    //particular webelement ss 
	    
	    //File file = nameElenemt.getScreenshotAs(OutputType.FILE);
	    //FileUtils.copyFile(file, new File("C:/selenium ss/15-07/namefield1.png"));
	    
	    
	    // get height andf widght of webelement 
	    System.out.println(nameElenemt.getRect().getDimension().getHeight());
	    System.out.println(nameElenemt.getRect().getDimension().getWidth());
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}

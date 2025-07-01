import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinksAll {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException 
	
	{
		

        System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		long time = 5000;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL
		
		
		List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link : links)
		{
		
		  String urll = link.getAttribute("href");
				
		  HttpURLConnection conn = (HttpURLConnection)new URL(urll).openConnection();
		  conn.setRequestMethod("HEAD");
		  conn.connect();
		  int respCode = conn.getResponseCode();
		  System.out.println(respCode);	
			
		      if(respCode>400) 
		      {
		    	  System.out.println("The link with text "+ link.getText() + " is broken with code " + respCode);
		    	  Assert.assertTrue(false);
		    	  
		      }
			  
		}	
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}

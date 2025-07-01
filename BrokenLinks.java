import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		
        ChromeOptions chromeoptions = new ChromeOptions();
        
        
        System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		long time = 5000;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL
		
		
		//not a broken link 
	    String url = driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		
		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);
		System.out.println("Not a brokenLink");
		 
		Thread.sleep(1000);
		
		//broken link 
        String url1 = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection connection1 = (HttpURLConnection)new URL(url1).openConnection();
		connection1.setRequestMethod("HEAD");
		connection1.connect();
		int responseCode1 = connection1.getResponseCode();
		System.out.println(responseCode1);
		System.out.println(">400 = BrokenLink");
	
		
		Thread.sleep(2000);
		driver.quit();
		
}
	
	
}
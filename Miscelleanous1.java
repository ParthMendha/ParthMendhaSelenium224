import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class Miscelleanous1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
        ChromeOptions chromeoptions = new ChromeOptions();
        
        
        System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		
		long time = 5000;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		//maximize window
		driver.manage().window().maximize();
		
		//manage delete all cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		//take screenshot 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//to store in local pc from object src 
		FileUtils.copyFile(src ,new File("D:/SELENIUM - UDEMY/downloadFiles/screenshots/screenshot1.png"));
		
	
		Thread.sleep(2000);
		driver.quit();
		

	}

}

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class MouseScroll {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//long time = 5000;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		Thread.sleep(1000);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//java script executor for scrolling 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		

	}

}

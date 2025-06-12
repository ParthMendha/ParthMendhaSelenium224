import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {
	
public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chromedriver.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	
	//to select current date
	WebElement calendardate1 = driver.findElement(By.cssSelector(".ui-state-default.ui-state-active"));
	calendardate1.click();
	

}

}
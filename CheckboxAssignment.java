import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver" , "D:/ChromeDriver2025/chromedriver/chromedriver.exe");		
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	Thread.sleep(3000);
	
	//count for number of checkbox
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	Thread.sleep(1000);
	//check
	WebElement firstcheckboxclick = driver.findElement(By.name("checkBoxOption1"));
	firstcheckboxclick.click();
	
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	
	Thread.sleep(1000);
	//uncheck
	WebElement firstcheckboxclick1 = driver.findElement(By.name("checkBoxOption1"));
	firstcheckboxclick1.click();
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	
	Thread.sleep(5000);
	driver.close();
	

}
	
}

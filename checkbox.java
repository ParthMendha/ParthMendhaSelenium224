import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
	
			  System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe"); // please use your loacl location over here 

		      WebDriver driver = new ChromeDriver();

		      driver.manage().window().maximize();

		      Thread.sleep(1000);

		      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		      
		      
		      //count the number of total checkboxes .............................................................................
		      System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		      
		      Thread.sleep(1000);
		      //false in console 
		      System.out.println( driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		      Thread.sleep(1000);
		      
		      driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		      //true in console 
		      System.out.println( driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		      
		      
		      
		      
		      
		      
		      
		      //Thread.sleep(2000);
		      //driver.close();

	
}
	}


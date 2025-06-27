import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;


import java.util.Set;
import java.util.List;

public class Gridamount {

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
		
		Thread.sleep(1000);
		
	    List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	    int sum = 0;
	    for (int i=0;i<values.size();i++)
	    {
	      
	          sum = sum + Integer.parseInt(values.get(i).getText());
	         
	    }
	    
	    System.out.println(sum);
	    
	    
	    driver.findElement(By.cssSelector(".totalAmount")).getText();
	    
	    String[] split1 = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
	    String sumValue = split1[1].trim();
	    System.out.println(sumValue);
	    
	    int total = Integer.parseInt(sumValue);
	    
	    
	    //assertion
	    Assert.assertEquals(sum, total);
	    
	    
	    Thread.sleep(1000);
	    driver.close();

	}

}
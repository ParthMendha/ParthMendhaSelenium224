import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		
		// NOTES
		// This class is to handle autosuggestion drop down while input by user 
		
			  System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe"); // please use your loacl location over here 

		      WebDriver driver = new ChromeDriver();

		      driver.manage().window().maximize();

		      Thread.sleep(1000);

		      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		      
		      WebElement Country = driver.findElement(By.id("autosuggest"));
		      Country.sendKeys("ind");
		      
		      Thread.sleep(3000);
		      
		      //driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
		      //Thread.sleep(1000);
		      //System.out.println(driver.findElement(By.id("autosuggest")).getText());
		      
		      List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		      for(WebElement option : options) 
		      {
		    	   if(option.getText().equalsIgnoreCase("India"))
		    	   {		    	
		    		   option.click();
		    		   break;
		    		 }		
		      }
		    	 
		       
		      Thread.sleep(2000);
		      driver.close();

	
}
	}
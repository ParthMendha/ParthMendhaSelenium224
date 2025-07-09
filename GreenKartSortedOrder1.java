import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartSortedOrder1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		long time = 5000;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));


		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.findElement(By.linkText("Top Deals")).click();
		
		//window management for new tab 
		
	
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		 
		String parentId = it.next();
		String childaTab = it.next();
		
		driver.switchTo().window(childaTab);
		Thread.sleep(2000);
		
		// *--------------on child tab-------------------*
		
		//click on coloumn
		//capture the webelement into list 
		//capture text of all webelement into new list 
		//sort in the list of step 3 -> sorted list 
		//compare original list
		
		driver.findElement(By.xpath("//tr//th[1]")).click();
		
		//capture all webElement List
		List<WebElement> elementList = driver.findElements(By.xpath("//tr//td[1]"));
		
		//capture text of all WebElement into new list (Original list)
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		
		//sort in the list of step 3 -> sorted list 
		List<String> newList =originalList.stream().sorted().collect(Collectors.toList());
		//System.out.println(newList);
		
		//compare original list
		Assert.assertTrue(originalList.equals(newList));
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

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

public class GreenKartStreamPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		driver.findElement(By.xpath("//tr//th[1]")).click();
				
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tr//td[1]"));
				
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
				
				
		List<String> newList =originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(newList);
				
		
		Assert.assertTrue(originalList.equals(newList));
		
		//scan the name column with get text > beans > price
		
		List<String> price ;
		
		do {
			
		     List<WebElement> elementList1 = driver.findElements(By.xpath("//tr//td[1]"));
		     price =  elementList1.stream().filter(s->s.getText().contains("Rice"))
		     .map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		     price.forEach(a->System.out.println(a));
		
		if(price.size()<1) 
			
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			
		}
		
		}
		
		while(price.size()<1);
		
	
	}		
	

private static String getPriceVeggie (WebElement s) 
	
	{
		
	    String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	    
		return priceValue;
		
	}

	
	
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlertPopup1 {
	
	
public static void main (String[] args) throws InterruptedException {
	
		//create variables here
	
		String name = "Parth";
	
	
		System.setProperty("webdriver.chromedriver.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // URL
		Thread.sleep(1000);
		
		//input name
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys(name);
		
		Thread.sleep(1000);
		
		//alreat button click
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(1000);
		
		//alret popup get Text 
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		
	    //switch to alert - accept alert
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//click on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		
		//click on cancle via alreat popup
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		
}


}
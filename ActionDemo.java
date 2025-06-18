import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//long time = 5000;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=14584390706128635496&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061768&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		//create action aclass 
		Thread.sleep(2000);
		
		Actions a = new Actions(driver); //action method
	
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").keyUp(Keys.SHIFT).sendKeys("16").doubleClick().build().perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).contextClick().build().perform(); //hower to selected element 
		
		
		
	}

}

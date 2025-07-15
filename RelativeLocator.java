import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		long time = 5000;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));


		driver.get("https://rahulshettyacademy.com/angularpractice/"); // URL
		

        WebElement name = driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input"));
        //relative locator
        System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
        
        
        WebElement dateOfBirth = driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/label"));
        //relative locator
        driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
        
        WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        //relative locator
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

        WebElement rdb = driver.findElement(By.id("inlineRadio1"));
        //relative locator
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
        
        
        
        
        Thread.sleep(2000);
        driver.quit();

	  }


}

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GreenkartCalenderTest {

public static void main(String[] args) throws InterruptedException {

String monthNumber = "4";
String date = "22";
String year = "2027";

String[] expectedList = {monthNumber,date,year};


System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe"); //chrome driver setup and loaction 

WebDriver driver = new ChromeDriver();


driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");


driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
Thread.sleep(1000);

driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
Thread.sleep(1000);

driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
Thread.sleep(1000);

driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
Thread.sleep(1000);

List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

    for(int i =0; i<actualList.size();i++)

       {
	
           Thread.sleep(1000);
           System.out.println(actualList.get(i).getAttribute("value"));

           Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

      }


  }


}


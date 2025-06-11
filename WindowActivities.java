import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://google.com");

Thread.sleep(5000);
driver.navigate().to("https://rahulshettyacademy.com");
Thread.sleep(4000);

driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();

Thread.sleep(5000);

driver.close();



//.........................


// https://rahulshettyacademy.com/dropdownsPractise/


// ........................
}

}
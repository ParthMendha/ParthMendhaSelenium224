import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown1 {

public static void main(String[] args) throws InterruptedException  {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
Thread.sleep(1000);

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

Thread.sleep(3000);

// static drop down method 
WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select dropdown = new Select(staticDropdown);

dropdown.selectByIndex(1);// select by index
System.out.println(dropdown.getFirstSelectedOption().getText());
Thread.sleep(2000);

dropdown.selectByVisibleText("AED"); // select by vivsible text 
System.out.println(dropdown.getFirstSelectedOption().getText());
Thread.sleep(2000);



dropdown.selectByValue("USD"); // select bu value
System.out.println(dropdown.getFirstSelectedOption().getText());

Thread.sleep(1000);









}

}
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenkartIMPLIWAIT {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");


WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

//implicit wait for 5 sec globally 
long time = 5000;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));


String[] itemsNeeded= {"Cucumber","Brocolli","Cauliflower","Beetroot"};

driver.get("https://rahulshettyacademy.com/seleniumPractise/");

//Thread.sleep(3000);

//method to add items 
addItems(driver,itemsNeeded);

//cart button click
driver.findElement(By.cssSelector("img[alt='Cart']")).click();

//proceed to checkkout button click 
driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();

//Thread.sleep(3000);
driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

driver.findElement(By.cssSelector("button.promoBtn")).click();

//explicitwait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo"))));


System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


Thread.sleep(1000);
driver.close();

}


public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));


for(int i=0;i<products.size();i++)


{


//Brocolli - 1 Kg

//Brocolli,    1 kg

String[] name = products.get(i).getText().split("-");

String formattedName = name[0].trim();


//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-


List itemsNeededList = Arrays.asList(itemsNeeded);



if(itemsNeededList.contains(formattedName))

{


j++;

//click on Add to cart

driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();


if(j==itemsNeeded.length)

{

break;

}


}

}

}


}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

public static void main(String[] args) throws InterruptedException  {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

Thread.sleep(1000);

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

Thread.sleep(3000);

WebElement Passenger = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[2]")); 
Passenger.click();
Thread.sleep(1000);

System.out.println(driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[2]")).getText());

Thread.sleep(2000);


for(int i=1 ; i<5 ; i++)
{
	driver.findElement(By.id("hrefIncAdt")).click(); 
}

WebElement DoneButton = driver.findElement(By.xpath("//*[@id=\"btnclosepaxoption\"]")); 
DoneButton.click();

Thread.sleep(2000);

System.out.println(driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[2]")).getText());


//2nd round for while loop 

WebElement Passenger1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[2]")); 
Passenger1.click();

Thread.sleep(2000);

int j = 1;
while(j<5) {
	
	driver.findElement(By.id("hrefDecAdt")).click();
	j++;
	
}

Thread.sleep(2000);

WebElement DoneButton1 = driver.findElement(By.xpath("//*[@id=\"btnclosepaxoption\"]")); 
DoneButton1.click();

Thread.sleep(2000);

System.out.println(driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[2]")).getText());


Thread.sleep(1000);

driver.close();


}

}
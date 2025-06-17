import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class spicejettmenuendtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//long time = 5000;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(2000);
		
		WebElement firstdestination = driver.findElement(By.xpath("//input[@value='Delhi (DEL)']"));
		firstdestination.click(); 
		
		Thread.sleep(2000);
		
		WebElement firstdestinationinput = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input"));
		firstdestinationinput.sendKeys("C");
		
		Thread.sleep(2000);
		
        List<WebElement> city1 = driver.findElements(By.cssSelector("div.css-1dbjc4n.r-1awozwy.r-1loqt21.r-18u37iz.r-1wtj0ep.r-b5h31w.r-rnv2vh.r-5njf8e.r-1otgn73 div div div"));
        
        for(WebElement options : city1) {
        	if(options.getText().equalsIgnoreCase("Coimbatore"))
	    	   {		    	
	    		   options.click();
	    		   break;
	    		 }	
        	
        }
        
        Thread.sleep(2000);
        
        // driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div")).click();
        
        WebElement seconddestinationinput = driver.findElement(By.cssSelector("div[data-testid='to-testID-destination'] input[type='text']"));
        seconddestinationinput.sendKeys("A");
        
        Thread.sleep(1000);
        
        List<WebElement> city2 = driver.findElements(By.cssSelector("div.css-1dbjc4n.r-1awozwy.r-1loqt21.r-18u37iz.r-1wtj0ep.r-b5h31w.r-rnv2vh.r-5njf8e.r-1otgn73 div div div"));
        
        for(WebElement optionss : city2) {
        	if(optionss.getText().equalsIgnoreCase("Ahmedabad"))
	    	   {		    	
	    		   optionss.click();
	    		   break;
	    		 }	
        	
        }
        
        Thread.sleep(1000);
        
       driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
       
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).click();
       
       Thread.sleep(2000);
       
       for(int i=1 ; i<6 ; i++)
    	   {
    	   	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click(); 
    	   }
       Thread.sleep(1000);   
       driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]")).click();
       
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
       
       Thread.sleep(2000);
       
       
       /*
       WebElement Dropdown1 = driver.findElement(By.cssSelector("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]"));
	   Dropdown1.click();
       Select dropdown = new Select(Dropdown1);
       dropdown.selectByVisibleText("USD"); 
       
       */
       
       driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();
       
	}

}

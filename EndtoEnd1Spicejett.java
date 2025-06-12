import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd1Spicejett {
	
	
public static void main (String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chromedriver.driver", "D:/ChromeDriver2025/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL
		
		//autosugession drop down .......................................................................................................................................................
		WebElement Country = driver.findElement(By.id("autosuggest"));
	      Country.sendKeys("ind");
	      
	      Thread.sleep(3000);
	      
	      List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	      for(WebElement option : options) 
	      {
	    	   if(option.getText().equalsIgnoreCase("India"))
	    	   {		    	
	    		   option.click();
	    		   break;
	    		 }		
	      }
	    	 
	      Thread.sleep(2000);

		//dynamic drop down .........................................................................................................................................................
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		Thread.sleep(3000);
		
		//calender selection with validation of return date block is disable .......................................................................................................
		WebElement calendardate1 = driver.findElement(By.cssSelector(".ui-state-default.ui-state-active"));
		calendardate1.click();
	
		
		//Tt should select ONE WAY to GET DISABLE CALENDER BLOCK - 0.5 valuse or User need to change or click it manually by adding one step for click
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{

		System.out.println("its Disable");

		Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
        }
		
		Thread.sleep(3000);
		
		
        //dropdown2........................................................................................................................................................................
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
		while(j<2) {
			
			driver.findElement(By.id("hrefDecAdt")).click();
			j++;
			
		}

		Thread.sleep(2000);

		WebElement DoneButton1 = driver.findElement(By.xpath("//*[@id=\"btnclosepaxoption\"]")); 
		DoneButton1.click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[6]/div[2]")).getText());


		Thread.sleep(1000);
		
		
		// static drop down method ........................................................................................................................................................
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
		
		//checkbox ..........................................................................................................................................................................
		 
		  //count the number of total checkboxes 
	      System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	      
	      Thread.sleep(1000);
	      
	      
	      //false in console 
	      System.out.println( driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	      Thread.sleep(1000);
	      
	      driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	      //true in console 
	      System.out.println( driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	      
	      Thread.sleep(2000);
	      
	      //submit button finaleee
	      driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	      
	      
	     
	     Thread.sleep(5000);
		 driver.close();

	     
		
}

}
package Report01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxControl {
	public WebDriver driver;
  @Test
  public void functionality() {
	  
	  driver.findElement(By.name("q")).sendKeys("Google");
	  
	 List<WebElement> allvalueslist = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
	  for (int i = 0; i < allvalueslist.size(); i++) {
		  
		  System.out.println(allvalueslist.get(i).getText());
		  
		  if (allvalueslist.get(i).getText().contains("google pixel 4 xl")) {
			  
			  allvalueslist.get(i).click();
			   break;	  
			
		}
		
	}
	}
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","G:\\Mithaiwala_Sweets_2020\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
   }
 }

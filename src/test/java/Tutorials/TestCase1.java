package Tutorials;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



//Test Case 1: Check if there is any Tutorials module and what is the title of Tutorials Module
public class TestCase1 {
  @Test
  public void Test1() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/");
      
	  WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Tutorials')]"));
      if (loginLink != null) {
          System.out.println("Test Case 1: Tutorials page is present.");
          loginLink.click();
          try {
        	  String pageTitle = driver.getTitle();
              System.out.println("Test Case 1: Page title is " + pageTitle);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
          
      } else {
          System.out.println("Test Case 1: Tutorials Page is not found.");
      }
      driver.close();
	  }  
  
}

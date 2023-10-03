package Shop;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


//Test Case 1: Check if the search input is present or not
public class TestCase1 {
  @Test
  public void Test1() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  WebDriver driver = new FirefoxDriver(firefoxOptions);
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  driver.get("https://shop.hishabee.business/");
	  
	  try {
	      WebElement searchInput = driver.findElement(By.id("category"));
	      if (searchInput != null) {
	          System.out.println("Test Case 1: Search bar is available on the webpage.");      
	          } 
	      else {
	          System.out.println("Test Case 1: Search bar is not available on the webpage.");
	      }
	  } catch (Exception e) {
	      System.out.println("Test Case 1: Search bar is not available on the webpage.");
	      e.printStackTrace();
	  } finally {
	     driver.quit();
	  }
	}
	}
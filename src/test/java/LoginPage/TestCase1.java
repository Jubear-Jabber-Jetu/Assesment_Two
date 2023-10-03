package LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


//Test Case 1: Verify the title of the page
public class TestCase1 {
  @Test
  public void Test1() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/");
      
      // Test Case 1: Verify the title of the page
      String pageTitle = driver.getTitle();
      if (pageTitle.equals("Hishabee Business")) {
          System.out.println("Test Case 1: Page title is correct.");
      } else {
          System.out.println("Test Case 1: Page title is incorrect. The correct titel is " + pageTitle);
      }
      driver.quit();
	  }
  
}

package Download;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Test Case 2: Check if there is any form on this page
public class TestCase2 {
  @Test
  public void Test2() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/");
      
	  WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Download')]"));
	  loginLink.click();	 
	  try {
          WebElement formElement = driver.findElement(By.tagName("form"));
          if (formElement.isDisplayed() && formElement.isEnabled()) {
              System.out.println("Form is available on the page.");
          } else {
              System.out.println("Form is not available on the page.");
          }
      } catch (Exception e) {
          System.err.println("An error occurred: " + e.getMessage());
      } finally {
          driver.quit();
      }
  }
}




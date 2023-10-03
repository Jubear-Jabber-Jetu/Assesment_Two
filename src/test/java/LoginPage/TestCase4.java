package LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//Test Case 4: Verify Placeholder Text in the Mobile Number Field
public class TestCase4 {
  @Test
  public void Test4() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/");
      
	  WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Web login')]"));
	  loginLink.click();
	  
	  try {
          WebElement inputElement = driver.findElement(By.className("form-control"));
          String placeholderValue = inputElement.getAttribute("placeholder");
          WebDriverWait wait2 = new WebDriverWait(driver, 10);
          if (placeholderValue != null && !placeholderValue.isEmpty()) {
              System.out.println("Test Case 4: Passed." + placeholderValue);
          } else {
              System.out.println("Test Case 4: No Placeholder Value");
          }
      } catch (Exception e) {
          System.err.println("Test Case 4: Failed. An error occurred: " + e.getMessage());
      } 
      
      driver.close();
	  }
}

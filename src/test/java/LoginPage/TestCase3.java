package LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


//Test Case 3: Verify the Presence of the Mobile Number Input Field
public class TestCase3 {
  @Test
  public void Test3() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/");
      
	  WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Web login')]"));
      
          loginLink.click();
          try {
              WebElement mobileNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.form-control")));
              System.out.println("Test Case 3: Passed");
          } catch (org.openqa.selenium.TimeoutException e) {
              System.out.println("Test Case 3: Failed - Element not found or not visible within the specified timeout");
          }
      driver.close();
	  }
}

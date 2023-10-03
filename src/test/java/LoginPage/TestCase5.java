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
import org.testng.annotations.Test;


//Test Case 5: Verify if the mobile number can be inputed or not
public class TestCase5 {
  @Test
  public void Test5() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://web.hishabee.business/sign-in");
      try {
          // Locate the input element
         WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.form-control")));
         inputElement.sendKeys("01684300844");
         inputElement.submit();
         
      } catch (Exception e) {
          System.err.println("An error occurred: " + e.getMessage());
      }
    
      driver.close();
	  }
}

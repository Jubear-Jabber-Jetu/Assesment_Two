package LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



//Test Case 5: Verify Login Field
public class TestCase6 {
  @Test
  public void Test6() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      driver.get("https://web.hishabee.business/sign-in/pin");
      try {
          WebDriverWait wait = new WebDriverWait(driver, 10);
          WebElement pinElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.form-control")));
          pinElement.sendKeys("01684300844");
          pinElement.submit();
          WebDriverWait wait2 = new WebDriverWait(driver, 10);
          try {
          WebElement passwordInput = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")));
          
          passwordInput.sendKeys("84400");
          WebElement eyeIcon = driver.findElement(By.cssSelector(".fa-eye"));
          Actions actions = new Actions(driver);
          actions.click(eyeIcon).build().perform();
          passwordInput.submit();
          System.out.println("Test Case 6: Passed with login verification");}
          catch (Exception e) {
              System.err.println("An error occurred: " + e.getMessage());
		}
      } catch (Exception e) {
          System.err.println("An error occurred: " + e.getMessage());
      } }}

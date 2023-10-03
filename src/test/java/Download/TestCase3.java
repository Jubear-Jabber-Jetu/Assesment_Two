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

//Test Case 3: Check Footer Text Content on this page
public class TestCase3 {
  @Test
  public void Test3() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/");
      
	  WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Download')]"));
	  loginLink.click();	 

      try {
          WebElement footerElement = driver.findElement(By.cssSelector(".elementor-widget-container p"));
          String footerText = footerElement.getText();
          System.out.println("Footer Text: " + footerText);
          if (footerText.contains("© 2022 Hishabee Business Manager. All Rights Reserved, Hishabee Technologies Limited")) {
              System.out.println("Footer text is as expected.");
          } else {
              System.out.println("Footer text does not match the expected content.");
          }
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          // Close the WebDriver
          driver.quit();
      }
  }
}



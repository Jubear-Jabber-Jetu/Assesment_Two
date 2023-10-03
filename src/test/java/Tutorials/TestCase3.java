package Tutorials;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



//Test Case 3: Verify the Navigation and Information Retrieval from "Learn More" Links

public class TestCase3 {
  @Test
  public void Test3() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/help/category/how-to-use/");
      try {
          WebElement learnMoreLink = driver.findElement(By.cssSelector(".eckb-article-container:first-child .eckb-article-read-more"));
          learnMoreLink.click();
          Thread.sleep(5000);
          System.out.println("Current Page Title: " + driver.getTitle());
          System.out.println("Current Page URL: " + driver.getCurrentUrl());
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          // Close the browser
          driver.quit();
      }
  }
}
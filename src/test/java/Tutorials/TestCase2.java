package Tutorials;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



//Test Case 2: Verify the Titles and URLs of Articles
public class TestCase2 {
  @Test
  public void Test2() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/help/category/how-to-use/");
      try {
          java.util.List<WebElement> articleTitles = driver.findElements(By.cssSelector("h2 a"));
          for (WebElement articleTitle : articleTitles) {
              System.out.println("Article Title: " + articleTitle.getText());
              System.out.println("Article URL: " + articleTitle.getAttribute("href"));
              System.out.println(); // Add a newline for readability
          }
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          driver.quit();
      }
  }
}
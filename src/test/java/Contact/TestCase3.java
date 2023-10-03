package Contact;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase3 {
  @Test
  public void Test3() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/contact-us/");
      try {
          // Locate all the social media link elements
          List<WebElement> socialMediaLinks = driver.findElements(By.cssSelector("a.elementor-icon.elementor-social-icon"));

          // Print the URLs of each social media link
          for (WebElement link : socialMediaLinks) {
              String url = link.getAttribute("href");
              System.out.println("Social Media Link URL: " + url);
          }
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          // Close the WebDriver
          driver.quit();
  }
}}

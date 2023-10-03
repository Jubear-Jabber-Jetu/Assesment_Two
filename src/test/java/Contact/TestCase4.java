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


//Test Case 4: Check social media link for Facebook is available or not
public class TestCase4 {
  @Test
  public void Test4() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/contact-us/");
      try {
          
          List<WebElement> socialMediaLinks = driver.findElements(By.cssSelector("a.elementor-icon.elementor-social-icon"));
          boolean facebookURLFound = false;
          for (WebElement link : socialMediaLinks) {
              String url = link.getAttribute("href");
              if (url.contains("facebook.com")) {
                  facebookURLFound = true;
                  System.out.println("Test Case 4: Facebook URL is found.");
                  driver.get(url);
                  break; 
              }
          }
          if (!facebookURLFound) {
              System.out.println("Test Case 4: Facebook URL not found.");
          }
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          driver.quit();
  }
}
  }

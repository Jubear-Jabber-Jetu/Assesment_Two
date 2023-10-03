package Contact;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


//Test Case 5: Check Address Map link  is available or not
public class TestCase5 {
  @Test
  public void Test5() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/contact-us/");
      try {
    	  WebElement mapIframe = driver.findElement(By.tagName("iframe"));
          if (mapIframe != null) {
              System.out.println("Map is available on the webpage.");
          } else {
              System.out.println("Map is not available on the webpage.");
          }
      } catch (Exception e) {
          System.out.println("Map is not available on the webpage.");
          e.printStackTrace();
      } finally {
          driver.quit();
  }
}
  }

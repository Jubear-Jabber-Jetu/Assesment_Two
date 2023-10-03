package Shop;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


//Test Case 3: Check what "Printer & Business Accessories" option in Categories is present or not
public class TestCase3 {
  @Test
  public void Test3() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  WebDriver driver = new FirefoxDriver(firefoxOptions);
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  driver.get("https://shop.hishabee.business/");

      try {
          WebElement categoryDropdown = driver.findElement(By.id("category"));
          Select select = new Select(categoryDropdown);
          List<WebElement> options = select.getOptions();

          boolean foundCategory = false;

          for (WebElement option : options) {
              String categoryName = option.getText();
              if (categoryName.equals("Printer & Business Accessories")) {
                  foundCategory = true;
                  break;
              }
          }

          if (foundCategory) {
              System.out.println("Test Case 3: Category 'Printer & Business Accessories' is available.");
          } else {
              System.out.println("Test Case 3: Category 'Printer & Business Accessories' is not available.");
          }
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          driver.quit();
      }
  }
}
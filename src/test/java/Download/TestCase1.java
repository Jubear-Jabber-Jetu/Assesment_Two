package Download;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



//Test Case 1: Check if there is any Download module
public class TestCase1 {
  @Test
  public void Test1() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Walton\\OneDrive\\Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      WebDriver driver = new FirefoxDriver(firefoxOptions);
      WebDriverWait wait = new WebDriverWait(driver, 10);
      driver.get("https://hishabee.business/");
      
	  WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Download')]"));
      if (loginLink != null) {
          System.out.println("Test Case 1: Download page is present.");
          loginLink.click();
      } else {
          System.out.println("Test Case 1: Download Page is not found.");
      }
      driver.close();
	  }
}

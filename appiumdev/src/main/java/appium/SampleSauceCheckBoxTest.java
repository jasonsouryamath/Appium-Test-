package appium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
 
public class SampleSauceCheckBoxTest {
 
  public static final String USERNAME = "YOUR_USERNAME";
  public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  public static void main(String[] args) throws Exception {
 
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
    capabilities.setCapability("platformVersion", "4.4");
    capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
    capabilities.setCapability("browserName", "");
    capabilities.setCapability("deviceOrientation", "portrait");
    capabilities.setCapability("appiumVersion", "1.5.3");
 
    WebDriver driver = new AndroidDriver<WebElement>(new URL(URL), capabilities);
 
    /**
     * Test Actions here...
     */
 
    driver.quit();
  }
}
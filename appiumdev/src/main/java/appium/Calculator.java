package appium;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Calculator {
WebDriver driver; 

@BeforeClass
public void setUp() throws MalformedURLException{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME","Android");
	capabilities.setCapability("VERSION","4.4.2");
	capabilities.setCapability("devicename","Emulator");
	capabilities.setCapability("platformname","Android");
	
	
	capabilities.setCapability("appPackage","com.android.calculator2");
	capabilities.setCapability("appActivity","com.android.calculator2.calculator");
	driver = new RemoteWebDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
}

@Test 
public void testCal() throws Exception {
	WebElement two =driver.findElement(By.name("4"));
	two.click();
	WebElement plus =driver.findElement(By.name("+"));
	plus.click();
	WebElement four =driver.findElement(By.name("4"));
	four.click();
	WebElement equalTo =driver.findElement(By.name("="));
	equalTo.click();
}





}


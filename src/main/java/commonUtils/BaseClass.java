package commonUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver = null;
	
	@BeforeClass
	public void setup() throws InterruptedException 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Motorola One Power");
		caps.setCapability("udid", "ZF6223XWSS"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("appPackage", "accenture.cloud.ngm.com");
		caps.setCapability("appActivity", "accenture.cas.ngm.com.MainActivity");
		caps.setCapability("noReset", true);
			
		try 
		{
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
				
		}catch (MalformedURLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	@AfterClass
	public void teardown() 
	{
		driver.quit();
	}
}

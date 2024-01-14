package APPIUM_MOBILE_TESTING_001;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SauceLabsTest1 {
	static AndroidDriver driver;
	public void test1() throws InterruptedException
	{
		System.out.println("---Login Test---");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("test-Username")).sendKeys("standard_user");
		driver.findElement(AppiumBy.accessibilityId("test-Password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("test-LOGIN")).click();
		Thread.sleep(2000);
		String txt=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"PRODUCTS\"]")).getText();
		if(txt.equals("PRODUCTS"))
		{
			System.out.println("Login Assertion Passed");
			
		}
		else
		{
			System.out.println("Login Assertion Failed");
		}
		System.out.println("---Logout Test---");
		driver.findElement(AppiumBy.accessibilityId("test-Menu")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("test-LOGOUT")).click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("LOGIN"))
		{
			System.out.println("Logout Assertion Passed");
		}
		else
		{
			System.out.println("Logout Assertion Failed");
		}
		
		
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UI_AutomatorOptions options=new UI_AutomatorOptions();
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options.getSauceLabDemo());
		SauceLabsTest1 sl=new SauceLabsTest1();
		sl.test1();		
	}

}

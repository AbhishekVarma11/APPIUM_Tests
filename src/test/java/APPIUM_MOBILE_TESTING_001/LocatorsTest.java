package APPIUM_MOBILE_TESTING_001;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LocatorsTest {
	static AndroidDriver driver;
	public void locatersTestMethod()
	{
		driver.findElement(AppiumBy.accessibilityId("Content")).click();
		int contentSize=driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).size();
		System.out.println(contentSize);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Assets\"]")).click();
		
		
		driver.findElement(AppiumBy.xpath("//*[contains(@text,'Read')]")).click();
		String text=driver.findElement(AppiumBy.xpath("//*[@resource-id=\"io.appium.android.apis:id/text\"]")).getText();
		System.out.println(text);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		
		
		
		
	}



	public static void main(String[] args) throws MalformedURLException {
		UI_AutomatorOptions options=new UI_AutomatorOptions();
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options.getAPIDemoAPKOoptions());
		LocatorsTest lt=new LocatorsTest();
		lt.locatersTestMethod();
		

	}

}

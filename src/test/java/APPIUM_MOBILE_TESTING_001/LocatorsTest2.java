package APPIUM_MOBILE_TESTING_001;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LocatorsTest2 {
		static AndroidDriver driver;
		
		
		public void locatersTestMethod()
		{
			
			//List<WebElement> list=driver.findElements(AppiumBy.xpath("//*[@resource-id='android:id/text1']"));
			List<WebElement> list=driver.findElements(AppiumBy.className("android.widget.TextView"));
			for(WebElement ele:list)
			{
				System.out.println(ele.getText());
			}
			
			String var=driver.findElement(By.xpath("//*[contains(@text,'App')]")).getAttribute("name");
			System.out.println(var);
			String bounds=driver.findElement(By.xpath("//*[contains(@text,'App')]")).getAttribute("bounds");
			System.out.println(bounds);
			
			
			
			
		}



		public static void main(String[] args) throws MalformedURLException {
			UI_AutomatorOptions options=new UI_AutomatorOptions();
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options.getAPIDemoAPKOoptions());
			LocatorsTest2 lt=new LocatorsTest2();
			lt.locatersTestMethod();
			

		

	}


}

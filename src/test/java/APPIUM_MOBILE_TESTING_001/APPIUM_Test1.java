package APPIUM_MOBILE_TESTING_001;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class APPIUM_Test1 {
	static AndroidDriver driver;
	public void Test_APP1()
	{
		System.out.println("---executing test1---");
		driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility Service\"]")).click();
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/button")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		System.out.println("--done----");
		}

	public static void main(String[] args) throws MalformedURLException {
		UI_AutomatorOptions options=new UI_AutomatorOptions();
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options.getAPIDemoAPKOoptions());
		APPIUM_Test1 a1=new APPIUM_Test1();
		a1.Test_APP1();
	}

}

package APPIUM_MOBILE_TESTING_001;

import java.io.File;

import io.appium.java_client.android.options.UiAutomator2Options;

public class UI_AutomatorOptions {
	
	public UiAutomator2Options getAPIDemoAPKOoptions()
	{
		System.out.println("--using API Demo APK---");
		ClassLoader classLoader=getClass().getClassLoader();
		File file=new File(classLoader.getResource("builds/ApiDemos-debug.apk").getFile());
		String apkPath=file.getAbsolutePath();
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setPlatformVersion("9.0");
		options.setDeviceName("emulator-5554");
		options.setAutomationName("UIAutomator2");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity(".ApiDemos");
		options.setApp(apkPath);
		options.setNoReset(false);
		
		return options;
		
		
	}
	public UiAutomator2Options getSauceLabDemo()
	{
		System.out.println("--using Sauce Lab Demo APK---");
		ClassLoader classLoader=getClass().getClassLoader();
		File file=new File(classLoader.getResource("builds/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk").getFile());
		String apkPath=file.getAbsolutePath();
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setPlatformVersion("9.0");
		options.setDeviceName("emulator-5554");
		options.setAutomationName("UIAutomator2");
		options.setAppPackage("com.swaglabsmobileapp");
		options.setAppActivity(".MainActivity");
		options.setApp(apkPath);
		options.setNoReset(false);
		
		return options;
		
	}

}

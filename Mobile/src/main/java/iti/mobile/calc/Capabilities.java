package iti.mobile.calc;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class Capabilities {

	private static final String	ANDROID = "Android";
	
	DesiredCapabilities capacidade = null;
	
	public Capabilities () {
		this.capacidade = new DesiredCapabilities();
		this.capacidade.setCapability("platformName", ANDROID);
		this.capacidade.setCapability("deviceName", "Android");
		this.capacidade.setCapability("automationName", "uiautomator2");
		this.capacidade.setCapability("appPackage", "com.android.calculator2");
		this.capacidade.setCapability("appActivity", "com.android.calculator2.Calculator");
		}
	public DesiredCapabilities getCapabilities() {
		return this.capacidade;
		
	}
}

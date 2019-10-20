package iti.mobile.calc;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	public AndroidDriver<MobileElement> driver;
	public App baseApp;
	
	@Before
	public void abrirApp() throws MalformedURLException {
		URL remoteUrl = new URL ("http://localhost:4723/wd/hub");
		Capabilities mobileCapabilitie = new Capabilities();
		driver = new AndroidDriver<MobileElement>(remoteUrl, mobileCapabilitie.getCapabilities());
		baseApp = new App(driver);
	}
	
	@After
	public void fecharApp() {
		driver.quit();
	}

}

package iti.mobile.calc;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class App {
	public AppiumDriver<MobileElement> driver;
	
	public App(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.android.calculator2:id/result")
	public MobileElement _lblPegarResultado;
	
	
	/*Metodos que recebem como parametro o valor do botão desejado 
	 * Ex: clicarNumero recebe String "Numero desejado" ou "6"
	 * Ex: clicarOperador recebe o nome dos operadores como descrito abaixo:
	 * + = plus
	 * - = minus
	 * * = multiply
	 * / = divide 
	 * DEL = delete
	 * = == equals
	 */
	
	//---------------Action--------------------------
	
	public void clicarNumeros(String num) {
		driver.findElementByXPath("//android.widget.Button[contains(@text,'"+num+"')]").click();
	}
	
	public void clicarOperador(String operador) {
		driver.findElementByXPath("//android.widget.Button[@content-desc='"+operador+"']").click();
	}
	
	public String pegarResultado() {
		String text = _lblPegarResultado.getText();
		return text;
	}
}

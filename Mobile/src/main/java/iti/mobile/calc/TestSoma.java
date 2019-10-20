package iti.mobile.calc;

import org.junit.Assert;
import org.junit.Test;

public class TestSoma extends BaseTest{

	@Test
	public void testeSoma() {
		baseApp.clicarNumeros("2");
		baseApp.clicarOperador("plus");
		baseApp.clicarNumeros("3");
		baseApp.clicarOperador("equals");
		Assert.assertEquals("5", baseApp.pegarResultado());
	}
	
	@Test
	public void testeSubtraçao() {
		baseApp.clicarNumeros("5");
		baseApp.clicarOperador("minus");
		baseApp.clicarNumeros("3");
		baseApp.clicarOperador("equals");
		Assert.assertEquals("2", baseApp.pegarResultado());
	}
}

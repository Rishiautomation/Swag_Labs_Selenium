package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.LoginPage;
import bsh.BshClassManager.Listener;

public class HomepageTest extends BaseClass{

	@Test
	public void TC_01AddtoCartTest() {
		
		Homepage Hp =new Homepage();
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
		Hp.HomepageVerification();
		Hp.AddingtoCart("Sauce Labs Backpack");
		Hp.VerifyNumberofItemadded(1);
		
	}
	
}

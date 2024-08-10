package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestListener;
import Pages.LoginPage;
import bsh.BshClassManager.Listener;
@Listeners(MyListerners.class)
public class LoginTest extends BaseClass {
	
	@Test
	public void loginSucessTest() {
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
	}
	
	@Test
	public void LoginFailureTest() {
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "1234");
		lp.LoginFaliure("Epic sadface:  and password do not match any user in this service");
	}
	
	@Test
	public void LockedUser() {
		LoginPage lp = new LoginPage();
		lp.LoginFunction("locked_out_user", "secret_sauce");
		lp.lockedUser("Epic sadface: Sorry, this user has been locked out.");
	}
}

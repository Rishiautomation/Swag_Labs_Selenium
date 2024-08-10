package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCases.BaseClass;
import junit.framework.Assert;

public class LoginPage {
  WebDriver driver = BaseClass.driver;
	
  @FindBy(id="user-name")
  WebElement UserName;
  
  @FindBy(id="password")
  WebElement Password;
  
  @FindBy(id="login-button")
  WebElement LgnBtn;
  
  @FindBy(xpath="//h3[@data-test='error']")
  WebElement Errormessage;  
  
  @FindBy(xpath="//h3[@data-test='error']")
  WebElement LockedUser;
  
  public LoginPage() {
		PageFactory.initElements(driver, this);
	}
  
  public void LoginFunction(String Username, String Pwd) {
	  UserName.sendKeys(Username);
	  Password.sendKeys(Pwd);
	  LgnBtn.click();
  }
  
  public void LoginFaliure(String ExpMsg) {
	  String ActMsg =Errormessage.getText();
	  Assert.assertEquals(ExpMsg, ActMsg);
  }
  
  public void lockedUser(String ExpMsg) {
	  String ActMsg=LockedUser.getText();
	  Assert.assertEquals(ExpMsg, ActMsg);
  }
}

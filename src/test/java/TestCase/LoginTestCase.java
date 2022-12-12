package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class LoginTestCase extends BaseClass{
	
		
	@Test()
	public void LoginTest() throws IOException, InterruptedException {
		driver.manage().window().maximize();
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.enterUserName().sendKeys(Constant.username);
		lpo.enterPassword().sendKeys(Constant.password);
		lpo.ClickOnLogin().click();
		CommonMethods.Assertion(lpo.ErrorMsg().getText(), Constant.erroMessage);
		
	}
	
	
}

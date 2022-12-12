package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constant;

public class SignUpTest extends BaseClass {
	
	@Test()
	public void SignUp() throws IOException, InterruptedException {
			
		LoginPageObjects lpo=new LoginPageObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		lpo.clickOnTrytoFree().click();
		Thread.sleep(2000);
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		spo.enterFirsName().sendKeys(Constant.firstName);
		spo.enterLastName().sendKeys(Constant.lastName);
		spo.enterWorkEmail().sendKeys(Constant.email);
		//CommonMethods.Dropdown(spo.SelectJobTitle(), 1);
		//spo.enterCompanyName().sendKeys(Constant.companyName);
		Thread.sleep(2000);
		CommonMethods.Dropdown(spo.SelectEmployee(), 2);
		Thread.sleep(2000);
		spo.enterPhoneNo().sendKeys(Constant.phone);
		Thread.sleep(2000);
		CommonMethods.Dropdown(spo.SelectCountry(), 2);
		spo.clickOnAgreeChkbox().click();
		
	}

}

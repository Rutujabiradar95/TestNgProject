package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Resources.BaseClass;

public class Launch extends BaseClass{
	@BeforeTest
	public void launch() throws IOException {
		BrowserLounch();
		driver.get("https://login.salesforce.com/");
	}
}

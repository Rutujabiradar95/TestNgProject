package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	
	public void BrowserLounch() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\frames\\eclipse-workspace\\Selenium19SepTestNGProject\\src\\main\\java\\Resources\\data.properties");
		Properties pr=new Properties();
		pr.load(fis);
		
		String browserName=pr.getProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome")) {
		 driver=new ChromeDriver();
			
		}else {
			System.out.println("Please enter valid browser name");
		}
		//driver.get("https://login.salesforce.com/");
	}
	@BeforeMethod
	public void launch() throws IOException {
		BrowserLounch();
		driver.get("https://login.salesforce.com/");
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}

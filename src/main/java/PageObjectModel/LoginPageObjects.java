package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public  WebDriver driver;
		private By username=By.xpath("//input[@id='username']");
		private By password=By.xpath("//input[@id='password']");
		private By loginbtn=By.xpath("//input[@id='Login']");
		private By trytofree=By.xpath("//a[@id='signup_link']");
		private By errorMsg=By.xpath("//div[@id='error']");
				
		public LoginPageObjects(WebDriver driver2) {
			// TODO Auto-generated constructor stub
			  this.driver=driver2;
		}		
		public WebElement enterUserName() {
			return driver.findElement(username);
		}
		public WebElement enterPassword() {
			return driver.findElement(password);
		}
		public WebElement ClickOnLogin() {
			return driver.findElement(loginbtn);
		}
		public WebElement clickOnTrytoFree() {
			return driver.findElement(trytofree);
		}
		public WebElement ErrorMsg() {
			return driver.findElement(errorMsg);
		}
	}

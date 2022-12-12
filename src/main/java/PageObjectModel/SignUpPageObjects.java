package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	public WebDriver driver;
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By WorkEmail=By.xpath("//input[@name='UserEmail']");
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	private By Company=By.xpath("//input[@name='CompanyName']");
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By AgreeCheckBox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterFirsName() {
		return driver.findElement(FirstName);
	}
	public WebElement enterLastName() {
		return driver.findElement(LastName);
	}
	public WebElement enterWorkEmail() {
		return driver.findElement(WorkEmail);
	}
	public WebElement SelectJobTitle() {
		return driver.findElement(JobTitle);
	}
	public WebElement enterCompanyName() {
		return driver.findElement(Company);
	}
	public WebElement SelectEmployee() {
		return driver.findElement(Employees);
	}
	public WebElement enterPhoneNo() {
		return driver.findElement(Phone);
	}
	public WebElement SelectCountry() {
		return driver.findElement(Country);
	}
	public WebElement clickOnAgreeChkbox() {
		return driver.findElement(AgreeCheckBox);
	}
}

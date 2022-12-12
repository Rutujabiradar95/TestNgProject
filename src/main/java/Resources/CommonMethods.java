package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	
	public static void Dropdown(WebElement dropdown,int index) {
		Select s=new Select(dropdown);
		s.selectByIndex(index);
	}

	public static void Assertion(String actualString, String expectedString) {
		SoftAssert sa=new SoftAssert();
		String Actual=actualString;
		String Expected=expectedString;
		sa.assertEquals(Actual, Expected);
		sa.assertAll();
		
	}
}	

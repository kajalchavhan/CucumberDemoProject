package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

public static void handleAssersions(String at,String et,String Msg) {
		
		SoftAssert assertions =new SoftAssert();
		assertions.assertEquals(at, et, Msg);
		assertions.assertAll();
		
	}
    public static void handleDropdown(WebElement a, int index) {
	  Select s = new Select(a);
    s.selectByIndex(index);
    }
}

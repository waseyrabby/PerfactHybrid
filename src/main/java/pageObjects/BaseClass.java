package pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by wasey on 8/29/16.
 */

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

}

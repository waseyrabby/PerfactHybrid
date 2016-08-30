package pageObjects;
        import org.openqa.selenium.*;

import utility.Log;


/**
 * Created by wasey on 8/29/16.
 */

    public class LogIn_Page extends BaseClass {
           private static WebElement element = null;
        
        public LogIn_Page(WebDriver driver){
            	super(driver);
        }     
        public static WebElement txtbx_UserName() throws Exception{
        	try{
	            element = driver.findElement(By.name("j_username"));
	            Log.info("Username text box is found on the Login Page");
        	}catch (Exception e){
           		Log.error("UserName text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Password() throws Exception{
        	try{
	        	element = driver.findElement(By.name("j_password"));
	            Log.info("Password text box is found on the Login page");
        	}catch (Exception e){
        		Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_LogIn() throws Exception{
        	try{
	        	element = driver.findElement(By.xpath(".//*[@id='login']/div/form/div[3]/input"));
	            Log.info("Submit button is found on the Login page");
        	}catch (Exception e){
        		Log.error("Submit button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
    }

package pageObjects;
        import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/**
 * Created by wasey on 8/29/16.
 */

    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement lnk_MyAccount() throws Exception{
            try{ 
	        	 element = driver.findElement(By.xpath(".//*[@id='link-to-login']/a"));
	             Log.info("My Account link is found on the Home Page");
            }catch (Exception e){
           		Log.error("My Acocunt link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        public static WebElement lnk_LogOut() throws Exception{
            try{
	        	element = driver.findElement(By.xpath(".//*[@id='nav-bar']/li[2]/a"));
	        
	            Log.info("Log Out link is found on the Home Page");
            }catch (Exception e){
            	Log.error("Log Out link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static class TopNavigation{
        	
        	public static class Product_Type{
        		
        			static WebElement mainElement;
      		
        		public static void Ruby() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.xpath(".//*[@id='taxonomies']/div[2]/a[1]"));
                        String Ruby= mainElement.getText();
	        			Log.info(  Ruby+ " product category link is found under Shop by Brand");

        			}catch (Exception e){
        				Log.error("Ruby product category link is not found under Shop by Brand");
        				throw(e);
        			}
                   }
        		
        		public static void Bags() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.xpath(".//*[@id='taxonomies']/div[1]/a[1]"));
                       String Bags= mainElement.getText();
	        			Log.info( Bags +" category link is found under Shop by Categories");

        			}catch (Exception e){
        				Log.error("Bags category link is not found under Shop by Categories");
        				throw(e);
        			}
                   }
        		
        		public static void Mugs() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.xpath(".//*[@id='taxonomies']/div[1]/a[2]"));
                        String Mugs=mainElement.getText();
	        			Log.info(Mugs +" category link is found under Shop by Categories");

        			}catch (Exception e){
        				Log.error("Mugs category link is not found under Shop by Categories");
        				throw(e);
        			}
                   }
        		
        		public static void Clothing() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.xpath(".//*[@id='taxonomies']/div[1]/a[3]"));
                        String Clothing=mainElement.getText();
	        			Log.info(Clothing+ "  category link is found under Shop by Categories");

        			}catch (Exception e){
        				Log.error("Clothing category link is not found under Shop by Categories");
        				throw(e);
        			}
                   }
        		
        	}
        	
        }
        

      
    }

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

/**
 * Created by wasey on 8/29/16.
 */

public class ProductListing_Page extends BaseClass {
	private static WebElement element;
    public ProductListing_Page(WebDriver driver){
    	super(driver);
    	} 
     public static class Product_1{
 
         
    	 public static WebElement txt_Price() throws Exception {
        	 element = null;
           	try{
           		element= driver.findElement(By.xpath(".//*[@id='product-price']/div/span[1]"));
           		Log.info("Ruby on Rails Tote Price is found");
           	}catch (Exception e){
           		Log.error("Ruby on Rails Tote Sales Price is not found");
           		
           		throw(e);
           		}
           	return element;
            }
 
  
         public static WebElement img_Product() throws Exception {
        	 element = null;
          	try{
          		element= driver.findElement(By.xpath(".//*[@id='main-image']/div/img"));
          		Log.info("Ruby on Rails Tote image is found");
          	}catch (Exception e){
          		Log.error("Ruby on Rails Tote Image is not found");
          		throw(e);
          		}
          	return element;
            }
         
 
         public static WebElement txt_Name() throws Exception{
            element = null;
         	try{
         		element= driver.findElement(By.xpath(".//*[@id='product-description']/h1"));
         		Log.info("Name Ruby on Rails Tote is found for Product");
         	}catch (Exception e){
         		Log.error("Product Name is not found for Ruby on Rails Tote");
         		throw(e);
         		}
         	return element;
            }
 
 
         public static WebElement SelectProduct1() throws Exception {
        	  element = null;
           	try{
           		element= driver.findElement(By.xpath(".//*[@id='product_1']/div/div[1]/a[2]"));
           		Log.info("Ruby on Rails Tote Selected");
           	}catch (Exception e){
           		Log.error("Ruby on Rails Tote Add  is not found");
           		throw(e);
           		}
           	return element;
         	}
 
         }
     
	public static class Product_2{


		 public static WebElement txt_Price() throws Exception {
	    	 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='product-price']/div/span[1]"));
	       		Log.info("Ruby on Rails Begs Price is found");
	       	}catch (Exception e){
	       		Log.error("Ruby on Rails Begs Price is Not found");
	       		throw(e);
	       		}
	       	return element;
	        }


	     public static WebElement img_Product() throws Exception {
	    	 element = null;
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='main-image']/div/img"));
	      		Log.info("Ruby on Rails Beg Image is found for Product 2");
	      	}catch (Exception e){
	      		Log.error("Ruby on Rails Beg Image is not found for Product 2");
	      		throw(e);
	      		}
	      	return element;
	        }


	     public static WebElement txt_Name() throws Exception{
	        element = null;
	     	try{
	     		element= driver.findElement(By.xpath(".//*[@id='product-description']/h1"));
	     		Log.info("Ruby on Rails Beg Name is found for Product 2");
	     	}catch (Exception e){
	     		Log.error("Product 2 Name is not found");
	     		throw(e);
	     		}
	     	return element;
	        }


	     public static WebElement btn_AddToCart() throws Exception {
	    	  element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='product_2']/div/div[1]/a[2]"));
	       		Log.info("Ruby on Rails Bag Selected");
	       	}catch (Exception e){
	       		Log.error("Ruby on Rails Bag  Add is not found");
	       		throw(e);
	       		}
	       	return element;
	     	}

	     }


	public static class PopUpAddToCart{


		 public static WebElement btn_GoToCart() throws Exception {
	   	 element = null;
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]"));
	      		Log.info("Go to Cart button is found on the Cart Pop Up window");
	      	}catch (Exception e){
	      		Log.info("Go to Cart button is not found on the Cart Pop Up window");
	      		throw(e);
	      		}
	      	return element;
	       }

		 public static WebElement btn_ContShopping() throws Exception {
		   	 element = null;
		      	try{
		      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[2]"));
		      		Log.info("Continue Shopping button is found on Cart Pop Up window");
		      	}catch (Exception e){
		      		Log.info("Continue Shopping button is not found on Cart Pop Up window");
		      		throw(e);
		      		}
		      	return element;
		       }
		}

}
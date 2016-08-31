package appModules;

import pageObjects.Home_Page;
import pageObjects.ProductListing_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;



/**
 * Created by wasey on 8/29/16.
 */

// This is called Modularization, when we club series of actions in to one Module

public class ProductSelect_Action {
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
	public static void productType(int iTestCaseRow) throws Exception{
		try{
			
        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_ProductType is the column number for Product Type column in the Test Data sheet
        	// Please see the Constant class in the Utility Package

			if("Ruby".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
	        	
				// Selecting the link Accessories from Home Page under Top Navigation
				// This is call Page Object Model (POM)

				Home_Page.TopNavigation.Product_Type.Ruby();
	            // Printing the logs
				Log.info("Product Brand Ruby  is selected from the Shop by Brand Menu");
			}
			// If the Excel value for the Product Type is iMacs, then do this
			if("Bags".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Home_Page.TopNavigation.Product_Type.Bags();
				Log.info("Product Type Bags is selected from the Categories");
			}
			// If the Excel value for the Product Type is iPads, then do this
			if("Clothing".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Home_Page.TopNavigation.Product_Type.Clothing();
				Log.info("Product Type Clothing is selected from the Categories");
			}
			// If the Excel value for the Product Type is iPhones, then do this
			if("Mugs".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Home_Page.TopNavigation.Product_Type.Mugs();
				Log.info("Product Type Mugs is selected from the Categories");
			}
			// If the Excel value for the Product Type is null, then do this
			if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
				Log.warn("Excel value for Product Type is Blank");
			}
		
		// Every exception thrown from any class or method, will be catch here and will be taken care off
		// For Exception handling please see http://www.toolsqa.com/selenium-webdriver/exception-handling-selenium-webdriver/
	    }catch(Exception e){
			// Here I have used this as just for the sake of an example
			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it
	    	// You may like to print some information here, in case of exception
	    	throw(e);
			}
		}
	
	
	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method

	public static void productNumber(int iTestCaseRow) throws Exception{
		try{
			
			// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_ProductNumber is the column number for Product Number column in the Test Data sheet
        	// Please see the Constant class in the Utility Package

			// If condition will check that if the Excel value for the Product Number is "Product 1", then do this
			if("Product 1".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
				
				// Clicking on the Add to Cart button for the Product 1
				// This is call Page Object Model (POM)

				ProductListing_Page.Product_1.SelectProduct1().click();

				// Printing logs for the performed action
				Log.info("Ruby on Rails Tote is selected from the Product listing page");
                ProductListing_Page.Product_1.txt_Name();
                ProductListing_Page.Product_1.img_Product();
                ProductListing_Page.Product_1.txt_Price();

			}
			// If the Excel value for the Product Number is "Product 2", then do this
			else if("Product 2".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
				ProductListing_Page.Product_2.btn_AddToCart().click();
				Log.info("Ruby on Rails Bag is selected from the Product listing page");
                ProductListing_Page.Product_2.txt_Name();
                ProductListing_Page.Product_2.img_Product();
                ProductListing_Page.Product_2.txt_Price();
			}
            else if("Product 3".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
                ProductListing_Page.Product_2.btn_AddToCart().click();
                Log.info("Product 3 is selected from the Product listing page");
            }
			/// If the Excel value for the Product Type is null, then do this
            else if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))){
				Log.warn("Excel value for Product Number is Blank");
			}
			
			// Clicking on the "Go to Cart" button on the Pop Up Box
		//	ProductListing_Page.PopUpAddToCart.btn_GoToCart().click();

		 // Every exception thrown from any class or method, will be catch here and will be taken care off

		 }catch(Exception e){
			
			// Here I have used this as just for the sake of an example
			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it
		    // You may like to print some information here, in case of exception
			throw(e);
			}
		}

	}

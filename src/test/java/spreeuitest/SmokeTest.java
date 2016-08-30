package spreeuitest;

import appModules.*;
import org.testng.annotations.Test;
import pageObjects.ProductListing_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class SmokeTest extends beforeaftertest {

  
  @Test
  public void f() throws Exception {
	  try{
		SignIn_Action.Execute(iTestCaseRow);
		ProductSelect_Action.productType(iTestCaseRow);
		ProductSelect_Action.productNumber(iTestCaseRow);
		ProductListing_Page.PopUpAddToCart.btn_GoToCart().click();
		CheckOut_Action.Execute();
		PaymentDetails_Action.execute(iTestCaseRow);
		Confirmation_Action.Execute();
		Verification_Action.Execute();
		ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
	  }catch (Exception e){
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
		  Utils.takeScreenshot(driver, sTestCaseName);
		  Log.error(e.getMessage());
		  throw (e);
	  }
		
  }
		
		

}

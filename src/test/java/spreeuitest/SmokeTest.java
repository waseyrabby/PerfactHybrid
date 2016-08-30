package spreeuitest;

import appModules.SignIn_Action;
import org.testng.annotations.Test;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class SmokeTest extends beforeaftertest {

  
  @Test
  public void f() throws Exception {
	  try{
		SignIn_Action.Execute(iTestCaseRow);

		ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
	  }catch (Exception e){
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
		  Utils.takeScreenshot(driver, sTestCaseName);
		  Log.error(e.getMessage());
		  throw (e);
	  }
		
  }
		
		

}

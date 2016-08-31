package spreeuitest;

import appModules.ProductSelect_Action;
import org.testng.annotations.Test;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

/**
 * Created by wasey on 8/30/16.
 */
public class ProductTest extends beforeaftertest {

    @Test
    public void Product1Test() throws Exception {
        try{
            ProductSelect_Action.productNumber(iTestCaseRow);

            ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
        }catch (Exception e){
            ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
            Utils.takeScreenshot(driver, sTestCaseName);
            Log.error(e.getMessage());
            throw (e);
        }

    }
    @Test
    public void ProductSelectionTest() throws Exception {
        try{
            ProductSelect_Action.productType(iTestCaseRow);

            ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
        }catch (Exception e){
            ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
            Utils.takeScreenshot(driver, sTestCaseName);
            Log.error(e.getMessage());
            throw (e);
        }

    }

}

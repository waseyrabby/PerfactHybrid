package spreeapitest;

import appModules.api_Action;
import org.testng.annotations.Test;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

/**
 * Created by wasey on 8/29/16.
 */
public class SpreeApiTest extends beforeAfterTest {

    @Test
    public void chqconnectiontest() throws Exception {


        try{
            api_Action.chqconnectiontest(iTestCaseRow);

            ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
        }catch (Exception e){
            ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
            Log.error(e.getMessage());
            throw (e);
        }
    }

    @Test
    public void chqImage() throws Exception{
        try{
            api_Action.chqImage(iTestCaseRow);

            ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
        }catch (Exception e){
            ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
            Log.error(e.getMessage());
            throw (e);
        }

    }

}

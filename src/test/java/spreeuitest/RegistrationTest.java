package spreeuitest;

import appModules.SignIn_Action;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

/**
 * Created by wasey on 8/30/16.
 */
public class RegistrationTest extends beforeaftertest {
    @Features("My Feature")
    @Stories({"Story1", "Story2"})
    @Test
    public void accountButtonVerification() throws Exception {
        try {
            SignIn_Action.Execute(iTestCaseRow);

            ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
        } catch (Exception e) {
            ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
            Utils.takeScreenshot(driver, sTestCaseName);
            Log.error(e.getMessage());
            throw (e);
        }

    }
}
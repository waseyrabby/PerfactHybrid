package spreeapitest;

import io.restassured.RestAssured;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

import static utility.Constant.SpreeBase;
import static utility.Constant.SpreePort;
import static utility.Constant.SpreeURL;

/**
 * Created by wasey on 8/31/16.
 */
public class beforeAfterTest {
    protected String sTestCaseName;
    protected int iTestCaseRow;
    @BeforeMethod
    public void beforeMethod() throws Exception {



        DOMConfigurator.configure("log4j.xml");


        sTestCaseName = this.toString();

        sTestCaseName = Utils.getTestCaseName(this.toString());


        Log.startTestCase(sTestCaseName);

        ExcelUtils.setExcelFile(Constant.Path_ApiTestData + Constant.File_TestData,"Sheet1");


        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

        RestAssured.baseURI = SpreeURL;
        RestAssured.port = SpreePort;
        RestAssured.basePath = SpreeBase;

    }

}

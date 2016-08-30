package spreeuitest;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
/**
 * Created by wasey on 8/29/16.
 */
public class beforeaftertest {

    public WebDriver driver;
    protected String sTestCaseName;
    protected int iTestCaseRow;

    @BeforeMethod
    public void beforeMethod() throws Exception {


        DOMConfigurator.configure("log4j.xml");

        // Getting the Test Case name, as it will going to use in so many places
        // The main use is to get the TestCase row from the Test Data Excel sheet
        sTestCaseName = this.toString();
        // From above method we get long test case name including package and class name etc.
        // The below method will refine your test case name, exactly the name use have used
        sTestCaseName = Utils.getTestCaseName(this.toString());

        // Start printing the logs and printing the Test Case name
        Log.startTestCase(sTestCaseName);

        // Setting up the Test Data Excel file using Constants variables
        // For Constant Variables please see http://www.toolsqa.com/constant-variables/
        // For setting up Excel for Data driven testing, please see http://www.toolsqa.com/data-driven-testing-excel-poi/
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

        // Fetching the Test Case row number from the Test Data Sheet
        // This row number will be feed to so many functions, to get the relevant data from the Test Data sheet
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

        // Launching the browser, this will take the Browser Type from Test Data Sheet
        driver = Utils.OpenBrowser(iTestCaseRow);

        // Initializing the Base Class for Selenium driver
        // Now we do need to provide the Selenium driver to any of the Page classes or Module Actions
        // Will soon write a post on Base Class
        new BaseClass(driver);

    }
    // Its time to close the finish the test case
    @AfterMethod
    public void afterMethod() {
        // Printing beautiful logs to end the test case
        Log.endTestCase(sTestCaseName);
        // Closing the opened driver
        driver.close();
    }
}

package spreeapitest;

import io.restassured.RestAssured;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;

import static utility.Constant.SpreeBase;
import static utility.Constant.SpreePort;
import static utility.Constant.SpreeURL;

/**
 * Created by wasey on 8/31/16.
 */
public class beforeAfterTest {
    @BeforeMethod
    public void beforeMethod(){
        DOMConfigurator.configure("log4j.xml");
        RestAssured.baseURI = SpreeURL;
        RestAssured.port = SpreePort;
        RestAssured.basePath = SpreeBase;

    }

}

package spreeapitest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utility.Log;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utility.Constant.*;

/**
 * Created by wasey on 8/29/16.
 */
public class SpreeApiTest extends beforeAfterTest {

    @Test
    public void chqconnectiontest() throws Exception {




        try{given()
                    .header(SpreeToken, SpreeKey)
                    //  .log().all()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .when()
                    .get("/products")

                    .then()
                    .statusCode(OK);
        }catch (Exception e){

            Log.error(e.getMessage());
            throw (e);
        }
    }

    @Test(enabled = false)
    public void test5(){
        given()
                .log().all()
                .header("X-Spree-Token", "52a997116f906d2587dd9d8508e27d9167bdc90348bbdc9b")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get("/products/1")
                .then()
                .log().body()
                .statusCode(200)
                .body("id",equalTo(1))
                .body("name",equalTo("Ruby on Rails Tote"))
                .body("price", equalTo("15.99"))
                .body("master.id", equalTo(1))
                .body("product_properties[0].id", equalTo(25))
                .body("master.images[0].id", equalTo(21));

    }

}

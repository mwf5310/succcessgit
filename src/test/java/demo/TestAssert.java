package demo;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
public class TestAssert {
    @Test

    public void testAssert() {

        //given().queryParam(parameterName:"q",...parameterValues:"appium")
        given().queryParam("q", "appium")
                .when().get("https://testerhome.com/search").prettyPeek()
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("appium · 搜索结果 · TesterHome"));


    }
}

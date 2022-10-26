package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculaterResourceTest {
    
    @Test
    public void testCalculatorEndpoint() {
        given()
          .when().get("/calculator")
          .then()
             .statusCode(400)
             .body(is("'number1 + number2"));
    }
}



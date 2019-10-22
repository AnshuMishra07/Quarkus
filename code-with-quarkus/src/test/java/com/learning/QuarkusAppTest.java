package com.learning;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class QuarkusAppTest {

    @Test
    public void testCallMeEndpoint() {
        given()
          .when().get("/callme")
          .then()
             .statusCode(200)
             .body(is("Hello Anshu. I am quarkus and now going to change java world!!!"));
    }

}
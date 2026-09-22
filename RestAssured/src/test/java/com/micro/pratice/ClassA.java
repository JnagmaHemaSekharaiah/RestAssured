package com.micro.pratice;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ClassA
{

    @Test
    public void fun()
    {
        RequestSpecification reqs = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .setContentType(ContentType.JSON)
                .build();

        Response rs = given().spec(reqs).when().get("/booking/1");

        String paylod =   rs.then().log().all().extract().asString();

        JsonPath js =  rs.then().extract().jsonPath();

          String lastname = js.get("lastname");
          System.out.println("lastName = "+lastname);
          String bookingdat = js.getString("bookingdates.checkin");

          System.out.println("bookingdat= "+bookingdat);


    }

}

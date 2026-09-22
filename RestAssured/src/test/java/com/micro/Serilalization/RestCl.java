package com.micro.Serilalization;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class RestCl
{

    @Test
    public void test()
    {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        Booking booking =
                new Booking("Hema","sekhar",1500,true);

        RequestSpecification resp = new RequestSpecBuilder()
                .setBody(booking)
                .build();

          Response rs =given().spec(resp)
                        .when()
                        .post("/booking");

        System.out.println("Body"+rs.then().log().body() );

    }

}

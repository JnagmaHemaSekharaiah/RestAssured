package com.micro.ApiChaning;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.matcher.DetailedCookieMatcher;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.*;
import org.hamcrest.Matcher;
import org.testng.Assert;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class PostAPICall
{

    public static void main(String args[])
    {
        // 1. Set the base URL of the API
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        // 2. Request body (JSON as a text block)
        String requestBody = """
                {
                                  "firstname": "Hema",
                                  "lastname": "Sekhar",
                                  "totalprice": 1500,
                                  "depositpaid": true,
                                  "bookingdates": {
                                    "checkin": "2026-10-01",
                                    "checkout": "2026-10-05"
                                  },
                                  "additionalneeds": "Breakfast"
                }""";

        RequestSpecification requestSpec = given()
                .body(requestBody).header("Content-Type","application/json");

        Response  response= given().spec(requestSpec).
                            when().post("/booking");


        ResponseSpecification responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType("application/json")
                .build();





        response.then().spec(responseSpec);

        //Assertion
//        Assert.assertEquals(response.statusCode(),200,"Status Code Vaidated");
//
//        Assert.assertEquals(response.getBody().jsonPath()
//                .getString("booking.firstname"),"Hema","Status Code Vaidated");

        System.out.println("******Post Response Body*******");
        System.out.println(response.getBody().prettyPrint());

        int id  = response.getBody().jsonPath().getInt("bookingid");
        String pathVar = "/booking/"+id;

        Response getResp = given().headers("Content-Type","application/json")
                           .when().get(pathVar);

        System.out.println("******Get Response Body******");
        System.out.println(getResp.body().prettyPrint());


    }

}

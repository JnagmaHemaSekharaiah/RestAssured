package com.micro.Deserilization;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeSerli
{

    @Test
    public void test()
    {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        RequestSpecification rsp = new RequestSpecBuilder()
                 .setContentType("application/json")
                 .build();
        Response res = given().
                       when().spec(rsp).get("/booking/1");

       ValidatableResponse response =  res.then();

    //    System.out.println( response.statusCode());

    }

}

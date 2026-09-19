package com.micro;

import io.restassured.RestAssured;

import  static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class First
{

    public static void main(String[] args)
    {
        RestAssured.baseURI ="https://jsonplaceholder.typicode.com";

        given()

        .when().get("users/1")

                .then()
                   .statusCode(200)
                   .body("id", equalTo(1)).log().all()
                   .assertThat().body("zipcode",equalTo("92998-3874"));


    }


}

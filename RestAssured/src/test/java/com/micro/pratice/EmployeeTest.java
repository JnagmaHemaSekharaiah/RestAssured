package com.micro.pratice;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class EmployeeTest
{


    public static void main(String args[])
    {
        RequestSpecification respbaseUri = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .build();

        List<String> skills =  Arrays.asList("Java","selenium","restAssured");

        EmployeeRequest employeeRequest = new EmployeeRequest("Hema",20,skills);

        RequestSpecification reqEmpPay = respbaseUri
                .contentType(ContentType.JSON)
                .body(employeeRequest);

        Response rs = given().spec(reqEmpPay).when().post("/booking");

        JsonPath payload = rs.then().log().all().extract().jsonPath();

        System.out.println(payload.prettyPrint());

    }

}

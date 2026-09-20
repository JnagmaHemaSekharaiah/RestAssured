package com.micro.JSON;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JSONPratice
{


    public static String getjson()
    {
        String str ="[\n" +
                " {\n" +
                " \"firstName\": \"Virat\",\n" +
                " \"lastName\": \"Kohli\",\n" +
                " \"age\": 35,\n" +
                " \"address\": [\n" +
                " {\n" +
                " \"city\": \"Delhi\",\n" +
                " \"country\": \"India\"\n" +
                " },\n" +
                " {\n" +
                " \"city\": \"Mumbai\",\n" +
                " \"country\": \"India\"\n" +
                " }\n" +
                " ]\n" +
                " },\n" +
                " {\n" +
                " \"firstName\": \"Mahendra\",\n" +
                " \"lastName\": \"Singh Dhoni\",\n" +
                " \"age\": 42,\n" +
                " \"address\": [\n" +
                " {\n" +
                " \"city\": \"Ranchi\",\n" +
                " \"country\": \"India\"\n" +
                " },\n" +
                " {\n" +
                " \"city\": \"Chennai\",\n" +
                " \"country\": \"India\"\n" +
                " }\n" +
                " ]\n" +
                " }\n" +
                " ]\n";
        return str;
    }

    @Test(priority = 1)
    public void test()
    {
        JsonPath jsonPath = new JsonPath(JSONPratice.getjson());


//        System.out.println(jsonPath.getString(" "));
        System.out.println(jsonPath.getString("[0].firstName"));
        System.out.println(jsonPath.getString("[0].address[1].city"));







    }


}

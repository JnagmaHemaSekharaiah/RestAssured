package CucumberPratice.StepDefinationsofjava;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BookingStpes {

    String requestBody ;
    Response response;



    @Given("I have booking request body")
    public void i_have_the_booking_request_body()
    {
        RestAssured.baseURI ="https://restful-booker.herokuapp.com";
        requestBody ="{\n" +
                "                  \"firstname\": \"Hema\",\n" +
                "                  \"lastname\": \"Sekhar\",\n" +
                "                  \"totalprice\": 1500,\n" +
                "                  \"depositpaid\": true,\n" +
                "                  \"bookingdates\": {\n" +
                "                    \"checkin\": \"2026-10-01\",\n" +
                "                    \"checkout\": \"2026-10-05\"\n" +
                "                  },\n" +
                "                  \"additionalneeds\": \"Breakfast\"\n" +
                "                }";

    }

    @When("I send a post request to create booking")
    public void createBooking()
    {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setContentType("application/json")
                .setBody(requestBody)
                .build();

         response =
                given()
                        .when()
                        .post("/booking");

    }

    @Then("the response status should be {int}")
    public void the_response_status_code_should_be(Integer statusCode)
    {

        ValidatableResponse valiresp = response.then();

        valiresp.body("firstName",equalTo("Hema"));
        valiresp.statusCode(equalTo(statusCode));
    }

    @And("booking firstName should be {string}")
    public void the_booking_firstname_should_be(String firstname)
    {
        response.then()
                .body("booking.firstname", equalTo(firstname));
    }

}

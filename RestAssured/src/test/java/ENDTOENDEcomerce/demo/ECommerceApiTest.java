package ENDTOENDEcomerce.demo;

import ENDTOENDEcomerce.POJO.LoginRequest;
import ENDTOENDEcomerce.POJO.LoginResponse;
import ENDTOENDEcomerce.POJO.OrderDetails;
import ENDTOENDEcomerce.POJO.Orders;
import com.beust.ah.A;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ECommerceApiTest
{
    @Test
    public static  void main(String args[] )
    {

        RequestSpecification req = new RequestSpecBuilder()
                                   .setBaseUri("https://rahulshettyacademy.com")
                                   .setContentType(ContentType.JSON).build();

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUserEmail("sekharsparrow@gmail.com");
        loginRequest.setUserPassword("Sekhar@01");

        RequestSpecification reqLogin =  given().spec(req).body(loginRequest).log().all();

        LoginResponse response  =   reqLogin
                                    .when()
                                    .post("/api/ecom/auth/login")
                                    .then()
                                    .extract().response()
                                    .as(LoginResponse.class);

        System.out.println(response.getToken());
        String token = response.getToken();
        System.out.println(response.getUserId());
        String userId = response.getUserId();

/******************************************************************************************/

        RequestSpecification addProductBaseReq = new RequestSpecBuilder()
                .setBaseUri("https://rahulshettyacademy.com")
                .addHeader("authorization",token)
                .build();

        RequestSpecification addProductBodyreq = given().log().all()
                .spec(addProductBaseReq)
                .param("productName","qwerty")
                .param("productAddedBy",userId)
                .param("productCategory","fashion")
                .param("productSubCategory","shirts")
                .param("productPrice","11500")
                .param("productDescription","Addias Originals")
                .param("productFor","women")
                .multiPart("productImage",new File("C:\\Users\\sekha\\Downloads\\DemoProject\\saiaadhar.jpeg"));


         Response addProductResponse =given().
                                      spec(addProductBodyreq).log().all().
                                      when().post("/api/ecom/product/add-product");

        String productId = addProductResponse.then().extract().jsonPath().getString("productId");

        System.out.println("***************************************");
        System.out.println("productId = "+productId);

        /********************Create order*******************/

        RequestSpecification createOrderBasereq = new RequestSpecBuilder()
               .setBaseUri("https://rahulshettyacademy.com")
               .setContentType(ContentType.JSON)
               .addHeader("authorization",token)
               .build();

        OrderDetails orderDetails = new OrderDetails();

        orderDetails.setCountry("India");
        orderDetails.setProductOrderedId(productId);

        List<OrderDetails> objOrderDetails  = new ArrayList();
        objOrderDetails.add(orderDetails);


        Orders order = new Orders();
        order.setOrders(objOrderDetails);


        Response createOrderRes = given()
                                 .spec(createOrderBasereq)
                                 .body(order)
                                 .log().all()
                                 .when()
                                 .post("/api/ecom/order/create-order");



        JsonPath OrderIdjspath = createOrderRes.then().extract().response().jsonPath();
        System.out.println("*****************ORDER*****************************");
        System.out.println("Status Code = " + createOrderRes.getStatusCode());

        String orderId =  OrderIdjspath.getString("orders[0]");
        System.out.println("Order ID = "+OrderIdjspath.getString("orders[0]"));


        /**************************Delete Order *******************/
        System.out.println("****************Delete Order ****************");
        RequestSpecification deltereqSpe = new RequestSpecBuilder()
                .setBaseUri("https://rahulshettyacademy.com")
                .addHeader("authorization",token)
                .setContentType(ContentType.JSON)
                .build();

        RequestSpecification mainspdelete =  deltereqSpe.given().pathParam("productId",productId);

        Response deleteResp =  given().spec(mainspdelete)
                  .when()
                  .delete("/api/ecom/product/delete-product/{productId}");


        JsonPath jsonPath =  deleteResp.then().log().all().extract().response().jsonPath();

        String deleteProductmeg = jsonPath.getString("message");

        System.out.println("Message = "+ deleteProductmeg);
    }
}

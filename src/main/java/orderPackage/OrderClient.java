package orderPackage;
import courierPackage.Client;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;

public class OrderClient extends Client {
    private static final String ORDER_PATH= "/api/v1/orders";
    private static final String DELETE_ORDER_PATH= "/api/v1/orders/";
    private Order order;
    int track;


    //create
    public ValidatableResponse orderCreate(Order order){
        return given()
                .spec(getSpec())
                .log().all()
                .body(order)
                .when()
                .post(ORDER_PATH)
                .then()
                .log().all();
    }

   /* public ValidatableResponse delete(int track){
        String str = Integer.toString(track);
        return given()
                .spec(getSpec())
                .log().all()
                .when()
                .delete(DELETE_ORDER_PATH+str)
                .then()
                .log().all();
    }*/
    public ValidatableResponse getList() {
        return given()
                .spec(getSpec())
                .log().all()
                .when()
                .get(ORDER_PATH+"?id=1")
                .then()
                .log().all();
    }
}

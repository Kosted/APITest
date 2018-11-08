import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONException;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class Controller {


    private String host = "http://dev6.sogaz-lk.dev.atbdev.ru/api/1.0/";

    private RequestSpecification requestSpecification;

    public Controller() {

        RequestAuth requestAuth = new RequestAuth();
        requestAuth.setEmail("empty@fake.sogaz.ru");
        requestAuth.setPassword("empty@fake.sogaz.ru");
        requestAuth.setResetPin("false");

        requestSpecification = new RequestSpecBuilder()
                //.addHeader("Content-Type", "application/json")
                .setContentType("application/json")
                .setBaseUri(host )
                .setBody(requestAuth)
                .setBasePath("/auth/email/")
                .log(LogDetail.ALL).build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType("application/json")
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
        RestAssured.defaultParser = Parser.JSON;

    }

public ResponsAuth auth(RequestAuth requestAuth) {
        return given(requestSpecification)
              //  .contentType("application/json\r\n")
                //.body(requestAuth)
                .post()
                .as(ResponsAuth.class);
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

        RequestAuth requestAuth = new RequestAuth();
        requestAuth.setEmail("empty@fake.sogaz.ru");
        requestAuth.setPassword("empty@fake.sogaz.ru");
        requestAuth.setResetPin("false");





ResponsAuth responsAuth = controller.auth(requestAuth);
responsAuth.getToken();
    }
}

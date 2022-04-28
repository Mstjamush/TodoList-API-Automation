package general;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableFunctions {
    public static RequestSpecification REQUEST;

    public ReusableFunctions() {
    }

    public static int getResponseLength() {
        return (Integer) general.EnvGlobals.response.body().path("list.size()", new String[0]);
    }

    public static String getResponse() {
        return general.EnvGlobals.response != null ? general.EnvGlobals.response.getBody().asString() : null;
    }
    private static void contentType(String contentType) {
        REQUEST = RestAssured.given().contentType(contentType);
    }

    public static void given() {
        contentType("application/json");
       general.EnvGlobals.requestSpecification = REQUEST.given();
    }
    public static boolean checkIfItemExists(int id) {
        System.out.println(getResponse());
        Boolean x = null;
        JSONArray jsonArray = new JSONArray(getResponse());
        for (int i = 0; i < jsonArray.toList().size(); i++) {

            System.out.println(jsonArray.toList().get(i));
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            if (jsonObject.get("id").equals(id)) {
                x = true;
            }
            else { x = false;}
        }
        return x;
    }

    public static String checkIfItemStatus(int id) {
        System.out.println(getResponse());
        JSONArray jsonArray = new JSONArray(getResponse());
        for (int i = 0; i < jsonArray.toList().size(); i++) {

            System.out.println(jsonArray.toList().get(i));
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            if (jsonObject.get("id").equals(id) && jsonObject.has("status")) {
                System.out.println("The record status is :: " + jsonObject.get("status"));
                return (String) jsonObject.get("status");
            }
        }
        return null;
    }
    public static boolean checkForDuplicates(int id) {
        System.out.println(getResponse());
        JSONArray jsonArray = new JSONArray(getResponse());
        List<Integer> currentInt  = new ArrayList<>();
        for (int i = 0; i < jsonArray.toList().size(); i++) {
            System.out.println(jsonArray.toList().get(i));
            JSONObject jsonObject = jsonArray.getJSONObject(i);
        }

        if (currentInt.stream().distinct().count() != currentInt.stream().count()) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void givenHeaderPayload(Map<String, String> headers, String payload) {
        contentType("application/json");
        general.EnvGlobals.requestSpecification = REQUEST.given();
        if (headers == null) {
            general.EnvGlobals.requestSpecification = REQUEST.given().body(payload);
        } else if (payload == null) {
            general.EnvGlobals.requestSpecification = REQUEST.given().headers(headers);
        } else {
            general.EnvGlobals.requestSpecification = REQUEST.given().headers(headers).body(payload);
        }

    }

    public static void whenFunction(String requestType, String endPoint) {
        byte var3 = -1;
        switch(requestType.hashCode()) {
            case -1335458389:
                if (requestType.equals("delete")) {
                    var3 = 2;
                }
                break;
            case 102230:
                if (requestType.equals("get")) {
                    var3 = 1;
                }
                break;
            case 111375:
                if (requestType.equals("put")) {
                    var3 = 3;
                }
                break;
            case 3446944:
                if (requestType.equals("post")) {
                    var3 = 0;
                }
                break;
            case 106438728:
                if (requestType.equals("patch")) {
                    var3 = 4;
                }
        }

        switch(var3) {
            case 0:
               general.EnvGlobals.response = (Response)((RequestSpecification) general.EnvGlobals.requestSpecification.when().log().all()).post(endPoint, new Object[0]);
                break;
            case 1:
                general.EnvGlobals.response = (Response)((RequestSpecification) general.EnvGlobals.requestSpecification.when().log().all()).get(endPoint, new Object[0]);
                break;
            case 2:
                general.EnvGlobals.response = (Response)((RequestSpecification) general.EnvGlobals.requestSpecification.when().log().all()).delete(endPoint, new Object[0]);
                break;
            case 3:
                general.EnvGlobals.response = (Response)((RequestSpecification) general.EnvGlobals.requestSpecification.when().log().all()).put(endPoint, new Object[0]);
                break;
            case 4:
                general.EnvGlobals.response = (Response)((RequestSpecification) general.EnvGlobals.requestSpecification.when().log().all()).patch(endPoint, new Object[0]);
        }

    }

    public static void thenFunction(int statusCode) {
        ((ValidatableResponse)((ValidatableResponse) general.EnvGlobals.response.then()).log().all()).statusCode(statusCode);
    }
    public static void givenHeaders(Map<String, String> headers) {
        contentType("application/json");
        EnvGlobals.requestSpecification = REQUEST.given().headers(headers);
    }

    public static <K, V> Map<K, V> headers(Object... keyValues) {
        Map<K, V> map = new HashMap();

        for(int index = 0; index < keyValues.length / 2; ++index) {
            map.put((K)keyValues[index * 2], (V)keyValues[index * 2 + 1]);
        }

        return map;
    }
}

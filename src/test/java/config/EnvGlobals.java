/*
Define global variables to use re-use them
 */

package config;

import com.google.gson.JsonObject;
import com.mongodb.util.JSON;
import io.restassured.specification.RequestSpecification;
import com.google.gson.JsonParser;

public class EnvGlobals {

    public static String token = "Token e293678a13a706f8807ee21c3f6ddcdaea08678c";
    public static String tempToken;
    public static RequestSpecification requestSpecification;

    public static String fieldName ="\n" +
            "\t\t\"todo\": \"Write app for QA assessment\",\n" +
            "\t\t\"status\": \"inprogress\",\n" +
            "\t\t\"id\": 1\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"todo\": \"Write up for QA assessment\",\n" +
            "\t\t\"status\": \"done\",\n" +
            "\t\t\"id\": 2\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"id\": 3,\n" +
            "\t\t\"todo\": \"add redit\",\n" +
            "\t\t\"status\": \"inprogress\"\n" +
            "\t}";
 }


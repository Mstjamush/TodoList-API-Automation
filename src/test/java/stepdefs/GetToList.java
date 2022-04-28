package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;

import static stepdefs.Hooks.endPoint;

public class GetToList {
    @Given("I Set GET to do api endpoint")
    public void i_Set_GET_field_service_api_endpoint() {
        endPoint = EndpointURLs.getToDo;
    }
    @Then("I receive valid Response for GET TO DO service")
    public void i_receive_valid_Response_for_POST_field_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }
}

package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;

import static stepdefs.Hooks.endPoint;

public class BroadCast {


    @Given("I Set GET broad cast api endpoint")
    public void i_Set_GET_Data_service_api_endpoint() {
        endPoint = EndpointURLs.getToDo;
    }

    @Then("I receive valid Response for GET broad cast service")
    public void i_receive_valid_Response_for_GET_Data_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }

}

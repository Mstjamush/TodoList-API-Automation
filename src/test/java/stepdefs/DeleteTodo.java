package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;
import payloads.FieldPayloads;
import validation.BroadCastValidation;

import static stepdefs.Hooks.RequestPayLoad;
import static stepdefs.Hooks.endPoint;

public class DeleteTodo {
    @Given("I Set POST delete to do list api endpoint")
    public void i_Set_POST_delete_to_do_list_api_endpoint() {
        endPoint = EndpointURLs.deleteTodo;
        RequestPayLoad = FieldPayloads.deleteTodo();
    }
    @Then("I receive valid Response for delete to do list")
    public void i_receive_valid_Response_for_delete_to_do_list() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        BroadCastValidation.validateDelete();
    }
}

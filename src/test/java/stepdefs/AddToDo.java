package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;
import payloads.FieldPayloads;
import validation.BroadCastValidation;

import static config.EnvGlobals.fieldName;
import static stepdefs.Hooks.RequestPayLoad;
import static stepdefs.Hooks.endPoint;

public class AddToDo {

    @Given("I Set POST field service api endpoint")
    public void i_Set_POST_field_service_api_endpoint() {
        endPoint = EndpointURLs.addToDo;
        RequestPayLoad = FieldPayloads.addToDo();
    }

    @Then("I receive valid Response for POST field service")
    public void i_receive_valid_Response_for_POST_field_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        BroadCastValidation.validateAddToDoResponse();
    }

    @Then("I receive valid Response for duplicate add item")
    public void i_receive_valid_Response_for_duplicate_add_item() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        BroadCastValidation.validateDuplicates();
    }

    @Given("I Set update field service api endpoint")
    public void i_Set_POST_update_service_api_endpoint() {
        endPoint = String.format(EndpointURLs.updateTodo,fieldName);
        RequestPayLoad = FieldPayloads.editToDo();
    }

    @Then("I receive valid Response for update field service")
    public void i_receive_valid_Response_for_update_field_service() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
    }
}

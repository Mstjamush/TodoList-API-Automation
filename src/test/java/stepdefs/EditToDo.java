package stepdefs;

import config.EndpointURLs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.ReusableFunctions;
import payloads.FieldPayloads;
import validation.BroadCastValidation;

import static stepdefs.Hooks.RequestPayLoad;
import static stepdefs.Hooks.endPoint;

public class EditToDo {
    @Given("I Set POST edit to do list api endpoint")
    public void i_Set_POST_edit_to_do_list_api_endpoint() {
        endPoint = EndpointURLs.updateTodo;
        RequestPayLoad = FieldPayloads.editToDo();
    }
    @Given("I Set POST edit to do list api endpoint and wrong id")
    public void i_Set_POST_edit_to_do_list_api_endpoint_and_wrong_id() {
        endPoint = EndpointURLs.updateTodo;
        RequestPayLoad = FieldPayloads.editWrongToDo();
    }
    @Then("I receive valid Response for edit to do list")
    public void i_receive_valid_Response_for_edit_to_do_list() {
        ReusableFunctions.thenFunction(Hooks.HTTP_RESPONSE_SUCCESS);
        BroadCastValidation.validateEdit();
    }
    @Then("I receive valid Response for non existent to do")
    public void i_receive_valid_Response_for_non_existent_to_do() {
        BroadCastValidation.validateEditWrongToDo();
    }
}

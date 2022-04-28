$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/add.feature");
formatter.feature({
  "name": "add",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@add"
    }
  ]
});
formatter.scenario({
  "name": "Create new To do",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@add"
    },
    {
      "name": "@POST"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Testing Case : \"2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "genericSteps.i_am_Testing_Case(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set POST field service api endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "AddToDo.i_Set_POST_field_service_api_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set request HEADER and PAYLOAD",
  "keyword": "When "
});
formatter.match({
  "location": "genericSteps.i_Set_request_HEADER_and_PAYLOAD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send a POST HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "genericSteps.send_a_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid Response for POST field service",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToDo.i_receive_valid_Response_for_POST_field_service()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create to do list twice",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@add"
    },
    {
      "name": "@POST"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Testing Case : \"3\"",
  "keyword": "Given "
});
formatter.match({
  "location": "genericSteps.i_am_Testing_Case(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set POST field service api endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "AddToDo.i_Set_POST_field_service_api_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set request HEADER and PAYLOAD",
  "keyword": "When "
});
formatter.match({
  "location": "genericSteps.i_Set_request_HEADER_and_PAYLOAD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send a POST HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "genericSteps.send_a_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid Response for duplicate add item",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToDo.i_receive_valid_Response_for_duplicate_add_item()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat validation.BroadCastValidation.validateDuplicates(BroadCastValidation.java:18)\n\tat stepdefs.AddToDo.i_receive_valid_Response_for_duplicate_add_item(AddToDo.java:31)\n\tat ✽.I receive valid Response for duplicate add item(src/test/resources/feature/add.feature:18)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/feature/deleteToDo.feature");
formatter.feature({
  "name": "deleteToDoList",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@delete"
    }
  ]
});
formatter.scenario({
  "name": "Delete to do list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@delete"
    },
    {
      "name": "@POST"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Testing Case : \"4\"",
  "keyword": "Given "
});
formatter.match({
  "location": "genericSteps.i_am_Testing_Case(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set POST delete to do list api endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteTodo.i_Set_POST_delete_to_do_list_api_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set request HEADER and PAYLOAD",
  "keyword": "When "
});
formatter.match({
  "location": "genericSteps.i_Set_request_HEADER_and_PAYLOAD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send a POST HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "genericSteps.send_a_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid Response for delete to do list",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteTodo.i_receive_valid_Response_for_delete_to_do_list()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete non-existent to do list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@delete"
    },
    {
      "name": "@POST"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Testing Case : \"5\"",
  "keyword": "Given "
});
formatter.match({
  "location": "genericSteps.i_am_Testing_Case(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set POST delete to do list api endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteTodo.i_Set_POST_delete_to_do_list_api_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set request HEADER and PAYLOAD",
  "keyword": "When "
});
formatter.match({
  "location": "genericSteps.i_Set_request_HEADER_and_PAYLOAD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send a POST HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "genericSteps.send_a_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid Response for delete to do list",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteTodo.i_receive_valid_Response_for_delete_to_do_list()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c2\u003e but was:\u003c3\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:645)\n\tat org.junit.Assert.assertEquals(Assert.java:631)\n\tat validation.BroadCastValidation.validateDelete(BroadCastValidation.java:27)\n\tat stepdefs.DeleteTodo.i_receive_valid_Response_for_delete_to_do_list(DeleteTodo.java:22)\n\tat ✽.I receive valid Response for delete to do list(src/test/resources/feature/deleteToDo.feature:17)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/feature/editToDo.feature");
formatter.feature({
  "name": "editToDoList",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@edit"
    }
  ]
});
formatter.scenario({
  "name": "Edit To do",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@edit"
    },
    {
      "name": "@POST"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Testing Case : \"6\"",
  "keyword": "Given "
});
formatter.match({
  "location": "genericSteps.i_am_Testing_Case(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set POST edit to do list api endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "EditToDo.i_Set_POST_edit_to_do_list_api_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set request HEADER and PAYLOAD",
  "keyword": "When "
});
formatter.match({
  "location": "genericSteps.i_Set_request_HEADER_and_PAYLOAD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send a POST HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "genericSteps.send_a_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid Response for edit to do list",
  "keyword": "Then "
});
formatter.match({
  "location": "EditToDo.i_receive_valid_Response_for_edit_to_do_list()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit non-existent To do",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@edit"
    },
    {
      "name": "@POST"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Testing Case : \"7\"",
  "keyword": "Given "
});
formatter.match({
  "location": "genericSteps.i_am_Testing_Case(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set POST edit to do list api endpoint and wrong id",
  "keyword": "And "
});
formatter.match({
  "location": "EditToDo.i_Set_POST_edit_to_do_list_api_endpoint_and_wrong_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set request HEADER and PAYLOAD",
  "keyword": "When "
});
formatter.match({
  "location": "genericSteps.i_Set_request_HEADER_and_PAYLOAD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send a POST HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "genericSteps.send_a_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid Response for non existent to do",
  "keyword": "Then "
});
formatter.match({
  "location": "EditToDo.i_receive_valid_Response_for_non_existent_to_do()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/feature/getToDo.feature");
formatter.feature({
  "name": "getToDo",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@getToDo"
    }
  ]
});
formatter.scenario({
  "name": "get to do list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@getToDo"
    },
    {
      "name": "@GET"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Testing Case : \"1\"",
  "keyword": "Given "
});
formatter.match({
  "location": "genericSteps.i_am_Testing_Case(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Set GET to do api endpoint",
  "keyword": "And "
});
formatter.match({
  "location": "GetToList.i_Set_GET_field_service_api_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send a GET HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "genericSteps.send_a_GET_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I receive valid Response for GET TO DO service",
  "keyword": "Then "
});
formatter.match({
  "location": "GetToList.i_receive_valid_Response_for_POST_field_service()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
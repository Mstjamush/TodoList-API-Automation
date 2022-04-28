@delete
Feature: deleteToDoList
  @POST @test
  Scenario: Delete to do list
    Given I am Testing Case : "4"
    And I Set POST delete to do list api endpoint
    When I Set request HEADER and PAYLOAD
    And Send a POST HTTP request
    Then I receive valid Response for delete to do list

  @POST @test
  Scenario: Delete non-existent to do list
    Given I am Testing Case : "5"
    And I Set POST delete to do list api endpoint
    When I Set request HEADER and PAYLOAD
    And Send a POST HTTP request
    Then I receive valid Response for delete to do list
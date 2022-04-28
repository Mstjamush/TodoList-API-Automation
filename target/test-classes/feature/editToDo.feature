@edit
Feature: editToDoList

  @POST @test
  Scenario: Edit To do
    Given I am Testing Case : "6"
    And I Set POST edit to do list api endpoint
    When I Set request HEADER and PAYLOAD
    And Send a POST HTTP request
    Then I receive valid Response for edit to do list

  @POST @test
  Scenario: Edit non-existent To do
    Given I am Testing Case : "7"
    And I Set POST edit to do list api endpoint and wrong id
    When I Set request HEADER and PAYLOAD
    And Send a POST HTTP request
    Then I receive valid Response for non existent to do
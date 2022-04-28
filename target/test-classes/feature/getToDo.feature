@getToDo
Feature: getToDo


  @GET @test
  Scenario: get to do list
    Given I am Testing Case : "1"
    And I Set GET to do api endpoint
    And Send a GET HTTP request
    Then I receive valid Response for GET TO DO service





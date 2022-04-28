@add
Feature: add

@POST @test
Scenario: Create new To do
Given I am Testing Case : "2"
And I Set POST field service api endpoint
When I Set request HEADER and PAYLOAD
And Send a POST HTTP request
Then I receive valid Response for POST field service

@POST @test
Scenario: Create to do list twice
Given I am Testing Case : "3"
And I Set POST field service api endpoint
When I Set request HEADER and PAYLOAD
And Send a POST HTTP request
Then I receive valid Response for duplicate add item




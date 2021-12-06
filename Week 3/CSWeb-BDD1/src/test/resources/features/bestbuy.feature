Feature: bestbuy.com Test Case Web

  Background:
    Given Homepage is open
    When Popup close

  @task1 @regression
  Scenario: Search product and verify result
    Given Verify Page Title with "Best Buy | Official Online Store | Shop Now & Save"
    And Search for "wireless earbuds"
    Then Verify search results are listed for "wireless earbuds"

  @task2 @possitive @regression
  Scenario: Login with valid email and password
    Given Go to Sign In page
    And  Fill email
    And  Fill password
    Then Login with Enter button
    And Verify Succesful Login with "Hi, "

  @task3 @negative @regression
  Scenario: Login with invalid email and password
    Given Go to Sign In page
    And  Fill wrong email
    And  Fill wrong password
    Then Login with Enter button
    And Verify Wrong Login with "We didn't find an account with that email address."









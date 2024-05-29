Feature: Login Functionality

  #Backgrount: will execute before each and very Scenario:
  Background:
     #Pre-condition
    Given User opens the application

  @regression
  Scenario: Verify Login page title
    #Assertions/Verifications
    Then Page Title should be "Swag Labs"

  @regression
  Scenario: Verify Login
    #Actions
    When User enters the "standard_user" username
    And User enters the "secret_sauce" password
    And User clicks on the login button
    #Assertions/Verifications
    Then User is logged in successfully
Feature: Login Functionality with Examples

  Scenario Outline: Login with valid details
    #Pre-condition
    Given User opens the application
    #Actions
    When User enters the "<UserName>" username
    And User enters the "<Password>" password
    And User clicks on the login button
    #Assertions/Verifications
    Then Logged is successfully or unsuccessfully with "<Type>"

    #Examples: is just like a data provider of TestNG
    Examples:
    #Pipe lines |||
      | UserName         | Password        | Type       |
      | standard_user    | secret_sauce    | valid      |
      | locked_out_user  | secret_sauce    | locked_out |
      | standard_user123 | secret_sauce123 | invalid    |
Feature: Login Functionality examples

  Scenario Outline: Login with valid details

    #Pre-Condition
    Given User opens the application

      #Actions
    When users enters the "<Username>" username
    And users enter the "<Password>" password
    And users clicks on the login button

    #Assertion/Verification
    Then Logged in successful or Unsuccessful with "<Type>"

    Examples:
      | Username         | Password        | Type       |
      | standard_user    | secret_sauce    | valid      |
      | locked_out_user  | secret_sauce    | locked_out |
      | standard_user123 | secret_sauce123 | invalid    |
Feature: Login Functionality

  Scenario: Login with valid details

    #Pre-Condition
    Given User opens the application

      #Actions
    When users enters the username
    And users enter the password
    And users clicks on the login button

    #Assertion/Verification
    Then users_logged_in_successful

  Scenario: Login with valid credentials
    #Pre-Condition
    Given User opens the application
      #Actions
    When users enters the "standard_user" username
    And users enter the "secret_sauce" password
    And users clicks on the login button

    #Assertion/Verification
    Then users_logged_in_successful
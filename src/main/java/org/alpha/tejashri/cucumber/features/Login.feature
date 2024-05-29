Feature: Login Functionality

  #With Hardcoded values
#  Scenario: Login with valid details
#    #Pre-condition
#    Given User opens the application
#    #Actions
#    When User enters the username
#    And User enters the password
#    And User clicks on the login button
#    #Assertions/Verifications
#    Then User is logged in successfully

    #With Dynamic values
  Scenario: Login with valid details
    #Pre-condition
    Given User opens the application
    #Actions
    When User enters the "standard_user" username
    And User enters the "secret_sauce" password
    And User clicks on the login button
    #Assertions/Verifications
    Then User is logged in successfully
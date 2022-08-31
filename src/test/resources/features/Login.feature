Feature: Login function

  Scenario: User Login
    #Given user is navigated to HRM web application
    When user enters user name and password
    And user clicks on login button
    Then user is successfully logged in

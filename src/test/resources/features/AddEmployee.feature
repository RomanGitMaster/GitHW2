Feature: This feature will add  employees to HRM website

  Scenario: Adding employees
    Given user navigates to HRM website
    When user enters valid credentials
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
    When user sends first and last name
    And user clicks save button
    Then employee is successfully added
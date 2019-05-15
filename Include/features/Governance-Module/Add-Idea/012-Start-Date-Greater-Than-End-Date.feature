@PMO
Feature: Set start date greater than end date and check error message
  I want to check start date greater than end date error message

  @smoke
  Scenario: Check start date greater than end date error message
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to fill idea name field
    When I want to select start date greater than end date
    When I want to fill idea objective field
    When I want to fill expected budget field
    When I want to fill Notes field
    When I want to click send idea button
    Then I want to check start date greater than end date error message
    Then I want to close browser
   


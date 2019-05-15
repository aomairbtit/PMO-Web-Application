@PMO
Feature: Set start date greater than end date and check error message
  I want to check start date greater than end date error message

  @smoke
  Scenario: Check start date greater than end date error message
   Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to fill project name
    When I want to select project type
    When I want to select project start date greater than end date
    Then I want to check start date greater than end date error message
    Then I want to close browser
   


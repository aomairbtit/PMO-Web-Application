@PMO
Feature: Add attachment with duplicate name
  I want to Add attachment with duplicate name

  @smoke
  Scenario: Add attachment with duplicate name
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to add attachment for the project
    When I want to refresh page
    When I want to add attachment for the project
    Then I want to verify user not able to add project attachment with already existed name
    Then I want to close browser

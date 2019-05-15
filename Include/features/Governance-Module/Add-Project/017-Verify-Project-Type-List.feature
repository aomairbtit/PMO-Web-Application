@PMO
Feature: Verify project type list
  I want to Verify project type list

  @smoke
  Scenario: Verify project type list
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to verify project type list
    Then I want to close browser

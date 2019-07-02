@tag
Feature: Verify Project list page
  I want to Verify Project list page

  @tag1
  Scenario: Verify Project list page
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    Then I want to close browser

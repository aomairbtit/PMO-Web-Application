@PMO
Feature: Verify delete idea
  I want to submit draft idea then verify delete functionality

  @smoke
  Scenario: Verify delete idea functionality
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to fill idea name field
    When I want to select expected start date
    When I want to select expected end date
    When I want to fill idea objective field
    When I want to fill expected budget field
    When I want to fill Notes field
    When I want to click save idea button
    When I want to wait for page load
    When I want to go to ideas list page
    When I want to search for idea by idea name
    When I want to click on delete idea icon
    Then I want to check idea has been deleted
    Then I want to close browser

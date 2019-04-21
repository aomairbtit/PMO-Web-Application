@PMO
Feature: Check that duration field filled automatically
  I want to check that duration field filled automatically after selecting start and end date

  @smoke
  Scenario: check that duration field filled automatically
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to fill idea name field
    When I want to select expected start date
    When I want to select expected end date
    When I want to check duration field filled automatically

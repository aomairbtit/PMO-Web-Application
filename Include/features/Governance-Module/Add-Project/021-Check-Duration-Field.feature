@PMO
Feature: Check that duration field filled automatically
  I want to check that duration field filled automatically after selecting start and end date

  @smoke
  Scenario: check that duration field filled automatically
     Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to select project expected start date
    When I want to select project expected end date
    When I want to check project duration field filled automatically
    Then I want to close browser


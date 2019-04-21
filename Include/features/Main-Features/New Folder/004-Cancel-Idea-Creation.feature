@PMO
Feature: PMO Cancel idea creatin
  I want to verify (cancel idea creation) process

  @smoke
  Scenario: Cancel idea creation process
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
    When I want to click Cancel idea button
    Then I want to check idea not created
    Then I want to close browser
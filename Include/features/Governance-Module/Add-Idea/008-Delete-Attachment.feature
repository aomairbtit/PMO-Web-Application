@PMO
Feature: Delete attachment
  I want to verify delete attachment from idea form

  @smoke
  Scenario: Delete attachment from idea form
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
    When I want to click on edit idea icon
    When I want to add Attachment
    When I want to refresh page
    When I want to click save idea button
    When I want to delete attachment
    Then I want to verify document removed
    Then I want to close browser
    

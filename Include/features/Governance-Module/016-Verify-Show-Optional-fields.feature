@PMO
Feature: Verify Show optional fields link
  I want to verify optional fields will appear after clicking on Show optional fields link

  @smoke
  Scenario: Verify Show optional fields link
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to click on Hide optional fields link
    Then I want to verify optional fields disappear
    When I want to click on Show optional fields link
    Then I want to verify optional fields appear
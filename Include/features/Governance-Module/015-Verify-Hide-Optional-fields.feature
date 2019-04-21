@PMO
Feature: Verify Hide optional fields link
  I want to verify optional fields will disappear after clicking on Hide optional fields link

  @smoke
  Scenario: Verify Hide optional fields link
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to click on Hide optional fields link
    Then I want to verify optional fields disappear

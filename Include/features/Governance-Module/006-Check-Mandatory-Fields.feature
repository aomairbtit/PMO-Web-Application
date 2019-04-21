@PMO
Feature: Check create idea form mandatory fields
  I want to check create idea form mandatory fields

  @smoke
  Scenario: check create idea form mandatory fields
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to click send idea button
    When I want to check idea name is a mandatory field
    When I want to check start date is a mandatory field
    When I want to check end date is a mandatory field
    When I want to check idea objective is a mandatory field
    Then I want to close browser 

@PMO
Feature: Check create project form mandatory fields
  I want to check create project form mandatory fields

  @smoke
  Scenario: check create project form mandatory fields
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to click on send project button
    Then I want to check mandatory fields error message
    When I want to check project name is a mandatory field
    When I want to check project type is a mandatory field
    When I want to check project start date is mandatory
    When I want to check project end date is mandatory
    When I want to check project budget is a mandatory field
    When I want to check project owner list is mandatory
    When I want to check project manager is a mandatory field
    When I want to check project owner is a mandatory field
    When I want to check project sponser is a mandatory field
    When I want to check project description is a mandatory field
    Then I want to close browser
    
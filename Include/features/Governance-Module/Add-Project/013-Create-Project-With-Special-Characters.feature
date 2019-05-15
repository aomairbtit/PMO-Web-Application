@PMO
Feature: Verify creating project with already existed name
  I want to verify creating project with already existed name
  @smoke
  Scenario: Verify creating project with already existed name
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to fill project name field with name that contains specail characters
    When I want to select project type
    When I want to select project expected start date
    When I want to select project expected end date
    When I want to fill project budget
    When I want to select from owner deopdown list
    When I want to fill project manager field
    When I want to tap enter key on manager field
    When I want to fill project owner field
    When I want to tap enter key on owner field
    When I want to fill project sponser field
    When I want to tap enter key on sponser field
    When I want to fill project description field
    When I want to click on send project button
    Then I want to check special characters error message
    Then I want to close browser

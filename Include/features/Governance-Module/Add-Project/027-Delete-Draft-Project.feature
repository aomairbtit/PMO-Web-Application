@PMO
Feature: Verify delete project
  I want to verify delete project
  @smoke
  Scenario: Verify delete project
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to fill project name
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
    When I want to fill project notes field
    When I want to add attachment for the project
    When I want to wait
    When I want to click on save project button
    When I want to wait for page load
    When I want to check im in projects list page
    When I want to search for crated project by name
    When I want to delete dradt project
    Then I want to check project has been deleted
    Then I want to close browser
    

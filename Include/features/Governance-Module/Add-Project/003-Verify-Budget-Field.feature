@PMO
Feature: Verify budget field doesn't accept alphapet
  I want to verify budget field doesn't accept alphapet

  @smoke
  Scenario: Verify budget field doesn't accept alphapet
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    Then I want to verify budget field doesn't accept alphapet
    Then I want to close browser
    
   
    

    

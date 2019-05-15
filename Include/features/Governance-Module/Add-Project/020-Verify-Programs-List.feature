@PMO
Feature: Verify programs list 
  I want to verify programs list 

  @smoke
  Scenario: Verify programs list 
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to verify programs list
    Then I want to close browser


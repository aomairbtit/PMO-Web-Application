@OOB
Feature: Login to OOB
  I want to login to OOB

  @smoke
  Scenario: Login to OOB
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    Then I want to close browser
    
    

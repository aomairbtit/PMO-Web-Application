@OOB
Feature: OOB Login
  I want to go to OOB and login

  @smoke
  Scenario: Go to OOB and login
    Given I want to go to OOB and login
    When I want to maximize window
    Then I verify I'm in OOB main page
    Then I want to close browser

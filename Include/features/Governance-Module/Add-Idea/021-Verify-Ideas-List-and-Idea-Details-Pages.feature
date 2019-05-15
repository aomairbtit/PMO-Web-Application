@PMO
Feature: Verify Ideas List and idea details pages
  I want to verify Ideas List page elements

  @smoke
  Scenario: Verify Ideas List page
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to verify Ideas List page
    When I want to verify idea details page
    Then I want to close browser
    

@PMO
Feature: Search for approved idea by name
  I want to search for approved idea by name

  @smoke
  Scenario: Search for approved idea by name
   Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to fill idea name field
    When I want to select expected start date
    When I want to select expected end date
    When I want to fill idea objective field
    When I want to fill expected budget field
    When I want to fill Notes field
    When I want to click send idea button
    Then I want to verify idea added successfuly
    When I want to approve idea
    When I want to go to OOB
    When I want to go to approved ideas list page
    When I want to search for approved idea by name
    Then I want to close browser
   
    
    
    
    

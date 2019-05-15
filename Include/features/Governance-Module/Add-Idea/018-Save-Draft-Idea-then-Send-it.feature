@PMO
Feature: Submit draft idea and check it can be editted and deleted
  I want to submit draft idea and check it can be editted and deleted then send it

  @smoke
  Scenario: Submit draft idea and check it can be editted and deleted
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
    When I want to click save idea button
    When I want to wait for page load
    When I want to go to ideas list page
    When I want to search for idea by idea name
    When I want to click on edit idea icon
    When I want to click send idea button
    Then I want to verify idea added successfuly
    Then I want to verify submitted idea cannot be deleted or edited
    Then I want to check submitted idea status is In Progress
    Then I want to check submitted idea sent to PMO office for approval
    Then I want to close browser
    
    

@PMO
Feature: Upload large size attachment (more than 2MB)
  I want upload large size attachment (more than 2MB)
  @smoke
  Scenario: Upload large size attachment (more than 2MB)
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to add large file as project attachment
    Then I want to check large file error message
    Then I want to verify Project Attachment not added
    Then I want to close browser
    
   
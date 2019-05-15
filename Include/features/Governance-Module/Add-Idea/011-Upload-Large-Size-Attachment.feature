@PMO
Feature: Upload large size attachment (more than 2MB)
  I want to upload large size attachment (more than 2MB) 

  @smoke
  Scenario: Upload large size attachment (more than 2MB)
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to add large file as Attachment
    Then I want to check large file error message
    Then I want to verify Attachment not added
    Then I want to close browser
    
  
    
    

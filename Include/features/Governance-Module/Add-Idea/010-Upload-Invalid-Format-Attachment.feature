@PMO
Feature: Verify uploading invalid format attachment error message
  I want to try to upload invalid file format and check error message

  @smoke
  Scenario: Verify that user unable to upload invalid foemat attachment
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to add invalid format Attachment
    Then I want to verify Attachment not added
    Then I want to close browser
    
  
    
    

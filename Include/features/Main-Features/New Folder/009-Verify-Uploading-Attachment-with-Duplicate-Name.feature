@PMO
Feature: Verify uploading attachment with duplicate name in add idea form
  I want to verify that user unable to upload attachment with duplicate name  

  @smoke
  Scenario: Verify that user unable to upload attachment with duplicate name
    Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to ideas list page
    When I want to click on Add New button
    When I want to add Attachment
    Then I want to verify document uploaded
    When I want to refresh page
    When I want to add Attachment
    Then I want to verify Attachment with already existed name not added
    
    

@PMO
Feature: Verify choose file error message
  I want to click Load button without choosing attachment and check error message

  @smoke
  Scenario: Verify that choose file error message displays after clicking Load button without choosing attachment
   Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to go to projects list
    Then I want to verify project list page
    When I want to click Add new project button
    When I want to click Add New Doc button
    When I want to click Load button
    Then I want to check choose file error message
    Then I want to verify Attachment not added
    Then I want to close browser
   
    
    
  
    
    

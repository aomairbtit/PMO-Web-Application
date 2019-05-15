@PMO
Feature: Verify Cancel execution idea
  I want to verify Cancel execution idea

  @smoke
  Scenario: Verify Cancel execution idea
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
    When I want to click Excute button
    When I want to verify im in add new project page
    When I want to select project type
    When I want to fill project manager field
    When I want to tap enter key on manager field
    When I want to fill project owner field
    When I want to tap enter key on owner field
    When I want to fill project sponser field
    When I want to tap enter key on sponser field
    When I want to fill project description field
    When I want to fill project notes field
    When I want to wait
    When I want to click on cancel creating new project button
    Then I want to verify Approved Ideas List page
    Then I want to close browser
    

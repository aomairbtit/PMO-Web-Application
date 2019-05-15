@OOB
Feature: Verify OOB Home Page
  I want to verify OOB home page elements

  @smoke
  Scenario: verify OOB home page elements
   Given I want to open browser
    When I want to maximize window
    When I want to go to OOB
    Then I want to verify I'm in OOB main page
    When I want to verify Dashboard presents
    When I want to verify Projects List presents
    When I want to verify Strategy Center presents
    When I want to verify Reports presents
    When I want to verify Tasks presents
    When I want to verify Support presents
    When I want to verify User Dropdwon presents
    When I want to verify Inbox Icon presents
    When I want to verify Settings presents
    When I want to verify Language presents
    Then I want to close browser
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/002-Verify-OOB-HomePage.feature");
formatter.feature({
  "name": "Verify OOB Home Page",
  "description": "  I want to verify OOB home page elements",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OOB"
    }
  ]
});
formatter.scenario({
  "name": "verify OOB home page elements",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OOB"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I want to open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainSteps.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to maximize window",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.maximizeWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to go to OOB",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.goToOOB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify I\u0027m in OOB main page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.verifyLoginToOOB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Dashboard presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyDashboardPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Projects List presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyProjectsListPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Strategy Center presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyStrategyCenterPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Reports presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyReportsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Tasks presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyTasksPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Support presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifySupportPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify User Dropdwon presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyUserDropdwonPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Inbox Icon presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyNotificationsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Settings presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifySettingsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Language presents",
  "keyword": "When "
});
formatter.match({
  "location": "MainSteps.verifyLanguagePresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});
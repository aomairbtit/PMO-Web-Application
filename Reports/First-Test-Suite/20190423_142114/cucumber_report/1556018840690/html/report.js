$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/026-Verify-Execute-Idea-form.feature");
formatter.feature({
  "name": "Verify execute idea form",
  "description": "  I want to verify execute idea form",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Verify execute idea form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PMO"
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
  "name": "I want to go to approved ideas list page",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.goToApprovedIdeasList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click Excute button",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.clickExcuteButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify im in add new project page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.verifyAddNewProjectPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check already filled fields",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.checkAlreadyFilledFields()"
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
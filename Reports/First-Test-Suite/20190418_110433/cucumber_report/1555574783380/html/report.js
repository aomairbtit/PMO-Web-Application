$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Main-Features/006-Check-Mandatory-Fields.feature");
formatter.feature({
  "name": "Check create idea form mandatory fields",
  "description": "  I want to check create idea form mandatory fields",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "check create idea form mandatory fields",
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
  "name": "I want to go to ideas list page",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.goToIdeasList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click on Add New button",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.clickAddNewIdea()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click send idea button",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.clickSendIdea()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check idea name is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.ideaNameMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check start date is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.startDateMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check end date is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.endDateMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check idea objective is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.ObjectiveMandatory()"
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
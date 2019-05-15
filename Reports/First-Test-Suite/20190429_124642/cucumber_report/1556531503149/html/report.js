$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/013-Check-Duration-Field.feature");
formatter.feature({
  "name": "Check that duration field filled automatically",
  "description": "  I want to check that duration field filled automatically after selecting start and end date",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "check that duration field filled automatically",
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
  "name": "I want to fill idea name field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.fillIdeaNameField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to select expected start date",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.selectStartDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to select expected end date",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.selectEndDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check duration field filled automatically",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.checkDurationField()"
});
formatter.result({
  "status": "passed"
});
});
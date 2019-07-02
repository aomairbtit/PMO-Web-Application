$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/024-Search-for-Approved-Idea.feature");
formatter.feature({
  "name": "Search for approved idea by name",
  "description": "  I want to search for approved idea by name",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Search for approved idea by name",
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
  "name": "I want to fill idea objective field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.fillObjectiveField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill expected budget field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.fillBudgetField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill Notes field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.fillNotesField()"
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
  "name": "I want to verify idea added successfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "AddIdeaSteps.verifyIdeaAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to approve idea",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.approveIdeaProcess()"
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
  "name": "I want to search for approved idea by name",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.searchForApprovedIdeaByName()"
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
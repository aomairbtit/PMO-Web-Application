$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Project/006-Add-Project-Attachment-with-Duplicate-Name.feature");
formatter.feature({
  "name": "Add attachment with duplicate name",
  "description": "  I want to Add attachment with duplicate name",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Add attachment with duplicate name",
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
  "name": "I want to go to projects list",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.clickProjectsList()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify project list page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProjectSteps.verifyProjectListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click Add new project button",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.clickAddNewProjectButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to add attachment for the project",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.addProjectAttachment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to refresh page",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.refresh()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to add attachment for the project",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.addProjectAttachment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify user not able to add project attachment with already existed name",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProjectSteps.verifyProjectAttachmentWithAlreadyExistedNamenotAdded()"
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
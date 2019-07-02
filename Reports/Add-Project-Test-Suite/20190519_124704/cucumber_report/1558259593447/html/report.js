$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Project/010-Check-Mandatory-Fields.feature");
formatter.feature({
  "name": "Check create project form mandatory fields",
  "description": "  I want to check create project form mandatory fields",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "check create project form mandatory fields",
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
  "name": "I want to click on send project button",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.clickSendProject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check mandatory fields error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProjectSteps.checkMandatoryFieldsErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project name is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectNameMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project type is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectTypeMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project start date is mandatory",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectStartDateMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project end date is mandatory",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectEndDateMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project budget is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectBudgetMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project owner list is mandatory",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectOwnerListMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project manager is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectManagerMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project owner is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectOwnerMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project sponser is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectSponserMandatory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check project description is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.projectDescriptionMandatory()"
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
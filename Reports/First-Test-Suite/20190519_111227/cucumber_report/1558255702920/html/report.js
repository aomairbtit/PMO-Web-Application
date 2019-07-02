$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Project/034-Upload-Invalid-Attachment-File-From-Documents-Page.feature");
formatter.feature({
  "name": "Upload invalid attachment file from documents page",
  "description": "  I want to Upload invalid attachment file from documents page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Upload invalid attachment file from documents page",
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
  "name": "I want to fill project name",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to select project type",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.selectProjectType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to select project expected start date",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.selectProjectStartDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to select project expected end date",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.selectProjectEndDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill project budget",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectBudget()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to select from owner deopdown list",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillSelectOwnerDropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill project manager field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectMangerField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to tap enter key on manager field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.tapEnterKeyManger()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill project owner field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectOwnerField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to tap enter key on owner field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.tapEnterKeyOwner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill project sponser field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectSponserField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to tap enter key on sponser field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.tapEnterKeySponser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill project description field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectDescriptionField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill project notes field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectNotesField()"
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
  "name": "I want to wait",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.waitForSeconds()"
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
  "name": "I want to wait for page load",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.waitForPgaeLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check im in projects list page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.checkProjectsListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to search for crated project by name",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.searchForProjectByName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to view project page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.viewProjectPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify documents page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.verifyDocumentsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to add invalid format Attachment from documents page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.uploadInvalidFormatAttachmentDocPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify invalid Attachment not added and check error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProjectSteps.verifyInvalidAttachmentnotAdded()"
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
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/029-Verify-Related-Project-Link.feature");
formatter.feature({
  "name": "Verify related project link for executed idea",
  "description": "  I want to Verify related project link for executed idea",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Verify related project link for executed idea",
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
  "name": "I want to search for project by name",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.searchForProjectByName()"
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
  "name": "I want to click on related project link",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.clickRelatedProjectLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Project Charter page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddIdeaSteps.verifyProjectCharterPage()"
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
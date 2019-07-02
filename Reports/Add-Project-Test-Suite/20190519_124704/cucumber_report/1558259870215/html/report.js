$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Project/016-Verify-Entity-Field(needs-update).feature");
formatter.feature({
  "name": "Verify project type list",
  "description": "  I want to Verify project type list",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Verify project type list",
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
  "name": "I want to verify project type list",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.verifyProjectType()"
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
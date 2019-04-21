$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Main-Features/011-Verify-Clicking-Load-With-No-Attachment.feature");
formatter.feature({
  "name": "Verify choose file error message",
  "description": "  I want to click Load button without choosing attachment and check error message",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Verify that choose file error message displays after clicking Load button without choosing attachment",
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
  "name": "I want to click Add New Doc button",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.clickAddNewDocButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click Load button",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.clickLoadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check choose file error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddIdeaSteps.checkChooseFileErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify Attachment not added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddIdeaSteps.verifyLargeAttachmentnotAdded()"
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
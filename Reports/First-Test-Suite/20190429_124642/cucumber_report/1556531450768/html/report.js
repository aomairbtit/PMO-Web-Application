$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/011-Upload-Large-Size-Attachment.feature");
formatter.feature({
  "name": "Verify uploading attachment with duplicate name in add idea form",
  "description": "  I want to verify that user unable to upload attachment with duplicate name  ",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Verify that user unable to upload attachment with duplicate name",
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
  "name": "I want to add large file as Attachment",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.uploadLargeAttachment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to check large file error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddIdeaSteps.checkLargeFileErrorMessage()"
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
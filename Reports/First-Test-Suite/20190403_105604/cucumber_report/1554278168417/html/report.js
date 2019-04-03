$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Main-Features/Login-to-OOB.feature");
formatter.feature({
  "name": "OOB Login",
  "description": "  I want to go to OOB and login",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OOB"
    }
  ]
});
formatter.scenario({
  "name": "Go to OOB and login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OOB"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I want to go to OOB and login",
  "keyword": "Given "
});
formatter.match({
  "location": "MainSteps.OpenOOB()"
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
  "name": "I verify I\u0027m in OOB main page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.verifyLoginToOOB()"
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
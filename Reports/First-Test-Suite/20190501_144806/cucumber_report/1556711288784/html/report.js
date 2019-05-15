$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/006-Check-Mandatory-Fields.feature");
formatter.feature({
  "name": "Check create idea form mandatory fields",
  "description": "  I want to check create idea form mandatory fields",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "check create idea form mandatory fields",
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
  "name": "I want to check idea name is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.ideaNameMandatory()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to verify object \u0027Object Repository/OOBObjects/IdeasListObjects/IdeaNameMandatoryField\u0027 is visible\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementVisibleKeyword.verifyElementVisible(VerifyElementVisibleKeyword.groovy:97)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementVisibleKeyword.execute(VerifyElementVisibleKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:56)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementVisible(WebUiBuiltInKeywords.groovy:358)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementVisible$6.call(Unknown Source)\r\n\tat com.pmo.steps.AddIdeaSteps.ideaNameMandatory(AddIdeaSteps.groovy:459)\r\n\tat ✽.I want to check idea name is a mandatory field(C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/006-Check-Mandatory-Fields.feature:14)\r\nCaused by: com.kms.katalon.core.exception.StepFailedException: Web element with id: \u0027Object Repository/OOBObjects/IdeasListObjects/IdeaNameMandatoryField\u0027 located by \u0027By.xpath: //*[@id\u003d\u0027TxtIdeaNameError\u0027]/span\u0027 not found\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementVisibleKeyword$_verifyElementVisible_closure1.doCall(VerifyElementVisibleKeyword.groovy:89)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementVisibleKeyword$_verifyElementVisible_closure1.call(VerifyElementVisibleKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementVisibleKeyword.verifyElementVisible(VerifyElementVisibleKeyword.groovy:97)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementVisibleKeyword.execute(VerifyElementVisibleKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:56)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementVisible(WebUiBuiltInKeywords.groovy:358)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementVisible$6.call(Unknown Source)\r\n\tat com.pmo.steps.AddIdeaSteps.ideaNameMandatory(AddIdeaSteps.groovy:459)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:66)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:101)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat 006-Check-Mandatory-Fields.run(006-Check-Mandatory-Fields:16)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:331)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:322)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:301)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:293)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:227)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:129)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:112)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:81)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1556711286907.run(TempTestSuite1556711286907.groovy:35)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I want to check start date is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.startDateMandatory()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to check end date is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.endDateMandatory()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to check idea objective is a mandatory field",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.ObjectiveMandatory()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});
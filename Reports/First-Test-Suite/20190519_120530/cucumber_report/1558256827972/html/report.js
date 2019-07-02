$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/012-Start-Date-Greater-Than-End-Date.feature");
formatter.feature({
  "name": "Set start date greater than end date and check error message",
  "description": "  I want to check start date greater than end date error message",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PMO"
    }
  ]
});
formatter.scenario({
  "name": "Check start date greater than end date error message",
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
  "name": "I want to select start date greater than end date",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.startDateGreaterThanEndDate()"
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
  "name": "I want to check start date greater than end date error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddIdeaSteps.checkStartDateGreaterThanEndDateErrorMessage()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Verify element text of test object \u0027Object Repository/OOBObjects/IdeasListObjects/ErrorMessage\u0027 FAILED.\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.verifyElementText(VerifyElementTextKeyword.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.execute(VerifyElementTextKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:56)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementText(WebUiBuiltInKeywords.groovy:3663)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementText$12.call(Unknown Source)\r\n\tat com.pmo.steps.AddIdeaSteps.checkStartDateGreaterThanEndDateErrorMessage(AddIdeaSteps.groovy:516)\r\n\tat ✽.I want to check start date greater than end date error message(C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Idea/012-Start-Date-Greater-Than-End-Date.feature:19)\r\nCaused by: com.kms.katalon.core.exception.StepFailedException: Actual text \u0027يجب ان يكون تاريخ النهاية اكبر من تاريخ البداية\u0027 and expected text \u0027تاريخ النهاية يجب ان يكون اكبر من تاريخ البداية\u0027 of test object \u0027Object Repository/OOBObjects/IdeasListObjects/ErrorMessage\u0027 are NOT matched.\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword$_verifyElementText_closure1.doCall(VerifyElementTextKeyword.groovy:57)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword$_verifyElementText_closure1.call(VerifyElementTextKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.verifyElementText(VerifyElementTextKeyword.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword.execute(VerifyElementTextKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:56)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementText(WebUiBuiltInKeywords.groovy:3663)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementText$12.call(Unknown Source)\r\n\tat com.pmo.steps.AddIdeaSteps.checkStartDateGreaterThanEndDateErrorMessage(AddIdeaSteps.groovy:516)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:66)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:101)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat 012-Start-Date-Greater-Than-End-Date.run(012-Start-Date-Greater-Than-End-Date:16)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:331)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:322)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:301)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:293)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:227)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:129)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:112)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:81)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1558256730283.run(TempTestSuite1558256730283.groovy:35)\r\n",
  "status": "failed"
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
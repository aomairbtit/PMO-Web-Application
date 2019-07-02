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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to verify object \u0027Object Repository/OOBObjects/HomepageObjects/OOBSideBar\u0027 is present\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:56)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1434)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$3.call(Unknown Source)\r\n\tat com.pmo.steps.MainSteps.verifyLoginToOOB(MainSteps.groovy:71)\r\n\tat ✽.I want to verify I\u0027m in OOB main page(C:/Users/HP/git/PMO-Web-Application/Include/features/Governance-Module/Add-Project/034-Upload-Invalid-Attachment-File-From-Documents-Page.feature:9)\r\nCaused by: org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:07:36.161Z\u0027\nSystem info: host: \u0027HP45G5\u0027, ip: \u0027192.168.1.110\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: com.kms.katalon.selenium.driver.CChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:59072}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 56d00a6fa5a20221cb10b94ffcf90e95\n*** Element info: {Using\u003dxpath, value\u003d(.//*[normalize-space(text()) and normalize-space(.)\u003d\u0027النظام\u0027])[1]/following::ul[2]}\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat com.kms.katalon.selenium.driver.CChromeDriver.execute(CChromeDriver.java:20)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:397)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:476)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:358)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElements(WebUiCommonHelper.java:754)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1049)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.doCall(VerifyElementPresentKeyword.groovy:79)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.call(VerifyElementPresentKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:56)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1434)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$3.call(Unknown Source)\r\n\tat com.pmo.steps.MainSteps.verifyLoginToOOB(MainSteps.groovy:71)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:66)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:101)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Script1557915780373.run(Script1557915780373.groovy:16)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:331)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:322)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:301)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:293)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:227)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:129)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:112)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:81)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1558006503415.run(TempTestSuite1558006503415.groovy:35)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I want to go to projects list",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.clickProjectsList()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to verify project list page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProjectSteps.verifyProjectListPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to click Add new project button",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.clickAddNewProjectButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to fill project name",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to select project type",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.selectProjectType()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to select project expected start date",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.selectProjectStartDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to select project expected end date",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.selectProjectEndDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to fill project budget",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectBudget()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to select from owner deopdown list",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillSelectOwnerDropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to fill project manager field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectMangerField()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to tap enter key on manager field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.tapEnterKeyManger()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to fill project owner field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectOwnerField()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to tap enter key on owner field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.tapEnterKeyOwner()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to fill project sponser field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectSponserField()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to tap enter key on sponser field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.tapEnterKeySponser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to fill project description field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectDescriptionField()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to fill project notes field",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.fillProjectNotesField()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to add attachment for the project",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.addProjectAttachment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to wait",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.waitForSeconds()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to click on send project button",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.clickSendProject()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to wait for page load",
  "keyword": "When "
});
formatter.match({
  "location": "AddIdeaSteps.waitForPgaeLoad()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to check im in projects list page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.checkProjectsListPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to search for crated project by name",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.searchForProjectByName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to view project page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.viewProjectPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to verify documents page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.verifyDocumentsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to add invalid format Attachment from documents page",
  "keyword": "When "
});
formatter.match({
  "location": "AddProjectSteps.uploadInvalidFormatAttachmentDocPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I want to verify invalid Attachment not added and check error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProjectSteps.verifyInvalidAttachmentnotAdded()"
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
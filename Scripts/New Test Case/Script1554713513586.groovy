import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

int RN = ((Math.random() * 500) as int)

String ideaName = 'Automation' + RN

WebUI.deleteAllCookies()

WebUI.openBrowser('http://pmoadmin:P@ssw0rd@dev5.cloudapp.net/OOB2/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('OOBObjects/HomepageObjects/IdeasList'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/AddNewIdeaButton'))

WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Idea-Name-Field'), ideaName)

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-Start-date-Check-Box'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Excepted-Start-Date'))

WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/Day26'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Day26'))

WebUI.waitForElementVisible(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-End-Date-Check-Box'), 10)

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-End-Date-Check-Box'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByIndex(findTestObject('OOBObjects/IdeasListObjects/EndDateMonthDropdown'), 4)

WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/EndDateDay15'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/EndDateDay15'))

WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Idea-Objective-Field'), 'test ')

WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Expected-Budget-Field'), '10000')

WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Notes-Field'), 'test')

WebUI.mouseOver(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('null'))

WebUI.refresh()

WebUI.mouseOver(findTestObject('OOBObjects/HomepageObjects/IdeasList'))

WebUI.click(findTestObject('OOBObjects/HomepageObjects/IdeasList'))

WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/SearchField'), ideaName)

WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/SearchResult'), ideaName)

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/EditIdea'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'))

WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)

WebUI.uploadFile(findTestObject('OOBObjects/IdeasListObjects/Upload-File'), 'C:\\Users\\HP\\Desktop\\download.png')

WebUI.waitForElementPresent(findTestObject('OOBObjects/IdeasListObjects/AttachedFile'), 0)

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/LoadButton'))

WebUI.refresh()

WebUI.click(findTestObject('null'))

WebUI.refresh()

WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)

WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/DeleteAttachment'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/DeleteAttachment'))

WebUI.acceptAlert()

WebUI.verifyElementNotPresent(findTestObject('OOBObjects/IdeasListObjects/UploadedDocument'), 0)

WebUI.delay(5)

WebUI.verifyNotEqual(WebUI.getText(findTestObject('OOBObjects/IdeasListObjects/IdeaDurationField')), null)

WebUI.getText(findTestObject(null))

WebUI.verifyElementText(findTestObject('OOBObjects/ApprovedIdeasListObjects/IdeaNameLinkInApprovedIdeasList'), 'approvetest')

WebUI.selectOptionByIndex(findTestObject('null'), 1)

WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/ProjectMangerField'), 0)

WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Idea-Name-Field'), 'test')

WebUI.sendKeys(findTestObject('OOBObjects/ProjectsListObjects/ProjectMangerField'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject(null), 0)

WebUI.uploadFile(findTestObject('OOBObjects/InboxPageObjects/UploadFileApproveIdea'), 'C:\\Users\\HP\\Desktop\\SK.png')

WebUI.scrollToElement(findTestObject(null), 0)

WebUI.verifyElementClickable(findTestObject(null))

WebUI.selectOptionByIndex(findTestObject('OOBObjects/InboxPageObjects/PriorityDropdownApproveIdea'), 0)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('OOBObjects/ApprovedIdeasListObjects/ProjectCharterTitle'), 'ميثاق المشروع')

WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/StrategicProjectCheckBox'), 0)

WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectExpectedBudget'), 'test')

WebUI.verifyEqual(findTestObject('OOBObjects/ProjectsListObjects/ProjectExpectedBudget'), 0)

WebUI.verifyNotEqual(null, null)

WebUI.verifyElementNotPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectAttachedFile'), 0)

WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeDropDwon'), 'داخلي', false)

WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/InitiativesList'), 0)

WebUI.getText(findTestObject('OOBObjects/ProjectsListObjects/FirstPortfolio'))

WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/PortfolioList'), '', false)

WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectNameProjectDetails'), 'اسم المشروع')

WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/Portfolio'), 0)

WebUI.uploadFile(findTestObject('OOBObjects/DocumnetsPageObjects/UploadFile'), 'C:\\Users\\HP\\Desktop\\download.png')

WebUI.waitForElementPresent(findTestObject('OOBObjects/DocumnetsPageObjects/UploadedFile'), 0)

WebUI.selectOptionByIndex(findTestObject('OOBObjects/DocumnetsPageObjects/PhaseAddDocumentPage'), 2)

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'حجم الملف اكبر من المسموح به, أقصى حجم 2.0MB.')

WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportSubjectField'), 'Automation support')

WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportNotesField'), 'Automation support note')

WebUI.clearText(findTestObject('OOBObjects/SupportPageObjects/SupportSubjectField'))

WebUI.clearText(findTestObject('OOBObjects/SupportPageObjects/SupportNotesField'))


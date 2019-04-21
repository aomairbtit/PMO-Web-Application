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

int RN = ((Math.random() * 500) as int)

String ideaName = 'Automation' + RN

WebUI.deleteAllCookies()

WebUI.openBrowser('http://pmoadmin:P@ssw0rd@dev5.cloudapp.net/OOB2/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('OOB-Objects/IdeasList'))

WebUI.click(findTestObject('PMO-Objects/Page_Project Request/Add-New-Project-Request'))

WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'), ideaName)

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-Start-date-Check-Box'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excepted-Start-Date'))

WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))

WebUI.waitForElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-End-Date-Check-Box'), 10)

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-End-Date-Check-Box'))

WebUI.click(findTestObject('null'))

WebUI.selectOptionByIndex(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateMonthDropdown'), 4)

WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateDay15'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateDay15'))

WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Objective-Field'), 'test ')

WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Expected-Budget-Field'), '10000')

WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Notes-Field'), 'test')

WebUI.mouseOver(findTestObject('SaveIdeaButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SaveIdeaButton'))

WebUI.refresh()

WebUI.mouseOver(findTestObject('OOB-Objects/IdeasList'))

WebUI.click(findTestObject('OOB-Objects/IdeasList'))

WebUI.setText(findTestObject('PMO-Objects/Page_Project Request/SearchField'), ideaName)

WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Project Request/SearchResult'), ideaName)

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/EditIdea'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'))

WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)

WebUI.uploadFile(findTestObject('PMO-Objects/Page_Add New Project Request/Upload-File'), 'C:\\Users\\HP\\Desktop\\download.png')

WebUI.waitForElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/AttachedFile'), 0)

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/LoadButton'))

WebUI.refresh()

WebUI.click(findTestObject('SaveIdeaButton'))

WebUI.refresh()

WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)

WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/DeleteAttachment'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/DeleteAttachment'))

WebUI.acceptAlert()

WebUI.verifyElementNotPresent(findTestObject('PMO-Objects/Page_Add New Project Request/UploadedDocument'), 0)

WebUI.delay(5)

WebUI.verifyNotEqual(WebUI.getText(findTestObject('PMO-Objects/Page_Add New Project Request/IdeaDurationField')), null)

WebUI.getText(findTestObject(null))

WebUI.verifyElementText(findTestObject('PMO-Objects/InboxPage/BeforeInitiateObjects/IdeaPhase'), 'مكتب إدارة المشاريع')


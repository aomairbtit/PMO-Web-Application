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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://pmoadmin:P@ssw0rd@dev5.cloudapp.net/OOB2/')

WebUI.click(findTestObject('OOB-Objects/IdeasList'))

WebUI.click(findTestObject('PMO-Objects/Page_Project Request/Add-New-Project-Request'))

not_run: WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/SendIdeaButton'))

not_run: WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/IdeaNameMandatoryField'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-Start-date-Check-Box'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excepted-Start-Date'))

WebUI.selectOptionByIndex(findTestObject('PMO-Objects/Page_Add New Project Request/StartDateMonthDropDwon'), 4)

WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))

WebUI.selectOptionByIndex(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateMonthDropdown'), 4)

WebUI.verifyElementNotPresent(findTestObject('PMO-Objects/Page_Add New Project Request/AttachedFile'), 0)

WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 'صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.')

WebUI.verifyTextPresent('صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.', 
    false)

WebUI.scrollToElement(findTestObject(null), 0)

WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 0)

WebUI.clearText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'))

WebUI.getText(findTestObject(null))


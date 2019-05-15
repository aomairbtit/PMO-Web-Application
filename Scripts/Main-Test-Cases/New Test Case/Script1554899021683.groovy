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

WebUI.click(findTestObject('OOBObjects/HomepageObjects/IdeasList'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/AddNewIdeaButton'))

not_run: WebUI.click(findTestObject('OOBObjects/IdeasListObjects/SendIdeaButton'))

not_run: WebUI.verifyElementVisible(findTestObject('OOBObjects/IdeasListObjects/IdeaNameMandatoryField'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-Start-date-Check-Box'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Excepted-Start-Date'))

WebUI.selectOptionByIndex(findTestObject('OOBObjects/IdeasListObjects/StartDateMonthDropDwon'), 4)

WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/Day26'))

WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Day26'))

WebUI.selectOptionByIndex(findTestObject('OOBObjects/IdeasListObjects/EndDateMonthDropdown'), 4)

WebUI.verifyElementNotPresent(findTestObject('OOBObjects/IdeasListObjects/AttachedFile'), 0)

WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.')

WebUI.verifyTextPresent('صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.', 
    false)

WebUI.scrollToElement(findTestObject(null), 0)

WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 0)

WebUI.clearText(findTestObject('OOBObjects/IdeasListObjects/Idea-Name-Field'))

WebUI.getText(findTestObject(null))


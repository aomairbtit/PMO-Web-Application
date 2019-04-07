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

WebUI.openBrowser('http://pmoadmin:P@ssw0rd@dev5.cloudapp.net/OOB2/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('OOB-Objects/IdeasList'))

WebUI.click(findTestObject('PMO-Objects/Page_Project Request/Add-New-Project-Request'))

WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'), 'Automation Ideia')

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Expected-Start-date/GREGORIAN-Start-date-Check-Box'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excepted-Start-Date'))

WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/Expected-Start-date/Day26'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Expected-Start-date/Day26'))


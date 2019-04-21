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

WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'), 'save name')

WebUI.getText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'))

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'))

WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)

WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), 'test1')

WebUI.uploadFile(findTestObject('PMO-Objects/Page_Add New Project Request/Upload-File'), 'C:\\Users\\HP\\Desktop\\Automation book Mitsubishi.pdf')

not_run: WebUI.waitForElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/AttachedFile'), 0)

WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/LoadButton'))

WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 'حجم الملف اكبر من المسموح به, أقصى حجم 2.0MB.')

not_run: WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/UploadedDocument'), 0)

not_run: WebUI.verifyElementNotVisible(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'))

not_run: WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/LoadButton'))

not_run: WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), 'test1')

not_run: WebUI.uploadFile(findTestObject('PMO-Objects/Page_Add New Project Request/Upload-File'), 'C:\\Users\\HP\\Desktop\\download.png')

not_run: WebUI.waitForElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/AttachedFile'), 0)

not_run: WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/LoadButton'))

not_run: WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), FailureHandling.STOP_ON_FAILURE)


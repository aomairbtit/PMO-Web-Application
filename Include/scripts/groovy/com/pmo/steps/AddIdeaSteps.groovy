package com.pmo.steps
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class AddIdeaSteps {

	@When("I want to go to ideas list page")
	def goToIdeasList() {
		WebUI.click(findTestObject('OOB-Objects/IdeasList'))
	}

	@When("I want to verify Ideas List page")
	def verifyIdeasListPage() {
		WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Project Request/IdeaNameColumn'),0)
		WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Project Request/ExpectedBudgetColumn'),0)
		WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Project Request/StatusColumn'),0)
		WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Project Request/ActionsColumn'),0)
		WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Project Request/SearchSectionIdeasList'),0)
		WebUI.verifyElementClickable(findTestObject('PMO-Objects/Page_Project Request/IdeaNameInIdeasList'))
	}

	
	@When("I want to verify idea details page")
	def verifyIdeaNameLink(){
		WebUI.click(findTestObject('PMO-Objects/Page_Project Request/IdeaNameInIdeasList'))
		WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Project Request/IdeaDetailsSection'),0)
	}

	@When("I want to wait for page load")
	def waitForPgaeLoad() {
		WebUI.waitForPageLoad(0)
		WebUI.refresh()
	}

	@When("I want to go to Homepage")
	def goToHomePage() {
		WebUI.focus(findTestObject('OOB-Objects/HomePage'))
		WebUI.mouseOver(findTestObject('OOB-Objects/HomePage'))
		WebUI.click(findTestObject('OOB-Objects/HomePage'))
	}

	@When("I want to click on Add New button")
	def clickAddNewIdea() {
		WebUI.click(findTestObject('PMO-Objects/Page_Project Request/Add-New-Project-Request'))
	}


	@When('I want to click on Hide optional fields link')
	def clickHideOptionalFieldsLink(){
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/HideOptionalFields'))
	}

	@When('I want to click on Show optional fields link')
	def clickShowOptionalFieldsLink(){
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/HomePage-Breadcrumb'), 0)
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/ShowOptionalFields'))
	}

	@Then('I want to verify optional fields disappear')
	def optionalFieldsDisappear(){
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)
		WebUI.verifyElementNotVisible(findTestObject('PMO-Objects/Page_Add New Project Request/Notes-Field'))
	}

	@Then('I want to verify optional fields appear')
	def optionalFieldsAppear(){
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)
		WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/Notes-Field'))
	}


	// idea name variable

	int RN = ((Math.random() * 10000) as int)

	String ideaName = 'Automation' + RN

	@When("I want to fill idea name field")
	def fillIdeaNameField() {
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'), ideaName)
	}

	//Start date greater than End date
	@When("I want to select start date greater than end date")
	def startDateGreaterThanEndDate() {
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-Start-date-Check-Box'))
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excepted-Start-Date'))
		WebUI.selectOptionByIndex(findTestObject('PMO-Objects/Page_Add New Project Request/StartDateMonthDropDwon'), 7)
		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))
		WebUI.waitForElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-End-Date-Check-Box'), 6)
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-End-Date-Check-Box'))
		WebUI.delay(5)
		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/Excpected-End-Date'))
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excpected-End-Date'))
		WebUI.selectOptionByIndex(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateMonthDropdown'), 4)
		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateDay15'))
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateDay15'))
	}

	//click on expected end date
	@When('i want to click on expected end date')
	def clickExpectedEndDate(){
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excpected-End-Date'))
	}


	@When("I want to select expected start date")
	def selectStartDate() {
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-Start-date-Check-Box'))

		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excepted-Start-Date'))

		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))

		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Day26'))
	}

	@When("I want to select expected end date")
	def selectEndDate() {
		WebUI.waitForElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-End-Date-Check-Box'), 6)

		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/GREGORIAN-End-Date-Check-Box'))

		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/Excpected-End-Date'))

		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excpected-End-Date'))

		WebUI.selectOptionByIndex(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateMonthDropdown'), 4)

		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateDay15'))

		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateDay15'))
	}


	@When("I want to check duration field filled automatically")
	def checkDurationField() {
		WebUI.verifyNotEqual(WebUI.getText(findTestObject('PMO-Objects/Page_Add New Project Request/IdeaDurationField')), null)
	}

	@When("I want to fill idea objective field")
	def fillObjectiveField() {
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Objective-Field'), 'Automation')
	}

	@When("I want to fill expected budget field")
	def fillBudgetField() {
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Expected-Budget-Field'), '10000')
	}

	@When("I want to fill Notes field")
	def fillNotesField() {
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Notes-Field'), 'test note')
	}

	@When("I want to add Attachment")
	def uploadAttachment() {
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), 'test1')
		WebUI.uploadFile(findTestObject('PMO-Objects/Page_Add New Project Request/Upload-File'), 'C:\\Users\\HP\\Desktop\\download.png')
		WebUI.waitForElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/AttachedFile'), 0)
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/LoadButton'))
	}

	@When("I want to add large file as Attachment")
	def uploadLargeAttachment() {
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), 'test1')
		WebUI.uploadFile(findTestObject('PMO-Objects/Page_Add New Project Request/Upload-File'), 'C:\\Users\\HP\\Desktop\\Automation book Mitsubishi.pdf')
	}


	@When("I want to add invalid format Attachment")
	def uploadInvalidFormatAttachment() {
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), 'Test Attachment')
		WebUI.uploadFile(findTestObject('PMO-Objects/Page_Add New Project Request/Upload-File'), 'C:\\Users\\HP\\Desktop\\chromedriver.exe')
	}

	@When('I want to click Add New Doc button')
	def clickAddNewDocButton(){
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)
	}

	@When('I want to click Load button')
	def clickLoadButton(){
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/LoadButton'))
	}

	@Then("I want to verify Attachment not added")
	def verifyLargeAttachmentnotAdded() {
		WebUI.verifyElementNotPresent(findTestObject('PMO-Objects/Page_Add New Project Request/AttachedFile'), 0)
	}

	@Then("I want to verify Attachment with already existed name not added")
	def verifyAttachmentWithAlreadyExistedNamenotAdded() {
		WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/AttachmentNameField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to click send idea button")
	def clickSendIdea() {
		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/CardBlock'), 0)
		WebUI.focus(findTestObject('PMO-Objects/Page_Add New Project Request/SendIdeaButton'))
		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/SendIdeaButton'))
		WebUI.waitForElementClickable(findTestObject('PMO-Objects/Page_Add New Project Request/SendIdeaButton'), 6)
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/SendIdeaButton'))
	}

	@Then("I want to verify idea added successfuly")
	def verifyIdeaAdded() {
		WebUI.waitForPageLoad(0)
		WebUI.setText(findTestObject('PMO-Objects/Page_Project Request/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Project Request/SearchResult'), ideaName)
	}

	@Then("I want to verify submitted idea cannot be deleted or edited")
	def checkSubmittedIdeaCantBeDeletedorEdited() {
		WebUI.verifyElementNotPresent(findTestObject('PMO-Objects/Page_Add New Project Request/DeleteIdeaIcon'), 0)
		WebUI.verifyElementNotPresent(findTestObject('PMO-Objects/Page_Add New Project Request/EditIdea'), 0)
	}

	@Then("I want to check submitted idea status is In Progress")
	def checkSubmittedIdeaStatusIsInProgress() {
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/IdeaStatus'),'قيد الاجراء')
	}

	@Then("I want to check submitted idea sent to PMO office for approval")
	def checkSubmittedIdeaSentToPMO() {
		WebUI.click(findTestObject('OOB-Objects/InboxIcon'))
		WebUI.click(findTestObject('PMO-Objects/InboxPage/BeforeInitiatePhase'))
		WebUI.verifyElementText(findTestObject('PMO-Objects/InboxPage/BeforeInitiateObjects/IdeaPhase'), 'مكتب إدارة المشاريع')
	}


	@When("I want to click Cancel idea button")
	def clickCancelIdea() {
		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/CancelIdeaButton'))
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/CancelIdeaButton'))
	}

	@When("I want to click save idea button")
	def clickSaveIdea() {
		WebUI.verifyElementPresent(findTestObject('SaveIdeaButton'), 0)
		WebUI.waitForElementClickable(findTestObject('SaveIdeaButton'), 0)
		WebUI.click(findTestObject('SaveIdeaButton'))
		WebUI.waitForPageLoad(0)

	}

	@When("I want to check idea not created")
	def checkCancelation() {
		WebUI.setText(findTestObject('PMO-Objects/Page_Project Request/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Project Request/SearchResult'), 'لم يُعثر على أية سجلات')
	}

	@When("I want to search on saved idea")
	def searchOnSavedIdea() {
		WebUI.setText(findTestObject('PMO-Objects/Page_Project Request/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Project Request/SearchResult'), ideaName)
	}

	@When("I want to check idea name is a mandatory field")
	def ideaNameMandatory() {
		WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/IdeaNameMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check start date is a mandatory field")
	def startDateMandatory() {
		WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/StartDateMandatory'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check end date is a mandatory field")
	def endDateMandatory() {
		WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/EndDateMandatory'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check idea objective is a mandatory field")
	def ObjectiveMandatory() {
		WebUI.verifyElementVisible(findTestObject('PMO-Objects/Page_Add New Project Request/ObjectiveMandatory'), FailureHandling.STOP_ON_FAILURE)
	}


	@When("I want to click on edit idea icon")
	def clickEditIdea() {
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/EditIdea'))
	}


	@When("I want to edit idea name")
	def editIdeaName() {
		WebUI.clearText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'))
		WebUI.setText(findTestObject('PMO-Objects/Page_Add New Project Request/Idea-Name-Field'), 'Updated ' + ideaName)

	}

	@When("I want to search on updated idea")
	def searchOnUpdatedIdea() {
		WebUI.setText(findTestObject('PMO-Objects/Page_Project Request/SearchField'), 'Updated ' + ideaName)
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Project Request/SearchResult'), 'Updated ' + ideaName)
	}

	@When("I want to click on delete idea icon")
	def clickdeleteIdea() {
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/DeleteIdeaIcon'))
		WebUI.acceptAlert()
	}

	@Then("I want to check idea has been deleted")
	def checkIdeaDeleted() {
		WebUI.refresh()
		WebUI.setText(findTestObject('PMO-Objects/Page_Project Request/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Project Request/SearchResult'), 'لم يُعثر على أية سجلات')
	}

	@When("I want to refresh page")
	def refresh() {
		WebUI.refresh()
	}

	@When("I want to delete attachment")
	def deleteAttachment() {
		WebUI.refresh()

		WebUI.scrollToElement(findTestObject('PMO-Objects/Page_Add New Project Request/Add-New-Document-Button'), 0)

		WebUI.mouseOver(findTestObject('PMO-Objects/Page_Add New Project Request/DeleteAttachment'))

		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/DeleteAttachment'))

		WebUI.acceptAlert()
	}


	@Then("I want to verify document uploaded")
	def verifyDocumentUploaded() {
		WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/UploadedDocument'), 0)
	}

	@Then("I want to verify document removed")
	def verifyDocumentRemoved() {
		WebUI.verifyElementNotPresent(findTestObject('PMO-Objects/Page_Add New Project Request/UploadedDocument'), 0)
	}

	@Then("I want to check large file error message")
	def checkLargeFileErrorMessage() {
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 'حجم الملف اكبر من المسموح به, أقصى حجم 2.0MB.')
	}

	@Then("I want to check start date greater than end date error message")
	def checkStartDateGreaterThanEndDateErrorMessage() {
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 'يجب ان يكون تاريخ النهاية اكبر من تاريخ البداية')
	}

	@Then("I want to check choose file error message")
	def checkChooseFileErrorMessage() {
		WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 'اختر ملف')
	}

	@Then("I want to check invalid file format error message")
	def checkInvalidFileErrorMessage() {
		//WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 0)
		//WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 'صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.')
		WebUI.verifyTextPresent('صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.',
				false)
	}

}
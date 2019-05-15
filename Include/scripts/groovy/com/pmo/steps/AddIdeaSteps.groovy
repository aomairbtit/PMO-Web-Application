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
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/IdeasList'))
	}

	@When("I want to go to approved ideas list page")
	def goToApprovedIdeasList() {
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/ApprovedIdeasList'))
	}



	@When("I want to click Excute button")
	def clickExcuteButton() {
		WebUI.click(findTestObject('OOBObjects/ApprovedIdeasListObjects/ExcuteButton'))
	}

	@When("I want to go to projects list page")
	def goToProjectsList() {
		WebUI.click(findTestObject('OOB-Objects/Projects-List'))
	}


	@Then("I want to verify Ideas List page")
	def verifyIdeasListPage() {
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/IdeaNameColumn'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/ExpectedBudgetColumn'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/StatusColumn'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/ActionsColumn'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/SearchSectionIdeasList'),0)
		WebUI.verifyElementClickable(findTestObject('OOBObjects/IdeasListObjects/IdeaNameInIdeasList'))
	}

	@Then("I want to verify Approved Ideas List page")
	def verifyApprovedIdeasListPage() {
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/ApprovedIdeasListTitle'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/IdeaNameColumnInApprovedIdeasList'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/ExpectedBudgetColumnInApprovedIdeasList'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/StatusColumnInApprovedIdeasList'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/PriorityColumnInApprovedIdeasList'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/ActionsColumnInApprovedIdeasList'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/SearchSectionInApprovedIdeasList'),0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/ExcuteButton'),0)
		WebUI.verifyElementClickable(findTestObject('OOBObjects/ApprovedIdeasListObjects/IdeaNameLinkInApprovedIdeasList'))
	}


	@When("I want to search for approved idea by name")
	def searchForApprovedIdeaByName(){
		WebUI.setText(findTestObject('OOBObjects/ApprovedIdeasListObjects/ApprovedIdeasSearchField'),ideaName)
		WebUI.verifyElementText(findTestObject('OOBObjects/ApprovedIdeasListObjects/IdeaNameLinkInApprovedIdeasList'), ideaName)
	}

	@When("I want to click on related project link")
	def clickRelatedProjectLink(){
		WebUI.click(findTestObject('OOBObjects/ApprovedIdeasListObjects/RelatedProjectLink'))
	}

	@When("I want to verify Project Charter page")
	def verifyProjectCharterPage(){
		WebUI.switchToWindowIndex(1)
		WebUI.verifyElementText(findTestObject('OOBObjects/ApprovedIdeasListObjects/ProjectCharterTitle'), 'ميثاق المشروع')
	}

	@When("I want to go to approved idea details page")
	def goToApprovedIdeaDetailsPage(){
		WebUI.click(findTestObject('OOBObjects/ApprovedIdeasListObjects/FirstApprovedIdeaName'))
	}

	@When("I want to verify approved idea details page")
	def verifyApprovedIdeaDetailsPage(){
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/ApprovedIdeaInformation'), 0)
	}

	@When("I want to verify idea details page")
	def verifyIdeaNameLink(){
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/IdeaNameInIdeasList'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/IdeaDetailsSection'),0)
	}

	@When("I want to wait for page load with refresh")
	def waitForPgaeLoadWithRefresh() {
		WebUI.waitForPageLoad(20)
		WebUI.refresh()
	}

	@When("I want to wait for page load")
	def waitForPgaeLoad() {
		WebUI.waitForPageLoad(20)
	}

	@When("I want to go to Homepage")
	def goToHomePage() {
		WebUI.focus(findTestObject('OOB-Objects/HomePage'))
		WebUI.mouseOver(findTestObject('OOB-Objects/HomePage'))
		WebUI.click(findTestObject('OOB-Objects/HomePage'))
	}

	@When("I want to click on Add New button")
	def clickAddNewIdea() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/AddNewIdeaButton'))
	}


	@When('I want to click on Hide optional fields link')
	def clickHideOptionalFieldsLink(){
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/HideOptionalFields'))
	}

	@When('I want to click on Show optional fields link')
	def clickShowOptionalFieldsLink(){
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/HomePage-Breadcrumb'), 0)
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/ShowOptionalFields'))
	}

	@Then('I want to verify optional fields disappear')
	def optionalFieldsDisappear(){
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)
		WebUI.verifyElementNotVisible(findTestObject('OOBObjects/IdeasListObjects/Notes-Field'))
	}

	@Then('I want to verify optional fields appear')
	def optionalFieldsAppear(){
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)
		WebUI.verifyElementVisible(findTestObject('OOBObjects/IdeasListObjects/Notes-Field'))
	}


	// idea name variable

	int RN = ((Math.random() * 10000) as int)

	String ideaName = 'Automation' + RN

	@When("I want to fill idea name field")
	def fillIdeaNameField() {
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Idea-Name-Field'), ideaName)
	}

	//Start date greater than End date
	@When("I want to select start date greater than end date")
	def startDateGreaterThanEndDate() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-Start-date-Check-Box'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Excepted-Start-Date'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/IdeasListObjects/StartDateMonthDropDwon'), 7)
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/Day26'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Day26'))
		WebUI.waitForElementVisible(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-End-Date-Check-Box'), 6)
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-End-Date-Check-Box'))
		WebUI.delay(5)
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/Excpected-End-Date'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Excpected-End-Date'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/IdeasListObjects/EndDateMonthDropdown'), 4)
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/EndDateDay15'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/EndDateDay15'))
	}

	//click on expected end date
	@When('i want to click on expected end date')
	def clickExpectedEndDate(){
		WebUI.click(findTestObject('PMO-Objects/Page_Add New Project Request/Excpected-End-Date'))
	}


	@When("I want to select expected start date")
	def selectStartDate() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects//GREGORIAN-Start-date-Check-Box'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects//Excepted-Start-Date'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/IdeasListObjects/StartDateMonthDropDwon'), 5)
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects//Day26'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects//Day26'))
	}

	@When("I want to select expected end date")
	def selectEndDate() {
		WebUI.waitForElementVisible(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-End-Date-Check-Box'), 6)
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/GREGORIAN-End-Date-Check-Box'))
		WebUI.delay(2)
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/Excpected-End-Date'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Excpected-End-Date'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/IdeasListObjects/EndDateMonthDropdown'), 6)
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/EndDateDay15'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/EndDateDay15'))
	}


	@When("I want to check duration field filled automatically")
	def checkDurationField() {
		WebUI.verifyNotEqual(WebUI.getText(findTestObject('OOBObjects/IdeasListObjects/IdeaDurationField')), null)
	}

	@When("I want to fill idea objective field")
	def fillObjectiveField() {
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Idea-Objective-Field'), 'Automation')
	}

	@When("I want to fill expected budget field")
	def fillBudgetField() {
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Expected-Budget-Field'), '10000')
	}

	@When("I want to fill Notes field")
	def fillNotesField() {
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Notes-Field'), 'test note')
	}

	@When("I want to add Attachment")
	def uploadAttachment() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/AttachmentNameField'), 'test1')
		WebUI.uploadFile(findTestObject('OOBObjects/IdeasListObjects/Upload-File'), 'C:\\Users\\HP\\Desktop\\download.png')
		WebUI.waitForElementPresent(findTestObject('OOBObjects/IdeasListObjects/AttachedFile'), 0)
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/LoadButton'))
	}

	@When("I want to add large file as Attachment")
	def uploadLargeAttachment() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/AttachmentNameField'), 'test1')
		WebUI.uploadFile(findTestObject('OOBObjects/IdeasListObjects/Upload-File'), 'C:\\Users\\HP\\Desktop\\Automation book Mitsubishi.pdf')
	}


	@When("I want to add invalid format Attachment")
	def uploadInvalidFormatAttachment() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/AttachmentNameField'), 'Test Attachment')
		WebUI.uploadFile(findTestObject('OOBObjects/IdeasListObjects/Upload-File'), 'C:\\Users\\HP\\Desktop\\chromedriver.exe')
	}

	@When('I want to click Add New Doc button')
	def clickAddNewDocButton(){
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'))
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)
	}

	@When('I want to click Load button')
	def clickLoadButton(){
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/LoadButton'))
	}

	@Then("I want to verify Attachment not added")
	def verifyLargeAttachmentnotAdded() {
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/IdeasListObjects/AttachedFile'), 0)
	}

	@Then("I want to verify Attachment with already existed name not added")
	def verifyAttachmentWithAlreadyExistedNamenotAdded() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/IdeasListObjects/AttachmentNameField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to click send idea button")
	def clickSendIdea() {
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/CardBlock'), 0)
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/SendIdeaButton'))
	}


	@Then("I want to verify idea added successfuly")
	def verifyIdeaAdded() {
		WebUI.waitForPageLoad(0)
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/SearchResult'), ideaName)
	}

	@Then("I want to verify submitted idea cannot be deleted or edited")
	def checkSubmittedIdeaCantBeDeletedorEdited() {
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/IdeasListObjects/DeleteIdeaIcon'), 0)
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/IdeasListObjects/EditIdea'), 0)
	}

	@Then("I want to check submitted idea status is In Progress")
	def checkSubmittedIdeaStatusIsInProgress() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/IdeaStatus'),'قيد الاجراء')
	}



	@When("I want to approve idea")
	def approveIdeaProcess(){
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/InboxIcon'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/BeforeInitiatePhase'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/FirstIdea'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/ApproveIdeaButton'))

		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/BeforeInitiatePhase'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/FirstIdea'))
		WebUI.scrollToElement(findTestObject('OOBObjects/InboxPageObjects/AddNewAttachmentButtonApproveIdea'), 0)
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/AddNewAttachmentButtonApproveIdea'))
		WebUI.uploadFile(findTestObject('OOBObjects/InboxPageObjects/UploadFileApproveIdea'), 'C:\\Users\\HP\\Desktop\\SK.png')
		WebUI.waitForElementPresent(findTestObject('OOBObjects/InboxPageObjects/AttachedFileApprovedIdea'), 0)
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/LoadButtonApproveIdea'))
		WebUI.verifyElementClickable(findTestObject('OOBObjects/InboxPageObjects/SendAproveIdeaSecondPhase'))
		WebUI.mouseOver(findTestObject('OOBObjects/InboxPageObjects/SendAproveIdeaSecondPhase'))
		WebUI.delay(5)
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/SendAproveIdeaSecondPhase'))


		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/BeforeInitiatePhase'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/FirstIdea'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/StrategicObjectiveCheckBox'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/InboxPageObjects/ddlInitiativesDropdwon'), 1)
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/SendApproveIdeaThirdPhase'))


		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/BeforeInitiatePhase'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/FirstIdea'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/InboxPageObjects/WalletDropdownApproveIdea'), 1)
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/InboxPageObjects/ProgramDropdownApproveIdea'), 1)
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/InboxPageObjects/OwnerDropdownApproveIdea'), 1)
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/SendApproveIdeaFourthPhase'))


		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/BeforeInitiatePhase'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/FirstIdea'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/ApproveButtonFivthPhase'))


		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/BeforeInitiatePhase'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/FirstIdea'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/GeorgianCheckBoxApproveIdea'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/ExceptedExecutionDateApproveIdea'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/InboxPageObjects/MonthsDropdownApproveIdea'), 3)
		WebUI.mouseOver(findTestObject('OOBObjects/InboxPageObjects/Day30ApproveIdeaExcutionDate'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/Day30ApproveIdeaExcutionDate'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/InboxPageObjects/PriorityDropdownApproveIdea'), 1)
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/SubmitButtonApproveIdae'))
	}


	@Then("I want to check submitted idea sent to PMO office for approval")
	def checkSubmittedIdeaSentToPMO() {
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/InboxIcon'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/BeforeInitiatePhase'))
		WebUI.verifyElementText(findTestObject('OOBObjects/InboxPageObjects/IdeaPhase'), 'مكتب إدارة المشاريع')
	}

	@Then("I want to open created idea from Inbox")
	def openIdeaFromInbox() {
		WebUI.click(findTestObject('PMO-Objects/InboxPage/BeforeInitiateObjects/IdeaNameFromInbox'))
	}

	@Then("I want to click approve idea button")
	def approveIdea() {
		WebUI.click(findTestObject('PMO-Objects/InboxPage/BeforeInitiateObjects/ApproveIdeaButton'))
	}

	@When("I want to click Cancel idea button")
	def clickCancelIdea() {
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/CancelIdeaButton'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/CancelIdeaButton'))
	}

	@When("I want to click save idea button")
	def clickSaveIdea() {
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/SaveIdeaButton'), 0)
		WebUI.waitForElementClickable(findTestObject('OOBObjects/IdeasListObjects/SaveIdeaButton'), 0)
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/SaveIdeaButton'))
		WebUI.delay(5)

	}

	@When("I want to check idea not created")
	def checkCancelation() {
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/SearchResult'), 'لم يُعثر على أية سجلات')
	}

	@When("I want to search for idea by idea name")
	def searchOnSavedIdea() {
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/SearchResult'), ideaName)
	}

	@When("I want to check idea name is a mandatory field")
	def ideaNameMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/IdeasListObjects/IdeaNameMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check start date is a mandatory field")
	def startDateMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/IdeasListObjects/StartDateMandatory'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check end date is a mandatory field")
	def endDateMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/IdeasListObjects/EndDateMandatory'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check idea objective is a mandatory field")
	def ObjectiveMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/IdeasListObjects/ObjectiveMandatory'), FailureHandling.STOP_ON_FAILURE)
	}


	@When("I want to click on edit idea icon")
	def clickEditIdea() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/EditIdea'))
	}


	@When("I want to edit idea name")
	def editIdeaName() {
		WebUI.clearText(findTestObject('OOBObjects/IdeasListObjects/Idea-Name-Field'))
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/Idea-Name-Field'), 'Updated ' + ideaName)

	}

	@When("I want to search on updated idea")
	def searchOnUpdatedIdea() {
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/SearchField'), 'Updated ' + ideaName)
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/SearchResult'), 'Updated ' + ideaName)
	}

	@When("I want to click on delete idea icon")
	def clickdeleteIdea() {
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/DeleteIdeaIcon'))
		WebUI.acceptAlert()
	}

	@Then("I want to check idea has been deleted")
	def checkIdeaDeleted() {
		WebUI.refresh()
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/SearchField'), ideaName)
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/SearchResult'), 'لم يُعثر على أية سجلات')
	}

	@When("I want to refresh page")
	def refresh() {
		WebUI.refresh()
	}

	@When("I want to delete attachment")
	def deleteAttachment() {
		WebUI.refresh()
		WebUI.scrollToElement(findTestObject('OOBObjects/IdeasListObjects/Add-New-Document-Button'), 0)
		WebUI.mouseOver(findTestObject('OOBObjects/IdeasListObjects/DeleteAttachment'))
		WebUI.click(findTestObject('OOBObjects/IdeasListObjects/DeleteAttachment'))
		WebUI.acceptAlert()
	}


	@Then("I want to verify document uploaded")
	def verifyDocumentUploaded() {
		WebUI.verifyElementPresent(findTestObject('OOBObjects/IdeasListObjects/UploadedDocument'), 0)
	}

	@Then("I want to verify document removed")
	def verifyDocumentRemoved() {
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/IdeasListObjects/UploadedDocument'), 0)
	}

	@Then("I want to check large file error message")
	def checkLargeFileErrorMessage() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'حجم الملف اكبر من المسموح به, أقصى حجم 2.0MB.')
	}

	@Then("I want to check start date greater than end date error message")
	def checkStartDateGreaterThanEndDateErrorMessage() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'تاريخ النهاية يجب ان يكون اكبر من تاريخ البداية')
	}

	@Then("I want to check choose file error message")
	def checkChooseFileErrorMessage() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'اختر ملف')
	}

	@Then("I want to check invalid file format error message")
	def checkInvalidFileErrorMessage() {
		//WebUI.verifyElementPresent(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 0)
		//WebUI.verifyElementText(findTestObject('PMO-Objects/Page_Add New Project Request/ErrorMessage'), 'صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.')
		WebUI.verifyTextPresent('صيغة الملف غير مسموح بها. الصيغ المسموح بها :  png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.',
				false)
	}

	@When('I want to go to Inbox')
	def goToInbox(){
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/InboxIcon'))
	}

	@Then("I want to verify request sent to PM to fill charter")
	def verifyRequestSentToPMToFillCharter(){
		WebUI.verifyElementText(findTestObject('OOBObjects/InboxPageObjects/FirstIdea'), ideaName)
	}

	@Then("I want to search for excuted approved idea by name")
	def searchForProjectByName() {
		WebUI.waitForPageLoad(10)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'))
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'),ideaName)
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/FirstProjectName'), ideaName)
	}

}
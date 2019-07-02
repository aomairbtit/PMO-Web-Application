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
import org.openqa.selenium.Keys as Keys

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


class AddProjectSteps {

	@When("I want to go to projects list")
	def clickProjectsList(){
		WebUI.delay(4)
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/ProjectsList'))
	}

	@When("I want to verify project list page")
	def verifyProjectListPage(){
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectsListTitle'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectCodeColumn'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameColumn'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectStatusColumn'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectStageColumn'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ActionsColumn'), 0)
	}


	@When("I want to click Add new project button")
	def clickAddNewProjectButton(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/AddNewProject'))
	}

	// project name variable

	int RN = ((Math.random() * 10000) as int)

	String projectName = 'Automation Project' + RN


	@When("I want to fill project name")
	def fillProjectName(){
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameField'), projectName)
	}

	@When("I want to fill project name field with already existed name")
	def fillProjectNameWithAlreadyExistedName(){
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameField'), 'Automation Project')
	}


	@Then("I want to check duplicate name error message")
	def checkDuplicateNameErrorMessage() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'لا يجب تكرار اسم المشروع')
	}

	@When("I want to fill project name field with name that contains specail characters")
	def fillProjectNameWithSepcialCharacters(){
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameField'), 'special $ character')
	}

	@Then("I want to check special characters error message")
	def checkSpecialCharactersErrorMessage() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'يجب ان لا يحتوي الاسم على الرموز الخاصة')
	}

	@Then("I want to verify add new project form")
	def verifyAddNewProjectForm(){
		//Verify project type field
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeField'),0)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeField'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeDropDwon'),0)

		//Verify project name
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameField'),0)

		//Verify Start date
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectStartDateField'),0)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectStartDateField'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/Strat-EndDateCalender'),0)

		//Verify End date
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectEndDateField'),0)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectEndDateField'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/Strat-EndDateCalender'),0)

		//Verify project duration field
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectDurationField'),0)

		//Verify project owner department section
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/OwnerDepartmentSection'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/OwnerDepartmentSection'),0)

		//Verify project manager field
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectMangerField'),0)

		//Verify Project Owner Field
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectOwnerField'),0)

		//Verify Project sponsor Field
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectSponsorField'),0)


		//Verify Initiatives Section
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/NTP1InitiativesSection'),0)

		//Verify Project program section
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectProgramSection'),0)

		//Verify Project wallet section
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectWalletSection'),0)

		//Verify Project Project Description Field
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectDescriptionField'),0)

		//Verify Project Project Notes Field
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectNotesField'),0)

		//Verify Project documents section
		WebUI.verifyElementPresent(findTestObject('Object Repository/OOBObjects/ProjectsListObjects/DocumentsSection'),0)


	}

	@Then("I want to verify budget field doesn't accept alphapet")
	def verifyBudgetField(){
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectExpectedBudget'), 'alpha')
		WebUI.verifyEqual(WebUI.getText(findTestObject('OOBObjects/ProjectsListObjects/ProjectExpectedBudget')), '')
	}

	@When("I want to verify im in add new project page")
	def verifyAddNewProjectPage() {
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ApprovedIdeasListObjects/AddNewProjectLabel'),0)
	}

	@When("I want to check already filled fields")
	def checkAlreadyFilledFields() {
		WebUI.verifyNotEqual(WebUI.getText(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameField')), null)
		WebUI.verifyNotEqual(WebUI.getText(findTestObject('OOBObjects/ProjectsListObjects/PlannedStartDate')), null)
		WebUI.verifyNotEqual(WebUI.getText(findTestObject('OOBObjects/ProjectsListObjects/PlannedEndDate')), null)
		WebUI.verifyNotEqual(WebUI.getText(findTestObject('OOBObjects/ProjectsListObjects/Duration')), null)
	}

	@When("I want to select project type")
	def selectProjectType() {
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeDropDwon'), 1)
	}

	@When("I want to verify project type list")
	def verifyProjectType() {
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeDropDwon'), 'داخلي', false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeDropDwon'), 'خارجي', false)
	}

	@When("I want to verify related strategic objective")
	def verifyRelatedStrategicObjective(){
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/OwnerDropdown'), 0)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/StrategicProjectCheckBox'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/InitiativesList'), 0)
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/ProjectsListObjects/InitiativesList'), 2)
	}

	@When("I want to verify portfolios list")
	def verifyPortfolioList(){
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/PortfoliosPage'))

		String firstPortfolio = WebUI.getAttribute(findTestObject('OOBObjects/ProjectsListObjects/FirstPortfolio'), 'text')
		String secondPortfolio = WebUI.getAttribute(findTestObject('OOBObjects/ProjectsListObjects/SecondPortfolio'), 'text')
		String thirdPortfolio = WebUI.getAttribute(findTestObject('OOBObjects/ProjectsListObjects/ThirdPortfolio'), 'text')
		String fourthPortfolio = WebUI.getAttribute(findTestObject('OOBObjects/ProjectsListObjects/FourthPortfolio'), 'text')
		String fifthPortfolio = WebUI.getAttribute(findTestObject('OOBObjects/ProjectsListObjects/FifthPortfolio'), 'text')

		WebUI.navigateToUrl('https://pmoadmin:P@ssw0rd@dev5.cloudapp.net/OOB2/')
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/ProjectsList'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/AddNewProject'))

		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/PortfolioList'), firstPortfolio, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/PortfolioList'), secondPortfolio, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/PortfolioList'), thirdPortfolio, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/PortfolioList'), fourthPortfolio, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/PortfolioList'), fifthPortfolio, false)
	}

	@When("I want to verify programs list")
	def verifyProgramsList(){
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/ProgramsList'))

		String firstProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/FirstProgram'), 'text')
		String secondProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/SecondProgram'), 'text')
		String thirdProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/ThirdProgram'), 'text')
		String fourthProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/FourthProgram'), 'text')
		String fifthProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/FifthProgram'), 'text')
		String sixthProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/SixthProgram'), 'text')
		String seventhProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/SeventhProgram'), 'text')
		String eighthProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/EighthProgram'), 'text')
		String ninthProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/NinthProgram'), 'text')
		String tenthProgram = WebUI.getAttribute(findTestObject('OOBObjects/ProgramsList/TenthProgram'), 'text')


		WebUI.navigateToUrl('https://pmoadmin:P@ssw0rd@dev5.cloudapp.net/OOB2/')
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/ProjectsList'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/AddNewProject'))

		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), firstProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), secondProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), thirdProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), fourthProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), fifthProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), sixthProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), seventhProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), eighthProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), ninthProgram, false)
		WebUI.selectOptionByLabel(findTestObject('OOBObjects/ProjectsListObjects/ProgramList'), tenthProgram, false)
	}

	@When("I want to select project expected start date")
	def selectProjectStartDate() {
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/GREGORIANStartDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/PlannedStartDate'))
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/DayThirtyStartDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/DayThirtyStartDate'))
	}


	@When("I want to select project expected end date")
	def selectProjectEndDate() {
		WebUI.waitForElementVisible(findTestObject('OOBObjects/ProjectsListObjects/GREGORIANEndDate'), 6)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/GREGORIANEndDate'))
		WebUI.delay(2)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/PlannedEndDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/PlannedEndDate'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/ProjectsListObjects/ProjectEndDateMonthDropDown'), 6)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/DayTwintyEndDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/DayTwintyEndDate'))
	}



	//Start date greater than End date
	@When("I want to select project start date greater than end date")
	def projectStartDateGreaterThanEndDate() {
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/GREGORIANStartDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/PlannedStartDate'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/ProjectsListObjects/ProjectStartDateMonthDropDown'), 7)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/DayThirtyStartDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/DayThirtyStartDate'))

		WebUI.waitForElementVisible(findTestObject('OOBObjects/ProjectsListObjects/GREGORIANEndDate'), 6)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/GREGORIANEndDate'))
		WebUI.delay(5)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/PlannedEndDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/PlannedEndDate'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/ProjectsListObjects/ProjectEndDateMonthDropDown'), 4)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/DayTwintyEndDate'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/DayTwintyEndDate'))
	}

	@When("I want to check project duration field filled automatically")
	def checkProjectDurationField() {
		WebUI.verifyNotEqual(WebUI.getText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDurationField')), null)
	}

	@When("I want to fill project budget")
	def fillProjectBudget(){
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectExpectedBudget'), '10000')
	}

	@When("I want to select from owner deopdown list")
	def fillSelectOwnerDropdown(){
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/ProjectsListObjects/OwnerDropdown'), 1)
	}

	@When("I want to fill project manager field")
	def fillProjectMangerField() {
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/Duration'), 0)
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectMangerField'), 'النظام')
		//WebUI.scrollToElement(findTestObject('OOB-Objects/AddNewProjectObjects/ProjectMangerField'), 0)
		//WebUI.click(findTestObject('OOB-Objects/AddNewProjectObjects/ProjectOwnerField'))
	}

	@When("I want to fill project manager field with user that is not existed")
	def fillProjectMangerFieldWithNotExistedUser() {
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/Duration'), 0)
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectMangerField'), 'Automation Test')
		//WebUI.scrollToElement(findTestObject('OOB-Objects/AddNewProjectObjects/ProjectMangerField'), 0)
		//WebUI.click(findTestObject('OOB-Objects/AddNewProjectObjects/ProjectOwnerField'))
	}

	@When("I want to fill project manager field with inactive user")
	def fillProjectMangerFieldWithInactiveUser() {
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/Duration'), 0)
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectMangerField'), 'Inactive User')
		//WebUI.scrollToElement(findTestObject('OOB-Objects/AddNewProjectObjects/ProjectMangerField'), 0)
		//WebUI.click(findTestObject('OOB-Objects/AddNewProjectObjects/ProjectOwnerField'))
	}

	@Then("I want to check user not found error message")
	def checkUserNotFoundErrorMessage() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'User not found')
	}

	@When("I want to tap enter key on manager field")
	def tapEnterKeyManger() {

		WebUI.sendKeys(findTestObject('OOBObjects/ProjectsListObjects/ProjectMangerField'), Keys.chord(Keys.ENTER))
	}

	@When("I want to fill project owner field")
	def fillProjectOwnerField() {
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectOwnerField'), 'النظام')
		//WebUI.click(findTestObject('OOB-Objects/AddNewProjectObjects/ProjectSponserField'))
	}


	@When("I want to tap enter key on owner field")
	def tapEnterKeyOwner() {

		WebUI.sendKeys(findTestObject('OOBObjects/ProjectsListObjects/ProjectOwnerField'), Keys.chord(Keys.ENTER))
	}

	@When("I want to fill project sponser field")
	def fillProjectSponserField() {
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectSponsorField'), 'النظام')
	}

	@When("I want to tap enter key on sponser field")
	def tapEnterKeySponser() {

		WebUI.sendKeys(findTestObject('OOBObjects/ProjectsListObjects/ProjectSponsorField'), Keys.chord(Keys.ENTER))
	}

	@When("I want to fill project description field")
	def fillProjectDescriptionField() {
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDescriptionField'), 'test description')
	}

	@When("I want to fill project notes field")
	def fillProjectNotesField() {
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectNotesField'), 'test notes')
	}

	@When("I want to add attachment for the project")
	def addProjectAttachment(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectAddNewDocumentButton'))
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/ProjectAddNewDocumentButton'), 0)
		//WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/AttachmentNameField'), 'test1')
		WebUI.uploadFile(findTestObject('OOBObjects/ProjectsListObjects/ProjectUploadFile'), 'C:\\Users\\HP\\Desktop\\download.png')
		WebUI.waitForElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectAttachedFile'), 0)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectLoadButton'))
	}

	@When("I want to add large file as project attachment")
	def uploadLargeProjectAttachment() {
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectAddNewDocumentButton'))
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/ProjectAddNewDocumentButton'), 0)
		WebUI.setText(findTestObject('OOBObjects/IdeasListObjects/AttachmentNameField'), 'test1')
		WebUI.uploadFile(findTestObject('OOBObjects/ProjectsListObjects/ProjectUploadFile'), 'C:\\Users\\HP\\Desktop\\Automation book Mitsubishi.pdf')
	}

	@Then("I want to verify Project Attachment not added")
	def verifyLargeProjectAttachmentnotAdded() {
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectAttachedFile'), 0)
	}

	@When("I want to delete project attachment")
	def deleteProjectAttachment(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/DeleteProjectAttcehment'))
		WebUI.acceptAlert()
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectAttachedFile'), 0)
	}

	@Then("I want to verify user not able to add project attachment with already existed name")
	def verifyProjectAttachmentWithAlreadyExistedNamenotAdded() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectAttachedFileName'), FailureHandling.STOP_ON_FAILURE)
	}



	@When("I want to wait")
	def waitForSeconds() {
		WebUI.delay(3)
	}


	@When("I want to check im in projects list page")
	def checkProjectsListPage() {
		WebUI.delay(45)
		WebUI.waitForElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectsListTitle'), 20)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectsListTitle'),0)
	}

	@When("I want to click on send project button")
	def clickSendProject() {
		WebUI.delay(5)
		WebUI.waitForPageLoad(10)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/SendProjectButton'))
	}

	@When("I want to click on save project button")
	def clickSaveProject() {
		WebUI.delay(5)
		WebUI.waitForPageLoad(10)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/SaveProjectButton'))
	}

	@When("I want to click on cancel creating new project button")
	def clickCancelProject() {
		WebUI.delay(5)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/CancelAddingNewProject'))
	}

	@When("I want to go to initiation")
	def goToInitiation(){
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/Initiation'))
	}

	@Then("I want to search for created project by name")
	def searchForProjectByName() {
		WebUI.waitForPageLoad(10)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'))
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'),projectName)
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/FirstProjectName'), projectName)
	}


	@Then("I want to verify project page")
	def verifyProjectPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameLink'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectInScopeList'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectOutScope'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectGoalsList'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ExpectedOutcomesList'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectDependenciesList'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectRisks'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectConstraintList'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectAssumptionList'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectStakeholders List'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectDocuments'), 0)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectMenue'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/EditActionFromMenue'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/HoldActionFromMenue'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/CancelActionFromMenue'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectActionsRecordFromMenue'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/ProjectDocumentsFromMenue'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/SupportFomMenue'), 0)
	}

	@When("I want to view project page")
	def viewProjectPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameLink'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/SupportFomMenue'), 0)	
	}
	
	@When("I want to fill in scope list")
	def fillInScope(){
		WebUI.click(findTestObject('OOBObjects/CharterFields/InScopeAddNewButton'))
		WebUI.setText(findTestObject('OOBObjects/CharterFields/InScopeField'), 'Automation Test')
		WebUI.delay(3)
		WebUI.click(findTestObject('OOBObjects/CharterFields/InScopeSave'))
	}
	
	@When("I want to fill out of scope list")
	def fillOutOfScope(){
		WebUI.click(findTestObject('OOBObjects/CharterFields/OutOfScopeAddNewButton'))
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/OutOfScopeCancel'), 0)
		WebUI.setText(findTestObject('OOBObjects/CharterFields/OutOfScopeField'), 'Automation Test')
		WebUI.click(findTestObject('OOBObjects/CharterFields/OutOfScopeSave'))
	}
	
	
	@When("I want to fill goals list")
	def fillGoals(){
		//WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/GoalsAddNewButton'), 0)
		WebUI.click(findTestObject('OOBObjects/CharterFields/GoalsAddNewButton'))
		WebUI.setText(findTestObject('OOBObjects/CharterFields/ObjectiveBenefitField'), 'Automation Test')
		WebUI.setText(findTestObject('OOBObjects/CharterFields/VerificationMeasurementField'), 'Automation Test')
		WebUI.click(findTestObject('OOBObjects/CharterFields/GoalsSave'))
	}
	
	
	@When("I want to fill outcomes list")
	def fillOutComes(){
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/GoalsAddNewButton'), 0)
		
		WebUI.click(findTestObject('OOBObjects/CharterFields/OutComesAddNew'))
		WebUI.setText(findTestObject('OOBObjects/CharterFields/OutComeNameField'), 'Automation Test')
		WebUI.click(findTestObject('OOBObjects/CharterFields/OutComesGREGORIAN'))
		WebUI.click(findTestObject('OOBObjects/CharterFields/OutComeDeliveryDate'))
		WebUI.mouseOver(findTestObject('OOBObjects/CharterFields/OutComesDate'))
		WebUI.click(findTestObject('OOBObjects/CharterFields/OutComesDate'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/CharterFields/OutComesPhaseDropDown'), 3)
		WebUI.click(findTestObject('OOBObjects/CharterFields/OutComesSave'))
	}
	
	@When("I want to fill Dependencies list")
	def fillDependencies(){
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/OutComesAddNew'), 0)
		WebUI.click(findTestObject('OOBObjects/CharterFields/DependenciesAddNewButton'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/CharterFields/DependenciesProjectNameDropDown'), 3)
		//WebUI.setText(findTestObject('OOBObjects/CharterFields/DependenciesOthersField'), 'Automation Test')
		WebUI.setText(findTestObject('OOBObjects/CharterFields/DependenciesRelationDescriptionField'), 'Automation Test')
		WebUI.click(findTestObject('OOBObjects/CharterFields/DependenciesSave'))
	}
	
	@When("I want to fill Risks list")
	def fillRisks(){
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/DependenciesAddNewButton'), 0)
		WebUI.click(findTestObject('OOBObjects/CharterFields/RisksAddNew'))
		WebUI.setText(findTestObject('OOBObjects/CharterFields/RiskField'), 'Automation Test')
		WebUI.setText(findTestObject('OOBObjects/CharterFields/RiskMethodOfHandlingField'), 'Automation Test')
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/CharterFields/RiskImpactDropdown'), 3)
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/CharterFields/RiskProbabilityDropdwon'), 3)
		WebUI.click(findTestObject('OOBObjects/CharterFields/RiskSave'))
	}
	
	@When("I want to fill Constraints list")
	def fillConstraints(){
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/RisksAddNew'), 0)
		WebUI.click(findTestObject('OOBObjects/CharterFields/ConstraintAddNewButton'))
		WebUI.setText(findTestObject('OOBObjects/CharterFields/ConstraintNameFiled'), 'Automation Test')
		WebUI.click(findTestObject('OOBObjects/CharterFields/ConstraintSave'))
	}
	
	@When("I want to fill Assumptions list")
	def fillAssumptions(){
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/ConstraintAddNewButton'), 0)
		WebUI.click(findTestObject('OOBObjects/CharterFields/AssumptionsAddNewButton'))
		WebUI.setText(findTestObject('OOBObjects/CharterFields/AssumptionNameField'), 'Automation Test')
		WebUI.click(findTestObject('OOBObjects/CharterFields/AssumptionSave'))
	}
	
	@When("I want to fill stakehholders list")
	def fillStakehholders(){
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/AssumptionsAddNewButton'), 0)
		WebUI.click(findTestObject('OOBObjects/CharterFields/StakeholdersAddNewButton'))
		WebUI.setText(findTestObject('OOBObjects/CharterFields/StakeholdersNameFields'), 'Automation Test')
		WebUI.setText(findTestObject('OOBObjects/CharterFields/StakeholdersPartnerType'), 'Automation Test')
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/StakeholdersPartnerType'), 0)
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/CharterFields/StakeholdersEntityTypeDropdown'), 1)
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/CharterFields/StakeholdersEntityDropdown'), 1)
		WebUI.click(findTestObject('OOBObjects/CharterFields/StakeholdersSave'))
	}
	
	@When("I want to fill documents list")
	def fillDocuments(){
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/StakeholdersAddNewButton'), 0)
		//WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/DocumentsAddNew'), 0)
		WebUI.click(findTestObject('OOBObjects/CharterFields/DocumentsAddNew'))
		WebUI.uploadFile(findTestObject('OOBObjects/CharterFields/DocumentsUploadFile'), 'C:\\Users\\HP\\Desktop\\download.png')
		WebUI.waitForElementPresent(findTestObject('OOBObjects/CharterFields/DocumentsUploadedFile'), 3)
		WebUI.click(findTestObject('OOBObjects/CharterFields/DocumentsLoadButton'))
	}
	
	@When("I want to click save charter button")
	def clickSaveCharter(){
		WebUI.delay(4)
		WebUI.click(findTestObject('OOBObjects/CharterFields/CharterSaveButton'))
	}
	
	@When("I want to click cancel button from charter page")
	def clickCancelCharter(){
		WebUI.delay(4)
		WebUI.click(findTestObject('OOBObjects/CharterFields/CharterCancelButton'))
	}
	
	@When("I want to check charter data not updated after clicking cancel")
	def CheckCancelCharter(){
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/CharterFields/InscopeEditDeleteSection'), 0)
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/OutOfScopeAddNewButton'), 0)
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/CharterFields/OutComesEditDeleteSection'), 0)
	}
	
	@When("I want to check fill all required fields error message")
	def checkFillAllRequiredFieldsErrorMessage(){
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), "يجب استكمال جميع الحقول")
	}
	
	@When("I want to check charter data saved")
	def checkCharterDataSaved(){
		WebUI.delay(4)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'))
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'),projectName)
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/FirstProjectName'), projectName)
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/FirstProjectName'))
		
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/InscopeEditDeleteSection'), 0)
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/OutOfScopeAddNewButton'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/OutComesEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/GoalsAddNewButton'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/GoalsEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/OutComesAddNew'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/OutComesEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/DependenciesAddNewButton'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/DependenciesEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/RisksAddNew'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/RisksEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/ConstraintAddNewButton'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/ConstraintsEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/AssumptionsAddNewButton'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/AssumptionsEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/StakeholdersAddNewButton'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/StakeholdersEditDeleteSection'), 0)
		
		WebUI.scrollToElement(findTestObject('OOBObjects/CharterFields/DocumentsAddNew'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/CharterFields/DocumentsAddedFile'), 0)
		
		
		}
	
	@When("I want to verify project charter page")
	def verifyProjectCharter(){
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/ProjectCharterTitle'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/ProjectInScopeList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/OutofWorkScopeList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/ProjectGoalsList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/ExpectedOutcomesList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/DependenciesList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/Risks'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/ConstraintList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/AssumptionList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/StakeholdersList'))
		WebUI.click(findTestObject('OOBObjects/ProjectCharterPage/Documents'))
	}

	@When("I want to verify documents page")
	def verifyDocumentsPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectMenue'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectDocumentsFromMenue'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/DocumentsPageTitle'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/AddDocumentFromDocumentsPage'), 0)
	}
	
	@When("I want to go to project support page")
	def goToProjectSupportPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectMenue'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/SupportFomMenue'))
		//WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/DocumentsPageTitle'), 0)
		//WebUI.verifyElementPresent(findTestObject('OOBObjects/ProjectsListObjects/AddDocumentFromDocumentsPage'), 0)
	}
	
	@When("I want to verify project support page")
	def verifyProjectSupportPage(){
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/SupportPageTitel'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/SupportTable'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/Subject'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/SupportNote'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/Sender'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/CreatedDate'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/LastActionDate'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/Status'), 0)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/Actions'), 0)
	}
	
	@When("I want to save support")
	def saveSupport(){
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/AddSupportButton'))
		WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportSubjectField'), 'Automation support')
		WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportNotesField'), 'Automation support note')
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/SaveButton'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/EditSupportIcon'), 0)
	}

	@When("I want to submit support")
	def submitSupport(){
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/AddSupportButton'))
		WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportSubjectField'), 'Automation support')
		WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportNotesField'), 'Automation support note')
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/SendButton'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/PageOne'), 0)
	}
	
	@When("I want to view support details")
	def viewSupport(){
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/AddedSupportName'))
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/SenderFromDetails'), 0)
		WebUI.verifyElementText(findTestObject('OOBObjects/SupportPageObjects/SenderValue'), 'النظام')
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/SubjectFromDetails'), 0)
		WebUI.verifyElementText(findTestObject('OOBObjects/SupportPageObjects/SubjectValue'), 'Automation support')
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/RelatedProjectFromDetails'), 0)
		WebUI.verifyElementText(findTestObject('OOBObjects/SupportPageObjects/RelatedProjectValue'), projectName)
		WebUI.verifyElementPresent(findTestObject('OOBObjects/SupportPageObjects/NotesFromDetails'), 0)
		WebUI.verifyElementText(findTestObject('OOBObjects/SupportPageObjects/NotesValue'), 'Automation support note')
	}
	
	@When("I want to update support")
	def updateSupport(){
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/EditSupportIcon'))
		WebUI.clearText(findTestObject('OOBObjects/SupportPageObjects/SupportSubjectField'))
		//WebUI.clearText(findTestObject('OOBObjects/SupportPageObjects/SupportNotesField'))
		WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportSubjectField'), 'Updated Automation support')
		WebUI.delay(3)
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/SaveUpdateButton'))
		WebUI.verifyElementText(findTestObject('OOBObjects/SupportPageObjects/AddedSupportName'), 'Updated Automation support')
		//WebUI.setText(findTestObject('OOBObjects/SupportPageObjects/SupportNotesField'), 'Automation support note')
	}

	@When("I want to delete support")
	def deleteSupport(){
		WebUI.click(findTestObject('OOBObjects/SupportPageObjects/DeleteSupportIcon'))
		WebUI.acceptAlert()
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/SupportPageObjects/EditSupportIcon'), 0)
	}
	
	@When("I want to add documment frome documents page")
	def addDocumentFromDocumentsPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/AddDocumentFromDocumentsPage'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/DocumnetsPageObjects/PhaseAddDocumentPage'), 2)
		WebUI.uploadFile(findTestObject('OOBObjects/DocumnetsPageObjects/UploadFile'), 'C:\\Users\\HP\\Desktop\\SK.png')
		WebUI.waitForElementPresent(findTestObject('OOBObjects/DocumnetsPageObjects/UploadedFile'), 0)
		WebUI.click(findTestObject('OOBObjects/DocumnetsPageObjects/LoadButton'))
		WebUI.delay(4)
		WebUI.click(findTestObject('OOBObjects/DocumnetsPageObjects/CancelAddDocumentPage'))
	}
	
	
	@When("I want to add already existed documment frome documents page")
	def addAlreadyExistedDocumentFromDocumentsPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/AddDocumentFromDocumentsPage'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/DocumnetsPageObjects/PhaseAddDocumentPage'), 2)
		WebUI.uploadFile(findTestObject('OOBObjects/DocumnetsPageObjects/UploadFile'), 'C:\\Users\\HP\\Desktop\\SK.png')
		WebUI.waitForElementPresent(findTestObject('OOBObjects/DocumnetsPageObjects/UploadedFile'), 0)
		WebUI.click(findTestObject('OOBObjects/DocumnetsPageObjects/LoadButton'))
	}
	
	@Then("I want to verify already existed  Attachment not added and check error message")
	def verifyExistedAttachmentnotAdded() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'اسم الملف مكرر')
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/DocumnetsPageObjects/UploadedFile'), 0)
	}
	
	@When("I want to add invalid format Attachment from documents page")
	def uploadInvalidFormatAttachmentDocPage() {
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/AddDocumentFromDocumentsPage'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/DocumnetsPageObjects/PhaseAddDocumentPage'), 2)
		WebUI.uploadFile(findTestObject('OOBObjects/IdeasListObjects/Upload-File'), 'C:\\Users\\HP\\Desktop\\chromedriver.exe')
	}

	
	@When("I want to add large documment from documents page")
	def addLargeDocumentFromDocumentsPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/AddDocumentFromDocumentsPage'))
		WebUI.selectOptionByIndex(findTestObject('OOBObjects/DocumnetsPageObjects/PhaseAddDocumentPage'), 2)
		WebUI.uploadFile(findTestObject('OOBObjects/DocumnetsPageObjects/UploadFile'), 'C:\\Users\\HP\\Desktop\\LargeAttachmentFile.pdf')
	}
	
	@Then("I want to verify large Attachment not added and check error message")
	def verifyLargeAttachmentnotAdded() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'حجم الملف اكبر من المسموح به, أقصى حجم 2.0MB.')
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/DocumnetsPageObjects/UploadedFile'), 0)
	}
	
	@Then("I want to verify invalid Attachment not added and check error message")
	def verifyInvalidAttachmentnotAdded() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'صيغة الملف غير مسموح بها. الصيغ المسموح بها : png, pdf, jpeg, xls, xlsx, ppt, pptx, doc, docx.')
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/DocumnetsPageObjects/UploadedFile'), 0)
	}
	
	@When("I want to delete documment frome documents page")
	def deleteDocumentFromDocumentsPage(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectMenue'))
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectDocumentsFromMenue'))
		WebUI.click(findTestObject('OOBObjects/DocumnetsPageObjects/DeleteDocumentIcon'))
		WebUI.acceptAlert()
		WebUI.delay(5)
		WebUI.verifyElementNotPresent(findTestObject('OOBObjects/DocumnetsPageObjects/DeleteDocumentIcon'), 0)
	}

	@Then("I want to verify project details")
	def verifyProjectDetails(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectDetailsButton'))
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectNameProjectDetails'), 'اسم المشروع')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectCodeProjectDetails'), 'رمز المشروع')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ExpectedBudgetProjectDetails'), 'الميزانية المتوقعة')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/StartDateProjectDetails'), 'تاريخ بدء المشروع')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectEndDateProjectDetails'),'تاريخ نهاية المشروع')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectDurationProjectDeatils'), 'مدة المشروع (يوم)')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/EntityProjectDetails'), 'الجهة المالكة')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProgramProjectDetails'), 'البرنامج')
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/Portfolio'), 0)
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/Portfolio'), 'المحفظة')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectTypeProjectDetails'), 'نوع المشروع')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/InitiativesProjectDetails'), 'مبادرات التحول الوطني')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/LastPublishDateProjectDetails'), 'تاريخ اخر تعديل')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/StartDateScheduleProjectDetails'), 'تاريخ البدء - الجدول الزمني')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/EndDateScheduleProjectDetails'), 'تاريخ الإنتهاء - الجدول الزمني')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/BaselineStartDateScheduleProjectDetails'), 'تاريخ البدء الأساس - الجدول الزمني')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/BaselineEndDateScheduleProjectDetails'), 'تاريخ الإنتهاء الأساس - الجدول الزمني')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectDescriptionProjectDetails'), 'وصف المشروع')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectManagerProjectDetails'), 'مدير المشروع')
		WebUI.scrollToElement(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectOwnerProjectDetails'), 0)
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectOwnerProjectDetails'), 'مالك المشروع')
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/ProjectDetails/ProjectSponserProjectDetails'), 'راعي المشروع')
	}

	@When("I want to delete dradt project")
	def deleteDraftProject(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/DeleteDraftProject'))
	}

	@Then("I want to check project has been deleted")
	def checkProjectDeleted() {
		WebUI.refresh()
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'), projectName)
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/SearchResult'), 'لم يُعثر على أية سجلات')
	}

	@Then("I want to search for updated project by name")
	def searchForUpdatedProjectByName() {
		WebUI.waitForPageLoad(10)
		WebUI.mouseOver(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'))
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectSearchField'),'Updated ' + projectName)
		WebUI.verifyElementText(findTestObject('OOBObjects/ProjectsListObjects/FirstProjectName'), 'Updated ' +projectName)
	}


	@When("I want to edit draft project name")
	def editProjectName() {
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameLink'))
		WebUI.clearText(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameField'))
		WebUI.setText(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameField'), 'Updated ' + projectName)
	}


	@When("I want to submit saved project")
	def submitSavedProject(){
		WebUI.click(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameLink'))
	}

	@Then("I want to check submitted project is at the workflow")
	def checkSubmittedProjectWorkflow() {
		WebUI.click(findTestObject('OOBObjects/HomepageObjects/InboxIcon'))
		WebUI.click(findTestObject('OOBObjects/InboxPageObjects/Initiation'))
		WebUI.verifyElementText(findTestObject('OOBObjects/InboxPageObjects/IdeaPhase'), 'مدير المشروع')
	}

	@When("I want to check project name is a mandatory field")
	def projectNameMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectNameMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project type is a mandatory field")
	def projectTypeMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectTypeMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project start date is mandatory")
	def projectStartDateMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectStartDateMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project end date is mandatory")
	def projectEndDateMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectEndDateMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project budget is a mandatory field")
	def projectBudgetMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectBudgetMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project owner list is mandatory")
	def projectOwnerListMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectOwnerListMandatory'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project manager is a mandatory field")
	def projectManagerMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectManagerMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project owner is a mandatory field")
	def projectOwnerMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectOwnerMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project sponser is a mandatory field")
	def projectSponserMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectSponserMandatoryField'), FailureHandling.STOP_ON_FAILURE)
	}

	@When("I want to check project description is a mandatory field")
	def projectDescriptionMandatory() {
		WebUI.verifyElementVisible(findTestObject('OOBObjects/ProjectsListObjects/ProjectDescriptionMandatroyField'), FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I want to check mandatory fields error message")
	def checkMandatoryFieldsErrorMessage() {
		WebUI.verifyElementText(findTestObject('OOBObjects/IdeasListObjects/ErrorMessage'), 'الرجاء ادخال جميع الحقول الاجبارية')
	}

}
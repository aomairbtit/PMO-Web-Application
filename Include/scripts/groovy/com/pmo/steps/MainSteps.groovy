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


class MainSteps {

	@Given("I want to go to OOB and login")
	def OpenOOB(){
		WebUI.openBrowser('http://pmoadmin:P@ssw0rd@dev5.cloudapp.net/OOB2/')
	}

	@When("I want to maximize window")
	def maximizeWindow() {
		WebUI.maximizeWindow()
	}

	@Then("I verify I'm in OOB main page")
	def verifyLoginToOOB() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/OOB-Side-Bar'), 0)
	}

	@Then("I want to close browser")
	def closeBrowser() {
		WebUI.closeBrowser()
	}

	@When('I want to verify Dashboard presents')
	def verifyDashboardPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Dashboard'), 0)
	}
	
	@When('I want to verify Projects List presents')
	def verifyProjectsListPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Projects-List'), 0)
	}
	
	@When('I want to verify Strategy Center presents')
	def verifyStrategyCenterPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Strategy-Center'), 0)
	}
	
	@When('I want to verify Reports presents')
	def verifyReportsPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Reports'), 0)
	}
	
	@When('I want to verify Tasks presents')
	def verifyTasksPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Tasks'), 0)
	}
	
	@When('I want to verify Support presents')
	def verifySupportPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Support'), 0)
	}
	
	@When('I want to verify User Dropdwon presents')
	def verifyUserDropdwonPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/User-Dropdwon'), 0)
	}
	
	@When('I want to verify Notifications presents')
	def verifyNotificationsPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Notifications'), 0)
	}
	
	@When('I want to verify Settings presents')
	def verifySettingsPresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Settings'), 0)
	}
	
	@When('I want to verify Language presents')
	def verifyLanguagePresent() {
		WebUI.verifyElementPresent(findTestObject('OOB-Objects/Language'), 0)
	}
}
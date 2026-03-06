package com.sample.pages.curahealthcare

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sample.utils.WebUIUtil
import com.sample.webobjects.blazedemo.confirmationpage.ConfirmationPageObjects
import internal.GlobalVariable

public class ConfirmationPage {
	
	WebUIUtil ui = new WebUIUtil()
	ConfirmationPageObjects confirmationPageObjects = new ConfirmationPageObjects()

	def verifyAppointmentConfirmationHeader(TestObject object, int timeout) {
		ui.assertVisible(object, "Make Appointment")
	}
	
	def clickGoToHomepageButton(TestObject object, int timeout) {
		ui.click(object, "Go To Homepage Button", timeout)
	}
	
	def clickHamburgerIcon(TestObject object, int timeout) {
		ui.click(object, "Hamburger", timeout)
	}
	
	def selectHistory(TestObject object, int timeout) {
		ui.click(object, "History", timeout)
	}

	def confirmAppointment(int timeout = 10) {
		verifyAppointmentConfirmationHeader(confirmationPageObjects.headerConfirmation, timeout)
		ui.takeScreenshot()
		clickGoToHomepageButton(confirmationPageObjects.buttonGoToHomepage, timeout)
	}
	
	def navigateToHistory(int timeout = 10) {
		clickHamburgerIcon(confirmationPageObjects.iconHamburger, timeout)
		ui.takeScreenshot()
		selectHistory(confirmationPageObjects.optionHistory, timeout)
	}
}

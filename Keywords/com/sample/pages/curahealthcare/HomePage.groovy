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
import com.sample.webobjects.curahealthcare.homepage.HomePageObjects
import internal.GlobalVariable

public class HomePage {

	WebUIUtil ui = new WebUIUtil()
	HomePageObjects homePageObjects = new HomePageObjects()

	def verifyHomePageElements() {
		ui.assertVisible(homePageObjects.headerCuraHealthService, "Cura Healthcare Service Header")
		ui.assertVisible(homePageObjects.subtitleWeCareAboutYourHealth, "We Care About Your Health subtitle")
		ui.scrollTo(homePageObjects.footerCopyright, "Copyright © CURA Healthcare Service 2026 footer")
		ui.assertVisible(homePageObjects.footerCopyright, "Copyright © CURA Healthcare Service 2026 footer")
		ui.assertVisible(homePageObjects.buttonMakeAppointment, "Make Appointment Button")
		ui.scrollTo(homePageObjects.buttonMakeAppointment, "Make Appointment Button")
	}
	
	def clickMakeAppointmentButton(TestObject object, int timeout) {
		ui.click(object, "Make Appointment Button", timeout)
	}
	
	def performHomePageActions(int timeout = 10) {
		verifyHomePageElements()
		ui.takeScreenshot()
		clickMakeAppointmentButton(homePageObjects.buttonMakeAppointment, timeout)
	}
	
	def verifySuccessfulLogout() {
		ui.assertVisible(homePageObjects.headerCuraHealthService, "Cura Healthcare Service Header")
		ui.assertVisible(homePageObjects.subtitleWeCareAboutYourHealth, "We Care About Your Health subtitle")
		ui.scrollTo(homePageObjects.footerCopyright, "Copyright © CURA Healthcare Service 2026 footer")
		ui.assertVisible(homePageObjects.footerCopyright, "Copyright © CURA Healthcare Service 2026 footer")
		ui.assertVisible(homePageObjects.buttonMakeAppointment, "Make Appointment Button")
		ui.scrollTo(homePageObjects.buttonMakeAppointment, "Make Appointment Button")
		ui.takeScreenshot()
	}
	
}

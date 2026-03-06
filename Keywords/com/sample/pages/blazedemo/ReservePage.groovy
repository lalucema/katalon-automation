package com.sample.pages.blazedemo

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
import com.sample.webobjects.blazedemo.reservepage.ReservePageObjects
import internal.GlobalVariable

public class ReservePage {
	
	WebUIUtil ui = new WebUIUtil()
	ReservePageObjects reservePageObjects = new ReservePageObjects()

	def waitFlightID234() {
        ui.waitForElement(reservePageObjects.textFlightID234, "Flight ID 234")
    }
	
	 def clickChooseThisFlightButton(TestObject object, String logName, int timeout) {
        ui.click(object, logName, timeout)
    }
	
	def performReserveFlights(int timeout = 10) {
		waitFlightID234()
		ui.takeScreenshot()
		clickChooseThisFlightButton(reservePageObjects.buttonChooseThisFlight, "Choose This Flight Button", timeout)
	}
}
	

package com.sample.pages.blazedemo

import com.kms.katalon.core.testobject.TestObject
import com.sample.utils.WebUIUtil
import com.sample.webobjects.blazedemo.landingpage.LandingPageObjects

public class LandingPage {

	WebUIUtil ui = new WebUIUtil()
	LandingPageObjects landingPageObjects = new LandingPageObjects()

	def waitHeader() {
		ui.waitForElement(landingPageObjects.headerMain, "Main Header")
	}

	def selectCity(TestObject object, String cityName, int timeout) {
		ui.selectOption(object, "City Dropdown: ${cityName}", [value: cityName], timeout)
	}

	def clickFindFlightsButton(TestObject object, int timeout) {
		ui.click(object, "Find Flights Button", timeout)
	}

	def performSelectFlights(String departureCity, String destinationCity, int timeout = 10) {
		waitHeader()
		selectCity(landingPageObjects.selectDeparture, departureCity, timeout)
		selectCity(landingPageObjects.selectDestination, destinationCity, timeout)
		ui.takeScreenshot()
		clickFindFlightsButton(landingPageObjects.buttonFindFlights, timeout)
	}
}
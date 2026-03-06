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
import com.sample.webobjects.blazedemo.purchasepage.PurchasePageObjects
import internal.GlobalVariable

public class PurchasePage {
	
	WebUIUtil ui = new WebUIUtil()
	PurchasePageObjects purchasePageObjects = new PurchasePageObjects()
	
	def waitHeader() {
		ui.waitForElement(purchasePageObjects.headerFlightDetails, "Flight Details")
	}
	
	
	def clickPurchaseFlightButton(TestObject object, int timeout) {
		ui.click(object, "Purchase Flight Button", timeout)
	}
	
	def performPurchaseFlight(String name, String address, String city, String state, String zipCode, 
                          String cardType, String creditCardNumber, String month, String year, 
                          String nameOnCard, int timeout = 10) {
		waitHeader()
		ui.fill(purchasePageObjects.fieldName, name, "Name", timeout)
		ui.fill(purchasePageObjects.fieldAddress, address, "Address", timeout)
		ui.fill(purchasePageObjects.fieldCity, city, "City", timeout)
		ui.fill(purchasePageObjects.fieldState, state, "State", timeout)
		ui.fill(purchasePageObjects.fieldZipcode, zipCode, "Zipcode", timeout)
		ui.selectOption(purchasePageObjects.fieldCardType, "Card Type: ${cardType}", [label: cardType], timeout)
		ui.fill(purchasePageObjects.fieldCreditCardNumber, creditCardNumber, "Credit Card Number", timeout)
		ui.fill(purchasePageObjects.fieldMonth, month, "Month", timeout)
		ui.fill(purchasePageObjects.fieldYear, year, "Year", timeout)
		ui.fill(purchasePageObjects.fieldNameOnCard, nameOnCard, "Name on Card", timeout)
		ui.click(purchasePageObjects.checkboxRememberMe, "Remember Me", timeout)
		ui.takeScreenshot()
		clickPurchaseFlightButton(purchasePageObjects.buttonPurchaseFlight, timeout)
		
	}
}

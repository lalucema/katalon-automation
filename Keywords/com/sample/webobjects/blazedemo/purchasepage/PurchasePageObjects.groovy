package com.sample.webobjects.blazedemo.purchasepage

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

import internal.GlobalVariable

public class PurchasePageObjects {
	
	def static headerFlightDetails = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/headerFlightDetails')
	def static fieldName = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/name')
	def static fieldAddress = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/address')
	def static fieldCity = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/city')
	def static fieldState = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/state')
	def static fieldZipcode = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/zipCode')
	def static fieldCardType = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/cardType')
	def static fieldCreditCardNumber = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/creditCardNumber')
	def static fieldMonth = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/month')
	def static fieldYear = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/year')
	def static fieldNameOnCard = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/nameOnCard')
	def static checkboxRememberMe = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/checkboxRememberMe')
	def static buttonPurchaseFlight = findTestObject('Object Repository/Exercise 4/Page_BlazeDemo Purchase/buttonPurchaseFlight')

}

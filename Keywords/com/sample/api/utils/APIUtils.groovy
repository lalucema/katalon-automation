package com.sample.api.utils

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
import com.sample.utils.LoggerUtil
import com.kms.katalon.core.testobject.ResponseObject
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonOutput

public class APIUtils {

	LoggerUtil log = LoggerUtil.getInstance()

	@Keyword
	def verifyItemByIndex(ResponseObject response, int index, int expectedStatus, String expectedName, String expectedColor, String expectedCapacity) {
		String responseText = response.getResponseText()
		log.info("Response Received:\n" + JsonOutput.prettyPrint(responseText))
		
		WS.verifyResponseStatusCode(response, expectedStatus)
		log.info("Status Code 200 verified.")
	
		WS.verifyElementPropertyValue(response, "name[${index}]", expectedName)
		WS.verifyElementPropertyValue(response, "data[${index}].color", expectedColor)
		WS.verifyElementPropertyValue(response, "data[${index}].capacity", expectedCapacity)

		String actualName = WS.getElementPropertyValue(response, "name[${index}]")
		String actualColor = WS.getElementPropertyValue(response, "data[${index}].color")
		String actualCapacity = WS.getElementPropertyValue(response, "data[${index}].capacity")

		log.info("--- Data Verification for Index ${index} ---")
		log.info("Extracted Name: ${actualName} (Expected: ${expectedName})")
		log.info("Extracted Color: ${actualColor} (Expected: ${expectedColor})")
		log.info("Extracted Capacity: ${actualCapacity} (Expected: ${expectedCapacity})")
	}

	@Keyword
	def verifyAndSaveResponse(ResponseObject response, int expectedStatus, String expectedName, int expectedYear, String expectedMonth) {
		String responseText = response.getResponseText()
		log.info("Response Body:\n" + JsonOutput.prettyPrint(responseText))
		WS.verifyResponseStatusCode(response, expectedStatus)
		log.info("Status Code 200 verified.")

		WS.verifyElementPropertyValue(response, "name", expectedName)
		WS.verifyElementPropertyValue(response, "data.year", expectedYear)
		WS.verifyElementPropertyValue(response, "data.month", expectedMonth)
		log.info("Properties 'name', 'year', and 'month' verified successfully.")
		
		String actualName = WS.getElementPropertyValue(response, "name")
		String actualYear = WS.getElementPropertyValue(response, "data.year")
		String actualMonth = WS.getElementPropertyValue(response, "data.month")

		GlobalVariable.G_ID = WS.getElementPropertyValue(response, "id")
		log.success("Successfully captured and saved ID: " + GlobalVariable.G_ID)
	}
	
	@Keyword
	def verifyGlobalVariableID(ResponseObject response, int expectedStatus) {
		String responseText = response.getResponseText()
		log.info("Response Body:\n" + JsonOutput.prettyPrint(responseText))
		WS.verifyResponseStatusCode(response, expectedStatus)
		log.info("Status Code 200 verified.")
		
		GlobalVariable.G_ID = WS.getElementPropertyValue(response, "id")
		log.success("Successfully captured and saved ID: " + GlobalVariable.G_ID)
	}
	
}

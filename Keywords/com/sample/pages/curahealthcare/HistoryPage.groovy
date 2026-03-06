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
import com.sample.webobjects.curahealthcare.historypage.HistoryPageObjects
import internal.GlobalVariable
import java.time.Month
import java.text.SimpleDateFormat

public class HistoryPage {
	
	WebUIUtil ui = new WebUIUtil()
	HistoryPageObjects historyPageObjects = new HistoryPageObjects()
	
	def verifyHistoryHeader(TestObject object, int timeout) {
		ui.assertVisible(object, "History")
	}
	
//	def verifyVisitDate(String expectedDay, String expectedMonth, String expectedYear, int timeout = 10) {
//		Month month = Month.valueOf(expectedMonth)
//		String expectedVisitDate = expectedDay "/" + expectedMonth "/" + expectedYear
//		println "Recent visit date: " + expectedVisitDate
//		ui.assertText(historyPageObjects.textVisitDate, expectedVisitDate, "Visit Date", timeout)
//	}
	
	def verifyVisitDate(String expectedDay, String expectedMonth, String expectedYear, int timeout = 10) {
		Date date = new SimpleDateFormat("MMMM").parse(expectedMonth)
		String monthNumeric = new SimpleDateFormat("MM").format(date)
		String formattedDay = expectedDay.padLeft(2, '0')
		String formattedDate = formattedDay + "/" + monthNumeric + "/" + expectedYear
		ui.assertText(historyPageObjects.textVisitDate, formattedDate, "Visit Date", true ,timeout)
	}
	
	def verifyRecentAppointment(String expectedFacility, String expectedHospitalReadmission, String expectedHealthcareProgram, String comment, int timeout = 10) {
		verifyHistoryHeader(historyPageObjects.headerHistory, timeout)
		ui.assertText(historyPageObjects.textFacility, expectedFacility, "Facility", true, timeout)
		ui.assertText(historyPageObjects.textHospitalReadmission, expectedHospitalReadmission, "Hospital Readmission", true, timeout)
		ui.assertText(historyPageObjects.textHealthcareProgram, expectedHealthcareProgram, "Healthcare Program", true, timeout)
		ui.assertText(historyPageObjects.textComment, comment, "Comment",true, timeout)
		ui.takeScreenshot()
	}
		
}

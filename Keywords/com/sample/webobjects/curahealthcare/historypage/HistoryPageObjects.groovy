package com.sample.webobjects.curahealthcare.historypage

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

public class HistoryPageObjects {
	
	def static headerHistory = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/HistoryPage/headerHistory')
	def static textFacility = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/HistoryPage/textFacility')
	def static textVisitDate = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/HistoryPage/visitDate')
	def static textHospitalReadmission = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/HistoryPage/textHospitalReadmission')
	def static textHealthcareProgram = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/HistoryPage/textHealthcareProgram')
	def static textComment = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/HistoryPage/textComment')
}

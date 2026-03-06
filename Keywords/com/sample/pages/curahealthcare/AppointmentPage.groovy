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
import com.kms.katalon.core.testobject.ConditionType
import java.text.SimpleDateFormat
import com.sample.utils.WebUIUtil
import com.sample.webobjects.curahealthcare.appointment.AppointmentPageObjects
import internal.GlobalVariable

public class AppointmentPage {

	WebUIUtil ui = new WebUIUtil()
	AppointmentPageObjects appointmentPageObjects = new AppointmentPageObjects()

	def clickHamburgerIcon(TestObject object, int timeout) {
		ui.click(object, "Hamburger", timeout)
	}

	def clickLogoutOption(TestObject object, int timeout) {
		ui.click(object, "Logout", timeout)
	}
	
	def checkHospitalReadmission(TestObject object, int timeout) {
		ui.click(object, "Apply for hospital readmission", timeout)
	}

	def clickRadioButtonNone(TestObject object, int timeout) {
		ui.click(object, "None", timeout)
	}

	def clickBookAppointment(TestObject object, int timeout) {
		ui.click(object, "Book Appointment Button", timeout)
	}

	def performLogoutActions(int timeout = 10) {
		clickHamburgerIcon(appointmentPageObjects.iconHamburger, timeout)
		clickLogoutOption(appointmentPageObjects.optionLogout, timeout)
		ui.takeScreenshot()
	}

	@Keyword
	public void selectVisitDate(String targetDay, String targetMonth, String targetYear) {
		ui.click(appointmentPageObjects.visitCalendar, "Visit Date Calendar")
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy")
		Date targetDate = sdf.parse("${targetMonth} ${targetYear}")

		while (true) {
			String currentText = WebUI.getText(appointmentPageObjects.monthYearTitle)
			Date currentDate = sdf.parse(currentText)

			if (currentDate.equals(targetDate)) {
				break 
			} else if (currentDate.after(targetDate)) {
				ui.click(appointmentPageObjects.buttonPrevious, "Calendar Previous Month Button")
			} else {
				ui.click(appointmentPageObjects.buttonNext, "Calendar Next Month Button")
			}
			ui.delay(2)
		}

		ui.click(appointmentPageObjects.getDayObject(targetDay), "Day: ${targetDay}")
	}

	def fillUpAppointmentForm(String facility, String targetDay, String targetMonth, String targetYear, String comment, int timeout = 10) {
		ui.assertVisible(appointmentPageObjects.headerMakeAppointment, "Make Appointment")
		ui.selectOption(appointmentPageObjects.dropdownFacility, "Facility: ${facility}", [value: facility], timeout)
		
		checkHospitalReadmission(appointmentPageObjects.checkboxHospitalReadmission, timeout)
		
		clickRadioButtonNone(appointmentPageObjects.radioButtonNone, timeout)
		selectVisitDate(targetDay, targetMonth, targetYear)
		ui.click(appointmentPageObjects.comment, "Comment", timeout)
		ui.fill(appointmentPageObjects.comment, comment, "Comment", timeout)
		ui.takeScreenshot()
		clickBookAppointment(appointmentPageObjects.buttonBookAppointment, timeout)
	}
}

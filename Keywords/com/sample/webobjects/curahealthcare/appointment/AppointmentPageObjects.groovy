package com.sample.webobjects.curahealthcare.appointment

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType // Required for the new XPaths

public class AppointmentPageObjects {
	
	def static headerMakeAppointment = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/headerMakeAppointment')
	def static iconHamburger = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/iconHamburger')
	def static optionLogout = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/optionLogout')
	def static dropdownFacility = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/dropdownFacility')
	def static checkboxHospitalReadmission = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/checkboxHospitalReadmission')
	def static radioButtonNone = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/radioButtonNone')
	def static visitCalendar = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/visitCalendar')
	def static comment = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/comment')
	def static buttonBookAppointment = findTestObject('Object Repository/Exercise 4/Page_CURA Healthcare Service/Appointment/buttonBookAppointment')
	def static monthYearTitle = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//th[@class='datepicker-switch']")
	def static buttonPrevious = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//div[@class='datepicker-days']//th[@class='prev']")
	def static buttonNext = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//div[@class='datepicker-days']//th[@class='next']")

    public static TestObject getDayObject(String day) {
        return new TestObject().addProperty("xpath", ConditionType.EQUALS, "//td[@class='day' and text()='${day}']")
    }
}
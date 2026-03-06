import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Navigate to URL and click "Make Appointment" button.

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/a_Make Appointment'))

// Login using valid credentials.

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Username_txt-username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Password_txt-password'), 
    'ThisIsNotAPassword')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/button_Login'))

// Fill in required details and click "Book Appointment".

WebUI.selectOptionByValue(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/label_None'))

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Visit Date (Required)_txt_visit_date'))

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/td_2'))

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/textarea_Comment_txt_comment'), 
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/button_Book Appointment'))

// Validate "Appointment Confirmation" is visible.

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()


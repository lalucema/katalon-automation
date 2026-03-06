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

//Navigate to URL.

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

//Validate Home Page Element (Title, Subtitle, Button, Footer)

// Verify Title is visible.

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

// Verify Subtitle is visible.

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/h3_We Care About Your Health'))

// Scroll to the Footer and verify visibility.

WebUI.scrollToElement(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2026'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2026'))

// Scroll to the 'Make Appointment' button; verify visibility and click.

WebUI.scrollToElement(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/a_btn-make-appointment'), 
    0)
WebUI.verifyElementClickable(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/a_btn-make-appointment'))

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/a_btn-make-appointment'))

// Take screenshot.

WebUI.takeScreenshot()

// Invalid login using invalid username and valid password.

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Username'), 'John Doenut')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Password_txt-password'), 
    'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/button_btn-login'))

// Validate if "Login failed! Please ensure the username and password are valid." is visible.

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/p_Login failed Please ensure the username and p'))

// Take screenshot.

WebUI.takeScreenshot()

// Invalid login using valid username and invalid password.

// Refresh the page.

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/a_btn-make-appointment'))

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Password_txt-password'),
	'ThisIsNotAPassword!')

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/button_btn-login'))

//Validate if "Login failed! Please ensure the username and password are valid." is visible.

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/p_Login failed Please ensure the username and p'))

WebUI.takeScreenshot()

//Invalid login using valid username and invalid password.

// Refresh the page.

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/a_btn-make-appointment'))

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Username'), 'John Doenut')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/input_Password_txt-password'),
	'ThisIsNotAPassword!')

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/button_btn-login'))

//Validate if "Login failed! Please ensure the username and password are valid." is visible.

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_CURA Healthcare Service/p_Login failed Please ensure the username and p'))

WebUI.takeScreenshot()

WebUI.closeBrowser()



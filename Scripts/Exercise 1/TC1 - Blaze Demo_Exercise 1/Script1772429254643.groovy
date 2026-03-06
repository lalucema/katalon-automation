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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://blazedemo.com/')

// Select 'Portland' as Departure City.

WebUI.selectOptionByValue(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo/select_Paris            Philadelphia       _54ada8'), 
    'Portland', true)

// Select 'Dublin' as Destination City.

WebUI.selectOptionByValue(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo/select_Buenos Aires            Rome        _b23956'), 
    'Dublin', true)

WebUI.verifyOptionPresentByValue(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo/select_Buenos Aires            Rome        _b23956'), 
    'Dublin', true, 0)

WebUI.takeScreenshot()

// Click 'Find Flights' button.

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo/input_Choose your destination city_btn btn-primary'))

// Choose Flight # 9696.

WebUI.verifyElementPresent(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo - reserve/td_9696'), 0)

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo - reserve/td_9696'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo - reserve/input_432.98_btn btn-small'))

// Fill in details and click 'Purchase flight' button.

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Name_inputName'), 'Mai Sakurajima')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Address_address'), '123')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_City_city'), 'Enoshima')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_State_state'), 'Golden')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Zip Code_zipCode'), '6969')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Credit Card Number_creditCardNumber'), 
    '1223334444')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Year_creditCardYear'), '2030')

WebUI.setText(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Name on Card_nameOnCard'), 'Mai')

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Remember me_rememberMe'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Purchase/input_Remember me_btn btn-primary'))

// Verify "Thank you for your purchase today!" is visible.

WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 1/Page_BlazeDemo Confirmation/h1_Thank you for your purchase today'))

WebUI.takeScreenshot()

WebUI.closeBrowser()


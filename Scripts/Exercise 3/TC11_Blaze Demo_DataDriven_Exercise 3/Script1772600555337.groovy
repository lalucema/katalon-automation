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

// Open browser, maximize window, and navigate to URL.
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://blazedemo.com/')

// Choose a departure and destination city, and click "Find Flights" button.
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo/headerMain'), 2)
WebUI.selectOptionByValue(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo/selectDeparture'), Departure, true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo/selectDestination'), Destination, true)
// Take screenshot.
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo/buttonFindFlights'))

// Choose a flight, and click "Choose This Flight" button.
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo - reserve/flightID234'), 2)
// Take screenshot.
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo - reserve/buttonChooseThisFlight'))

// Fill in all required details, check "Remember me" box, and click "Purchase Flight" button.
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/headerFlightDetails'), 2)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/name'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/name'), Name)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/address'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/address'), Address)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/city'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/city'), City)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/state'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/state'), State)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/zipCode'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/zipCode'), Zipcode)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/cardType'), 2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/cardType'), CardType, true)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/creditCardNumber'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/creditCardNumber'), CreditCardNumber)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/month'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/month'), Month)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/year'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/year'), Year)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/nameOnCard'), 2)
WebUI.setText(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/nameOnCard'), NameOnCard)
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/checkboxRememberMe'), 2)
WebUI.click(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/checkboxRememberMe'))
// Take screenshot.
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Purchase/buttonPurchaseFlight'))

// Wait and verify completion of purchase. 
WebUI.waitForElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Confirmation/headerConfirmation'), 2)
WebUI.verifyElementVisible(findTestObject('Object Repository/Exercise 3/Page_BlazeDemo Confirmation/headerConfirmation'), FailureHandling.STOP_ON_FAILURE)
// Take screenshot.
WebUI.takeScreenshot()

// Close browser.
WebUI.closeBrowser()


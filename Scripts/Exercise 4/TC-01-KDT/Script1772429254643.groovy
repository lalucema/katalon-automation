import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.sample.pages.blazedemo.LandingPage.*
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
import com.sample.pages.blazedemo.LandingPage as LandingPage
import com.sample.pages.blazedemo.ReservePage as ReservePage
import com.sample.pages.blazedemo.PurchasePage as PurchasePage
import com.sample.pages.blazedemo.ConfirmationPage as ConfirmationPage

LandingPage landingPage = new LandingPage()
ReservePage reservePage = new ReservePage()
PurchasePage purchasePage = new PurchasePage()
ConfirmationPage confirmationPage = new ConfirmationPage()

// Select departure and destination city, and click "Find Flights" button.
landingPage.performSelectFlights(Departure, Destination)

// Choose a flight.
reservePage.performReserveFlights()

// Fill up all the required details, and click "Purchase Flight" button.
purchasePage.performPurchaseFlight(Name, Address, City, State, Zipcode, CardType, 
                                   CreditCardNumber, Month, Year, NameOnCard)

// Wait and verify completion of purchase. 
confirmationPage.verifyConfirmation()

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

// Start application.
Mobile.startApplication('/Users/lian.alucema/Downloads/APIDemos.apk', true)

// Wait for element "Access'ibility" to be present then verify visibility.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility (1)'),
	0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility (1)'), 
    0)

// Wait for element "Accessibility" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility'),
	0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility'),
	0)

// Wait for element "Animation" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Animation'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Animation'), 
    0)

// Wait for element "App" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - App'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - App'), 
    0)

// Wait for element "Content" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Content'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Content'), 
    0)

// Wait for element "Graphics" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Graphics'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Graphics'), 
    0)

// Wait for element "Media" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Media'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Media'), 
    0)

// Wait for element "NFC" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - NFC'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - NFC'), 
    0)

// Wait for element "OS" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - OS'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - OS'), 
    0)

// Wait for element "Preference" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Preference'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Preference'), 
    0)

// Wait for element "Text" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Text'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Text'), 
    0)

// Wait for element "Views" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Views'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Views'), 
    0)

// Take screenshot.

Mobile.takeScreenshot()

// Close application.

Mobile.closeApplication()


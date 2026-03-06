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

// Tap "Content" Submenu
Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Content'),
	2)

// Wait for element "Access'ibility" to not be present then verify it is not visible.
Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility (1)'),
	2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility (1)'), 
    2)

// Wait for element "Accessibility" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility'),
	2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Accessibility'),
	2)

// Wait for element "Animation" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Animation'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Animation'), 
    2)

// Wait for element "App" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - App'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - App'), 
    2)

// Wait for element "Content" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Content'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Content'), 
    2)

// Wait for element "Graphics" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Graphics'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Graphics'), 
    2)

// Wait for element "Media" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Media'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Media'), 
    2)

// Wait for element "NFC" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - NFC'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - NFC'), 
    2)

// Wait for element "OS" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - OS'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - OS'), 
    2)

// Wait for element "Preference" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Preference'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Preference'), 
    2)

// Wait for element "Text" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Text'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Text'), 
    2)

// Wait for element "Views" to not be present then verify it is not visible.

Mobile.waitForElementNotPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Views'), 
    2)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Views'), 
    2)

// Take screenshot.

Mobile.takeScreenshot()

// Close application.

Mobile.closeApplication()


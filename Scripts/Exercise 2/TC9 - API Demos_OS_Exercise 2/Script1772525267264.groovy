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

// Tap "OS" submenu.
Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - OS'), 0)

// Wait for "Morse Code" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Morse Code'), 
    0)

// Wait for "Rotation Vector" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Rotation Vector'), 
    0)

// Wait for "Sensors" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Sensors'), 
    0)

// Wait for "SMS Messaging" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - SMS Messaging'), 
    0)

// Tap "SMS Messaging" option.
Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - SMS Messaging'),
	0)

// Tap checkbox on "Enable SMS broadcast receiver"
Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.CheckBox - Enable SMS broadcast receiver'), 
    0)

// Input "1942782911" on Recipient.
Mobile.sendKeys(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.EditText'), '1942782911')

// Input "Test automation 123 !@#'" on Message.
Mobile.sendKeys(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.EditText (1)'), 'Test automation 123 !@#')

// Tap "Send" button.
Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.Button - Send'), 0)

// Take screenshot
Mobile.takeScreenshot()

// Wait for "Morse Code" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Morse Code'), 
    0)

// Wait for "Rotation Vector" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Rotation Vector'), 
    0)

// Wait for "Sensors" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Sensors'), 
    0)

// Wait for "SMS Messaging" option.
Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - SMS Messaging'), 
    0)

// Take screenshot
Mobile.takeScreenshot()

// Close application.
Mobile.closeApplication()


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

// Tap "Media" Submenu
Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Media'), 0)

// Wait for element "AudioFx" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - AudioFx'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - AudioFx'), 
    0)

// Wait for element "MediaPlayer" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - MediaPlayer'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - MediaPlayer'), 
    0)

// Wait for element "VideoView" to be present then verify visibility.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - VideoView'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - VideoView'), 
    0)

// Tap "AudioFx" option.

Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - AudioFx'), 0)

// Wait for "60 Hz" slider and tap.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '60 Hz']), 0)

Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '60 Hz']), 0)

// Wait for "230 Hz" slider and tap.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '230 Hz']), 0)

Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '230 Hz']), 0)

// Wait for "910 Hz" slider and tap.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '910 Hz']), 0)

Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '910 Hz']), 0)

// Wait for "3600 Hz" slider and tap.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '3600 Hz']), 0)

Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '3600 Hz']), 0)

// Wait for "14000 Hz" slider and tap.

Mobile.waitForElementPresent(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '14000 Hz']), 0)

Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.SeekBar', [('freq') : '14000 Hz']), 0)

// Take screenshot.

Mobile.takeScreenshot()

// Close application.

Mobile.closeApplication()


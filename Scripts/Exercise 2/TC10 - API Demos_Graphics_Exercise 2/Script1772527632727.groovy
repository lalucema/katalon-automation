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

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Graphics'), 2)

// Tap "Graphics" submenu.
Mobile.tap(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Graphics'), 2)

// Verify all "Graphics" submenu exists.

// Scroll to "Xfermodes" option.
Mobile.scrollToText('Xfermodes')

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Xfermodes'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Vertices'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - UnicodeChart'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Typefaces'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Touch Paint'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Text Align'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Sweep'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - SurfaceView Overlay'),
	2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Surface Window'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - SensorTest'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - ScaleToFit'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - RoundRects'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Regions'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - PurgeableBitmap'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - PolyToPoly'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Points'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Patterns'), 2)

// Scroll to "PathFillTypes" option.
Mobile.scrollToText('PathFillTypes')

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - PathFillTypes'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - PathEffects'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - OpenGL ES'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - MeasureText'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Layers'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - FingerPaint'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Drawable'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Density'), 2)

// Scroll to "CreateBitmap" option.
Mobile.scrollToText('AlphaBitmap')

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - CreateBitmap'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Compass'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - ColorMatrix'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - ColorFilters'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Clipping'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - CameraPreview'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - BitmapPixels'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - BitmapMesh'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - BitmapDecode'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - Arcs'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - AnimateDrawables'), 2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Exercise 2/Android_API Demos/android.widget.TextView - AlphaBitmap'), 2)

// Take screenshot.
Mobile.takeScreenshot()

// Close application.
Mobile.closeApplication()
package com.sample.utils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.text.SimpleDateFormat

class WebUIUtil {

	private LoggerUtil log = LoggerUtil.getInstance()
	private final int DEFAULT_TIMEOUT = 10

	// --- NAVIGATION ---

	@Keyword
	def open(String url) {
		log.info("Open | ${url}")
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(url)
	}

	@Keyword
	def assertUrl(String expectedUrl) {
		log.info("Assert URL | Should be: ${expectedUrl}")
		String currentUrl = WebUI.getUrl()
		if (currentUrl != expectedUrl) {
			log.error("URL Mismatch! Found: ${currentUrl}")
			assert false : "URL Mismatch"
		}
	}

	// --- INTERACTIONS ---

	@Keyword
	def click(TestObject to, String name, int timeout = DEFAULT_TIMEOUT) {
		log.info("Click | ${name}")
		try {
			WebUI.waitForElementPresent(to, timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.waitForElementVisible(to, timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.waitForElementClickable(to, timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(to)
			log.success("Successfully clicked | ${name}")
		} catch (Exception e) {
			log.error("Failed to click '${name}'. Reason: ${e.message}")
			throw e
		}
	}

	@Keyword
	def hover(TestObject to, String name, int timeout = DEFAULT_TIMEOUT) {
		log.info("Hover | ${name}")
		try {
			WebUI.waitForElementVisible(to, timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.mouseOver(to)
		} catch (Exception e) {
			log.error("Failed to hover over '${name}'")
			throw e
		}
	}
	
	@Keyword
	def delay(int seconds) {
		println "Applying a safety delay of ${seconds} seconds..."
		WebUI.delay(seconds)
	}

	@Keyword
	def fill(TestObject to, String value, String name, int timeout = DEFAULT_TIMEOUT) {
		log.info("Fill | ${name} = '${value}'")
		try {
			WebUI.waitForElementVisible(to, timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(to, value)
		} catch (Exception e) {
			log.error("Failed to fill '${name}'")
			throw e
		}
	}

	@Keyword
	def selectOption(TestObject to, String name, Map options = [:], int timeout = DEFAULT_TIMEOUT) {
		log.info("Select | ${name} (Options: ${options})")
		try {
			WebUI.waitForElementVisible(to, timeout, FailureHandling.STOP_ON_FAILURE)
			if (options.value) {
				WebUI.selectOptionByValue(to, options.value.toString(), false)
			} else if (options.label) {
				WebUI.selectOptionByLabel(to, options.label.toString(), false)
			} else if (options.index != null) {
				WebUI.selectOptionByIndex(to, options.index)
			} else {
				throw new IllegalArgumentException("Must provide 'value', 'label', or 'index'.")
			}
		} catch (Exception e) {
			log.error("Failed to select option for '${name}'")
			throw e
		}
	}

	@Keyword
	def scrollTo(TestObject to, String name, int timeout = DEFAULT_TIMEOUT) {
		log.info("Scroll | Attempting to locate: ${name}")
		try {
			WebUI.waitForElementPresent(to, timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.scrollToElement(to, timeout)
			WebUI.delay(1)
			log.success("Scroll | Success: reached ${name}")
		} catch (Exception e) {
			log.warning("Scroll | Standard scroll failed for ${name}. Attempting JS Scroll.")
			try {
				WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(to))
				log.success("Scroll | Success: reached ${name} via JavaScript")
			} catch (Exception jsEx) {
				log.error("Scroll | Failed to reach ${name}. Error: ${jsEx.message}")
				throw jsEx
			}
		}
	}

	// --- ASSERTIONS & WAITS ---

	@Keyword
	def assertVisible(TestObject to, String name, int timeout = DEFAULT_TIMEOUT) {
		log.info("Assert | Waiting for '${name}' to be visible")
		try {
			WebUI.waitForElementVisible(to, timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementVisible(to, FailureHandling.STOP_ON_FAILURE)

			log.success("Assert | Success: '${name}' is visible")
		} catch (Exception e) {
			log.error("Assert | Failed: '${name}' is NOT visible after ${timeout} seconds")
			throw e
		}
	}

	@Keyword
	def assertText(TestObject to, String expected, String name, boolean exact = false, int timeout = DEFAULT_TIMEOUT) {
		String matchType = exact ? "exactly" : "contains"
		log.info("Assert | '${name}' text ${matchType} '${expected}'")

		if (exact) {
			WebUI.verifyElementText(to, expected, FailureHandling.STOP_ON_FAILURE)
		} else {
			String actualText = WebUI.getText(to)
			if (!actualText.contains(expected)) {
				log.error("Text mismatch! Found: ${actualText}")
				assert false : "Text does not contain expected string"
			}
		}
	}

	@Keyword
	def waitForElement(TestObject to, String state = "visible", int timeout = DEFAULT_TIMEOUT) {
		log.info("Wait | For element state '${state}'")
		if (state == "visible") {
			WebUI.waitForElementVisible(to, timeout)
		} else {
			WebUI.waitForElementPresent(to, timeout)
		}
	}

	@Keyword
	def takeScreenshot() {
		try {
			String projectDir = RunConfiguration.getProjectDir()
			String testCaseId = RunConfiguration.getExecutionSourceId()
			if (testCaseId == null || testCaseId.isEmpty()) {
				testCaseId = "Manual_Screenshot"
			}
			String cleanName = testCaseId.replaceAll("[^a-zA-Z0-9]", "_")
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
			String screenFolder = projectDir + "/Screenshots/"
			String fullPath = "${screenFolder}${cleanName}_${timestamp}.png"
			new File(screenFolder).mkdirs()
			WebUI.takeFullPageScreenshot(fullPath)
			log.info("Screenshot captured: ${fullPath}")
		} catch (Exception e) {
			log.warning("Could not capture auto-screenshot, but continuing test. Reason: ${e.message}")
		}
	}

	@Keyword
	def close() {
		log.info("Attempting to close browser and terminate WebDriver session...")
		try {
			WebUI.closeBrowser(FailureHandling.OPTIONAL)
			log.success("Browser closed successfully.")
		} catch (Exception e) {
			log.warning("Browser was already closed or session was lost: ${e.message}")
		}
	}
}
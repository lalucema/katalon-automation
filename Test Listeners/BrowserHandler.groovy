import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.sample.utils.LoggerUtil
import com.sample.utils.WebUIUtil

class BrowserHandler {

	WebUIUtil ui = new WebUIUtil()
	LoggerUtil log = LoggerUtil.getInstance()

	@BeforeTestCase
	def BeforeTestCase(TestCaseContext testCaseContext) {
		log.info(">>> Starting Test Case: " + testCaseContext.getTestCaseId())

		switch (GlobalVariable.G_TestType) {

			case "Web":
				log.info("Mode: Web UI. Opening browser at: " + GlobalVariable.G_SiteURL)
				ui.open(GlobalVariable.G_SiteURL)
				log.success("Browser opened and navigated to URL successfully.")
				break

			case "Mobile":
				log.info("Mode: Mobile. Starting App at: " + GlobalVariable.G_AppPath)
				Mobile.startApplication(GlobalVariable.G_AppPath, false)
				log.success("Mobile application started successfully.")
				break

			case "API":
				log.info("Mode: API. Skipping UI driver initialization.")
				break

			default:
				log.warning("G_TestType '${GlobalVariable.G_TestType}' not recognized. No driver started.")
				break
		}
	}

	@AfterTestCase
	def AfterTestCase(TestCaseContext testCaseContext) {
		if (GlobalVariable.G_TestType == "Web") {
			WebUI.closeBrowser()
			log.info("Browser closed.")
		} else if (GlobalVariable.G_TestType == "Mobile") {
			Mobile.closeApplication()
			log.info("Mobile application closed.")
		}

		log.info("<<< Finished Test Case: " + testCaseContext.getTestCaseId())
	}
}
	//	@BeforeTestCase
	//	def BeforeTestCase(TestCaseContext testCaseContext) {
	//		if (testCaseContext.getTestCaseId().contains('Test Cases/Exercise 5')) {
	//			println ">>> Running API Test: No browser will open."
	//		} else {
	//			ui.open(GlobalVariable.G_SiteURL)
	//		}
	//	}
	//
	//	@AfterTestCase
	//	def AfterTestCase(TestCaseContext testCaseContext) {
	//		ui.close()
	//	}
	//}


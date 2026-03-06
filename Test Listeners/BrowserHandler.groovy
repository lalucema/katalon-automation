import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.sample.utils.WebUIUtil
import internal.GlobalVariable as GlobalVariable

class BrowserHandler {

	WebUIUtil ui = new WebUIUtil()

	@BeforeTestCase
	def BeforeTestCase(TestCaseContext testCaseContext) {
		if (testCaseContext.getTestCaseId().contains('Test Cases/Exercise 5')) {
			println ">>> Running API Test: No browser will open."
		} else {
			ui.open(GlobalVariable.G_SiteURL)
		}
	}

	@AfterTestCase
	def AfterTestCase(TestCaseContext testCaseContext) {
		ui.close()
	}
}
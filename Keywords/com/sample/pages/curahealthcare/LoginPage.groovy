package com.sample.pages.curahealthcare

import com.kms.katalon.core.testobject.TestObject
import com.sample.utils.WebUIUtil
import com.sample.webobjects.curahealthcare.loginpage.LoginPageObjects
import internal.GlobalVariable as GlobalVariable

public class LoginPage {
	WebUIUtil ui = new WebUIUtil()
	LoginPageObjects loginPageObjects = new LoginPageObjects()

	def clickLoginButton(TestObject object, int timeout) {
		ui.click(object, "Login Button", timeout)
	}

	def performLoginActions(String username, String password, int timeout = 10) {
		ui.fill(loginPageObjects.fieldUsername, username, "Username Field", timeout)
		ui.fill(loginPageObjects.fieldPassword, password, "Password Field", timeout)
		ui.takeScreenshot()
		clickLoginButton(loginPageObjects.buttonLogin, timeout)
	}
	
	def performInvalidLoginActions(String username, String password, int timeout = 10) {
		ui.fill(loginPageObjects.fieldUsername, username, "Username Field", timeout)
		ui.fill(loginPageObjects.fieldPassword, password, "Password Field", timeout)
		ui.takeScreenshot()
		clickLoginButton(loginPageObjects.buttonLogin, timeout)
		ui.assertVisible(loginPageObjects.messageLoginFailed, "Login failed! Please ensure the username and password are valid.")
		ui.takeScreenshot()
	}
	
}
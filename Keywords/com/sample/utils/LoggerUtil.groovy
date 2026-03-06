package com.sample.utils

import java.text.SimpleDateFormat
import java.nio.file.Files 
import java.nio.file.Paths
import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.File
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil

class LoggerUtil {
	private static LoggerUtil instance = null
	private static PrintWriter fileWriter

	// ANSI Color Codes for Console
	private static final String ANSI_RESET = "\u001B[0m"
	private static final String ANSI_CYAN  = "\u001B[36m"
	private static final String ANSI_YELLOW = "\u001B[33m"
	private static final String ANSI_RED    = "\u001B[31m"
	private static final String ANSI_GREEN  = "\u001B[32m"

	private LoggerUtil() {
		setupLogger()
	}

	// Singleton Thread-Safe Access
	public static synchronized LoggerUtil getInstance() {
		if (instance == null) {
			instance = new LoggerUtil()
		}
		return instance
	}

	private void setupLogger() {
		String projectDir = RunConfiguration.getProjectDir()
		String logsPath = projectDir + "/logs"
		Files.createDirectories(Paths.get(logsPath))
		File logFile = new File(logsPath + "/automation.log")
		fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(logFile, true)))
	}

	private String getTimestamp() {
		return new SimpleDateFormat("MM-dd-yyyy hh:mm:ss a").format(new Date())
	}

	private void writeToFile(String level, String message) {
		fileWriter.println("[${getTimestamp()}][${level}] ${message}")
		fileWriter.flush()
	}

	// --- Public Logging Methods ---

	public void info(String message) {
		String logMsg = "[${getTimestamp()}][INFO] ${message}"
		println "${ANSI_CYAN}${logMsg}${ANSI_RESET}" // Console Color
		writeToFile("INFO", message)
		KeywordUtil.logInfo(message)
	}

	public void error(String message) {
		String logMsg = "[${getTimestamp()}][ERROR] ${message}"
		System.err.println "${ANSI_RED}${logMsg}${ANSI_RESET}"
		writeToFile("ERROR", message)
		KeywordUtil.markFailed(message)
	}

	public void warning(String message) {
		String logMsg = "[${getTimestamp()}][WARNING] ${message}"
		println "${ANSI_YELLOW}${logMsg}${ANSI_RESET}"
		writeToFile("WARNING", message)
	}

	public void success(String message) {
		String logMsg = "[${getTimestamp()}][SUCCESS] ${message}"
		println "${ANSI_GREEN}${logMsg}${ANSI_RESET}"
		writeToFile("SUCCESS", message)
		KeywordUtil.markPassed(message)
	}
}

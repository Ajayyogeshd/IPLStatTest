package com.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utils.ExtentReporter;

public class Listeners implements ITestListener {

	ExtentReports extentReport;
	ExtentTest extentTest;
	WebDriver driver;

	/**
	 * Method called when all tests have finished executing.
	 * It flushes the extent report and opens the generated report file in the default web browser.
	 *
	 * @param context The test context.
	 */
	public void onFinish(ITestContext context) {
	    extentReport.flush();

	    String pathOfExtentReport = System.getProperty("user.dir") + "\\test-output\\ExtentReports\\extentReport.html";
	    File extentReport = new File(pathOfExtentReport);

	    try {
	        Desktop.getDesktop().browse(extentReport.toURI());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Method called when the test execution starts.
	 * It generates the extent report.
	 *
	 * @param context The test context.
	 */
	public void onStart(ITestContext context) {
	    extentReport = ExtentReporter.generateExtentReport();
	}

	/**
	 * Method called when a test fails.
	 * It captures a screenshot of the failed test, adds it to the extent report, logs the throwable,
	 * and marks the test as failed.
	 *
	 * @param result The test result.
	 */
	public void onTestFailure(ITestResult result) {
	    try {
	        driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
	                .get(result.getInstance());
	    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
	        e.printStackTrace();
	    }

	    String destinationScreenshotPath = BaseClass.captureScreenshot(driver, result.getName());

	    extentTest.addScreenCaptureFromPath(destinationScreenshotPath);
	    extentTest.log(Status.INFO, result.getThrowable());
	    extentTest.log(Status.FAIL, result.getName() + " got failed");
	}


	/**
	 * Method called when a test is skipped.
	 * It logs the throwable and marks the test as skipped.
	 *
	 * @param result The test result.
	 */
	public void onTestSkipped(ITestResult result) {
	    extentTest.log(Status.INFO, result.getThrowable());
	    extentTest.log(Status.SKIP, result.getName() + " got skipped");
	}

	/**
	 * Method called when a test starts executing.
	 * It creates a new extent test and logs that the test has started executing.
	 *
	 * @param result The test result.
	 */
	public void onTestStart(ITestResult result) {
	    extentTest = extentReport.createTest(result.getName());
	    extentTest.log(Status.INFO, result.getName() + " started executing");
	}

	/**
	 * Method called when a test successfully completes.
	 * It logs that the test was successfully executed.
	 *
	 * @param result The test result.
	 */
	public void onTestSuccess(ITestResult result) {
	    extentTest.log(Status.PASS, result.getName() + " got successfully executed");
	}


}

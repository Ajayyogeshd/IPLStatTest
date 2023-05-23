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

	public void onStart(ITestContext context) {
		extentReport = ExtentReporter.generateExtentReport();
		

	}

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

	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.SKIP, result.getName() + " got skipped");

	}

	public void onTestStart(ITestResult result) {
		extentTest = extentReport.createTest(result.getName());
		extentTest.log(Status.INFO, result.getName() + " started executing");

	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, result.getName() + " got successfully executed");

	}

}

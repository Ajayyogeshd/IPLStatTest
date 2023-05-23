package com.iplStatTest.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.iplStatTest.pages.AwardPage;
import com.iplStatTest.pages.RecordsPage;
import com.iplStatTest.pages.StatPage;

@Listeners(com.listeners.Listeners.class)
public class RecordTabTest extends BaseClass {

	public WebDriver driver;
	private static final Logger log = LogManager.getLogger(RecordTabTest.class);

	@BeforeMethod
	public void setup() {
		log.info("Browser is initialized");
		driver = initializeWebDriver(getBrowser());
		driver.get(getUrl());
		maximizeWindow(driver);
		
	}

	@AfterMethod
	public void tearDown() {
		log.info("Browser is closed");
		quitWindow();
	}

	@Test
	public void TC_RT_001_StatPage() {

		StatPage statPage = new StatPage();
		statPage.enterStatPage();
		log.info("Stat page is verified");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "FAF DU PLESSIS", "Batting topper verified");
	}

	@Test
	public void TC_RT_002_AwardPage() {
		StatPage statPage = new StatPage();
		AwardPage awardTab = statPage.clickAwardTab();
		awardTab.awardPageVerification();
		log.info("Awards page is verified");
	}

	@Test
	public void TC_RT_003_RecordsPage() {
		StatPage statPage = new StatPage();
		RecordsPage recordTab = statPage.clickRecordTab();
		recordTab.recordPageVerification();
		log.info("Records page is verified");
	}
}

package com.iplStatTest.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.iplStatTest.pages.StatPage;

@Listeners(com.listeners.Listeners.class)
public class SeasonFunctionTest extends BaseClass {
	public WebDriver driver;
	private static final Logger log = LogManager.getLogger(RecordTabTest.class);
	public StatPage statPage;

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
	public void TC_SF_001_S23() throws InterruptedException {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2023");

	}

	@Test
	public void TC_SF_002_S22() throws InterruptedException {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2022");

	}
	@Test
	public void TC_SF_003_S21() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2021");

	}
	@Test
	public void TC_SF_004_S20() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2020");

	}
	@Test
	public void TC_SF_005_S19() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2019");

	}
	@Test
	public void TC_SF_006_S18() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2018");

	}
	@Test
	public void TC_SF_007_S17() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2017");

	}
	@Test
	public void TC_SF_008_S16() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2016");

	}
	@Test
	public void TC_SF_009_S15() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2015");

	}
	@Test
	public void TC_SF_010_S14() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2014");

	}
	@Test
	public void TC_SF_011_S13() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2013");

	}
	@Test
	public void TC_SF_012_S12() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2012");

	}
	@Test
	public void TC_SF_013_S11() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2011");

	}
	@Test
	public void TC_SF_014_S10() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2010");

	}
	@Test
	public void TC_SF_015_S09() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2009");

	}
	@Test
	public void TC_SF_016_S08() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2008");

	}

}

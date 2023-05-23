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
	public void TC_SF_001_S23() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2023");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "FAF DU PLESSIS","Batting topper verified");
		log.info("Season 2023 Verified");

	}

	@Test
	public void TC_SF_002_S22() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2022");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "JOS BUTTLER","Batting topper verified");
		log.info("Season 2022 Verified");
	}

	@Test
	public void TC_SF_003_S21() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2021");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "RUTURAJ GAIKWAD","Batting topper verified");
		log.info("Season 2021 Verified");
	}

	@Test
	public void TC_SF_004_S20() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2020");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "KL RAHUL","Batting topper verified");
		log.info("Season 2020 Verified");
	}

	@Test
	public void TC_SF_005_S19() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2019");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "DAVID WARNER","Batting topper verified");
		log.info("Season 2019 Verified");
	}

	@Test
	public void TC_SF_006_S18() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2018");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "KANE WILLIAMSON","Batting topper verified");
		log.info("Season 2018 Verified");
	}

	@Test
	public void TC_SF_007_S17() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2017");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "DAVID WARNER","Batting topper verified");
		log.info("Season 2017 Verified");
	}

	@Test
	public void TC_SF_008_S16() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2016");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "VIRAT KOHLI",	"Batting topper verified");
		log.info("Season 2016 Verified");
	}

	@Test
	public void TC_SF_009_S15() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2015");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "DAVID WARNER","Batting topper verified");
		log.info("Season 2015 Verified");
	}

	@Test
	public void TC_SF_010_S14() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2014");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "ROBIN UTHAPPA","Batting topper verified");
		log.info("Season 2014 Verified");
	}

	@Test
	public void TC_SF_011_S13() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2013");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "MICHAEL HUSSEY","Batting topper verified");
		log.info("Season 2013 Verified");
	}

	@Test
	public void TC_SF_012_S12() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2012");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "CHRIS GAYLE","Batting topper verified");
		log.info("Season 2012 Verified");
	}

	@Test
	public void TC_SF_013_S11() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2011");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "CHRIS GAYLE","Batting topper verified");
		log.info("Season 2011 Verified");
	}

	@Test
	public void TC_SF_014_S10() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2010");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "SACHIN TENDULKAR","Batting topper verified");
		log.info("Season 2010 Verified");
	}

	@Test
	public void TC_SF_015_S09() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2009");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "MATTHEW HAYDEN","Batting topper verified");
		log.info("Season 2009 Verified");
	}

	@Test
	public void TC_SF_016_S08() {
		statPage = new StatPage();
		statPage.seasonDropdownSelection("2008");
		Assert.assertEquals(getTextFromElement(statPage.getBattingTopper()), "SHAUN MARSH","Batting topper verified");
		log.info("Season 2008 Verified");
	}

}

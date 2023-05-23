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
public class StatsFunctionTest extends BaseClass {
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
	public void TC_SFF_003_OrangeCapBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickOrangeCapBtn();
		Assert.assertEquals(statPage.getBattingTopper().getText(), "FAF DU PLESSIS");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Orange Cap filter Verified");
	}

	@Test
	public void TC_SFF_004_MostFoursBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickMostFoursBtn();		
		Assert.assertEquals(statPage.getBattingTopper().getText(), "YASHASVI JAISWAL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Fours filter Verified");
	}

	@Test
	public void TC_SFF_005_MostFoursInningsBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickMostFoursInningsBtn();
		waitForElementClickable(statPage.getMostFoursInningsBtn());
		Assert.assertEquals(statPage.getBattingTopper().getText(), "YASHASVI JAISWAL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Fours innings filter Verified");
	}

	@Test
	public void TC_SFF_006_MostSixesBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickMostSixesBtn();		
		Assert.assertEquals(statPage.getBattingTopper().getText(), "FAF DU PLESSIS");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Sixes filter Verified");
	}

	@Test
	public void TC_SFF_007_MostSixesInningsBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickMostSixesInningsBtn();		
		Assert.assertEquals(statPage.getBattingTopper().getText(), "RASHID KHAN");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Sixes Innings filter Verified");
	}

	@Test
	public void TC_SFF_008_MostFiftiesBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickMostFiftiesBtn();		
		Assert.assertEquals(statPage.getBattingTopper().getText(), "FAF DU PLESSIS");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Fifties filter Verified");
	}

	@Test
	public void TC_SFF_009_MostCenturiesBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickMostCenturiessBtn();		
		Assert.assertEquals(statPage.getBattingTopper().getText(), "SHUBMAN GILL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Centuries filter Verified");
	}

	@Test
	public void TC_SFF_010_FastestFiftiesBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickFastestFiftiesBtn();
		
		Assert.assertEquals(statPage.getBattingTopper().getText(), "YASHASVI JAISWAL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Fastest Fifties filter Verified");
	}

	@Test
	public void TC_SFF_011_FastestCenturiesBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickFastestCenturiesBtn();
		Assert.assertEquals(statPage.getBattingTopper().getText(), "YASHASVI JAISWAL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Fastest Centuries filter Verified");
	}

	@Test
	public void TC_SFF_012_HighestScoresBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickHighestScoresBtn();
		Assert.assertEquals(statPage.getBattingTopper().getText(), "YASHASVI JAISWAL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Highest Scores filter Verified");
		
	}

	@Test
	public void TC_SFF_013_BestBattingSRBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickBestBattingSRBtn();
		Assert.assertEquals(statPage.getBattingTopper().getText(), "RASHID KHAN");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Best Batting Strike Rate filter Verified");
	}
	
	@Test
	public void TC_SFF_014_BestBattingSRInningsBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickBestBattingSRInningsBtn();
		Assert.assertEquals(statPage.getBattingTopper().getText(), "GLENN PHILLIPS");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Best Batting Strike Rate Innings filter Verified");
	}
	
	@Test
	public void TC_SFF_015_BestBattingAverageBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.ClickBestBattingAverageBtn();
		Assert.assertEquals(statPage.getBattingTopper().getText(), "VIVRANT SHARMA");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Best Batting Average filter Verified");
	}
	
	@Test
	public void TC_SFF_016_PurpleCapBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickPurpleCapBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "MOHAMMAD SHAMI");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Purple Cap filter Verified");
	}
	@Test
	public void TC_SFF_017_MostMaidensBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickMostMaidenBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "TRENT BOULT");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Maidens filter Verified");		
	}
	
	@Test
	public void TC_SFF_018_MostDotBallsBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickMostDotBallsBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "MOHAMMAD SHAMI");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Dot Balls filter Verified");
	}
	
	@Test
	public void TC_SFF_019_MostDotBallsInningsBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickMostDotBallsInningsBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "MOHAMMAD SHAMI");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Dot Balls Innings filter Verified");
	}
	
	@Test
	public void TC_SFF_020_MostBestBowlingAverageBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickBestBowlingAverageBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "MARK WOOD");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Best Bowling Average filter Verified");
	}
	
	@Test
	public void TC_SFF_021_MostBestBowlingEconomyBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickBestBowlingEconomyBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "MATTHEW SHORT");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Best Bowling Economy Filter Verified");
	}
	
	@Test
	public void TC_SFF_022_MostBestBowlingEconomyInningsBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickBestBowlingEconomyInningsBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "BHUVNESHWAR KUMAR");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Best Bowling Economy Innings Filter Verified");
	}
	
	@Test
	public void TC_SFF_023_MostBestBowlingStrikeRateBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickBestBowlingStrikeRateBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "MARK WOOD");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Best Bowling Strike Rate Filter Verified");
	}
	
	@Test
	public void TC_SFF_024_MostBestBowlingStrikeRateInningsBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickBestBowlingStrikeRateInningsBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "ANDRE RUSSELL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Best Bowling Strike Rate Innings Filter Verified");
	}
	
	@Test
	public void TC_SFF_025_MostBestBowlingFiguresBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickBestBowlingFiguresBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "MARK WOOD");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Best Bowling Figures Filter Verified");
	}
	
	@Test
	public void TC_SFF_026_MostRunsConcededBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickMostRunsConcededBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "YASH DAYAL");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Most Runs Conceded Filter Verified");
	}
	
	@Test
	public void TC_SFF_027_HatTricksBtnTest() throws InterruptedException {
		statPage = new StatPage();
		statPage.clickHatTricksBtn();
		Assert.assertEquals(statPage.getBowlingTopper().getText(), "RASHID KHAN");
		Assert.assertEquals(statPage.getSeasonDropdown2023().getText(), "SEASON 2023");
		log.info("Hat-Tricks Filter Verified");
	}
}

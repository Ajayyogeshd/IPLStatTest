package com.iplStatTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class StatPage extends BaseClass {
	public StatPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='cookie__accept cookie__accept_btn']")
	private WebElement cookieBtn;

	@FindBy(xpath = "(//div[@class='sm-lb-ply-name ng-binding'])[1]")
	private WebElement battingTopper;

	@FindBy(xpath = "(//div[@class='sm-lb-ply-name ng-binding'])[2]")
	private WebElement bowlingTopper;

	@FindBy(xpath = "//a[@class='np-recordtab__btn statsContentTab awardsStats']")
	private WebElement awardsTab;

	@FindBy(xpath = "//a[@class='np-recordtab__btn statsContentTab allTimeStats']")
	private WebElement recordsTab;

	@FindBy(xpath = "//div[text()='SEASON 2023']")
	private WebElement seasonDropdown2023;

	@FindBy(xpath = "//div[text()='SEASON 2022']")
	private WebElement seasonDropdown2022;

	@FindBy(xpath = "//div[text()='SEASON 2021']")
	private WebElement seasonDropdown2021;

	@FindBy(xpath = "//div[text()='SEASON 2020']")
	private WebElement seasonDropdown2020;

	@FindBy(xpath = "//div[text()='SEASON 2019']")
	private WebElement seasonDropdown2019;

	@FindBy(xpath = "//div[text()='SEASON 2018']")
	private WebElement seasonDropdown2018;

	@FindBy(xpath = "//div[text()='SEASON 2017']")
	private WebElement seasonDropdown2017;

	@FindBy(xpath = "//div[text()='SEASON 2016']")
	private WebElement seasonDropdown2016;

	@FindBy(xpath = "//div[text()='SEASON 2015']")
	private WebElement seasonDropdown2015;

	@FindBy(xpath = "//div[text()='SEASON 2014']")
	private WebElement seasonDropdown2014;

	@FindBy(xpath = "//div[text()='SEASON 2013']")
	private WebElement seasonDropdown2013;

	@FindBy(xpath = "//div[text()='SEASON 2012']")
	private WebElement seasonDropdown2012;

	@FindBy(xpath = "//div[text()='SEASON 2011']")
	private WebElement seasonDropdown2011;

	@FindBy(xpath = "//div[text()='SEASON 2010']")
	private WebElement seasonDropdown2010;

	@FindBy(xpath = "//div[@class='cSBListItems seasonFilterItems ng-binding ng-scope'][text()='SEASON 2009']")
	private WebElement seasonDropdown2009;

	@FindBy(xpath = "//div[@class='cSBListItems seasonFilterItems ng-binding ng-scope'][text()='SEASON 2008']")
	private WebElement seasonDropdown2008;

	@FindBy(xpath = "(//div[@class='cSBDisplay ng-binding'])[2]")
	private WebElement statsFilterBtn;

	@FindBy(xpath = "//span[@class='cSBListFItems batFItem selected']")
	private WebElement battersBtn;

	@FindBy(xpath = "//span[@class='cSBListFItems bowFItem']")
	private WebElement bowlersBtn;
	
	@FindBy(xpath = "//div[text()='Aramco Orange Cap']")
	private WebElement orangeCapBtn;
	
	@FindBy(xpath = "//div[@class='cSBListItems batters ng-binding ng-scope selected'][text()='Most Fours']")
	private WebElement mostFoursBtn;
	
	@FindBy(xpath = "//div[@class='sm-lb-ply-name ng-binding'][text()='Yashasvi Jaiswal']")
	private WebElement mostFoursTopper;
	
	@FindBy(xpath = "//div[text()='Most Fours (Innings)']")
	private WebElement mostFoursInningsBtn;
	
	@FindBy(xpath = "//div[contains(@class,'cSBListItems batters ng-binding ng-scope selected')][text()='Most Sixes']")
	private WebElement mostSixesBtn;
	
	@FindBy(xpath = "//div[text()='Most Sixes (Innings)']")
	private WebElement mostSixesInningsBtn;
	
	@FindBy(xpath = "//div[text()='Most Fifties']")
	private WebElement mostFiftiesBtn;
	
	@FindBy(xpath = "//div[text()='Most Centuries']")
	private WebElement mostCenturiesBtn;
	
	@FindBy(xpath = "//div[text()='Fastest Fifties']")
	private WebElement fastestFiftiesBtn;
	
	@FindBy(xpath = "//div[text()='Fastest Centuries']")
	private WebElement fastestCenturiesBtn;
	
	@FindBy(xpath = "//div[text()='Highest Scores']")
	private WebElement highestScoresBtn;

	@FindBy(xpath = "//div[text()='Best Batting Strike Rate']")
	private WebElement bestBattingSRBtn;
	
	@FindBy(xpath = "//div[text()='Best Batting Strike Rate(I)']")
	private WebElement bestBattingSRInningsBtn;
	
	@FindBy(xpath = "//div[@ng-repeat='list in battingStatsList'][text()='Best Batting Averages']")
	private WebElement bestBattingAverageBtn;
	
	@FindBy(xpath = "//div[text()='Aramco Purple Cap']")
	private WebElement purpleCapBtn;
	
	@FindBy(xpath = "//div[text()='Most Maidens']")
	private WebElement mostMaidensBtn;
	
	@FindBy(xpath = "//div[text()='Most Dot Balls']")
	private WebElement mostDotBallsBtn;
	
	@FindBy(xpath = "//div[text()='Most Dot Balls (Innings)']")
	private WebElement mostDotBallsInningsBtn;
	
	@FindBy(xpath = "//div[contains(@class,'cSBListItems bowlers ng-binding ng-scope selected')][text()='Best Bowling Average']")
	private WebElement bestBowlingAverageBtn;
	
	@FindBy(xpath = "//div[text()='Best Bowling Economy']")
	private WebElement bestBowlingEconomyBtn;
	
	@FindBy(xpath = "//div[text()='Best Bowling Economy (Innings)']")
	private WebElement bestBowlingEconomyInningsBtn;
	
	@FindBy(xpath = "//div[text()='Best Bowling Strike-Rate']")
	private WebElement bestBowlingStrikeRateBtn;
	
	@FindBy(xpath = "//div[text()='Best Bowling Strike-Rate (Innings)']")
	private WebElement bestBowlingStrikeRateInningsBtn;
	
	@FindBy(xpath = "//div[@class='cSBListItems bowlers ng-binding ng-scope selected'][text()='Best Bowling Figures']")
	private WebElement bestBowlingFiguresBtn;
	
	@FindBy(xpath = "//div[text()='Most Runs Conceded (Innings)']")
	private WebElement mostRunsConcededInningsBtn;
	
	@FindBy(xpath = "//div[text()='Hat-tricks']")
	private WebElement hatTricksBtn;
	
	
	
	
	
	
	public WebElement getOrangeCapBtn() {
		return orangeCapBtn;
	}
	
	public WebElement getMostFoursBtn() {
		return mostFoursBtn;
	}

	
	public WebElement getMostFoursTopper() {
		return mostFoursTopper;
	}

	public WebElement getMostFoursInningsBtn() {
		return mostFoursInningsBtn;
	}

	public WebElement getMostSixesBtn() {
		return mostSixesBtn;
	}

	public WebElement getMostSixesInningsBtn() {
		return mostSixesInningsBtn;
	}

	public WebElement getMostFiftiesBtn() {
		return mostFiftiesBtn;
	}

	public WebElement getMostCenturiesBtn() {
		return mostCenturiesBtn;
	}

	public WebElement getFastestFiftiesBtn() {
		return fastestFiftiesBtn;
	}

	public WebElement getFastestCenturiesBtn() {
		return fastestCenturiesBtn;
	}

	public WebElement getHighestScoresBtn() {
		return highestScoresBtn;
	}

	public WebElement getBestBattingSRBtn() {
		return bestBattingSRBtn;
	}

	public WebElement getBestBattingSRInningsBtn() {
		return bestBattingSRInningsBtn;
	}

	public WebElement getBestBattingAverageBtn() {
		return bestBattingAverageBtn;
	}

	public WebElement getPurpleCapBtn() {
		return purpleCapBtn;
	}

	public WebElement getMostMaidensBtn() {
		return mostMaidensBtn;
	}

	public WebElement getMostDotBallsBtn() {
		return mostDotBallsBtn;
	}

	public WebElement getMostDotBallsInningsBtn() {
		return mostDotBallsInningsBtn;
	}

	public WebElement getBestBowlingAverageBtn() {
		return bestBowlingAverageBtn;
	}

	public WebElement getBestBowlingEconomyBtn() {
		return bestBowlingEconomyBtn;
	}

	public WebElement getBestBowlingEconomyInningsBtn() {
		return bestBowlingEconomyInningsBtn;
	}

	public WebElement getBestBowlingStrikeRateBtn() {
		return bestBowlingStrikeRateBtn;
	}

	public WebElement getBestBowlingStrikeRateInningsBtn() {
		return bestBowlingStrikeRateInningsBtn;
	}

	public WebElement getBestBowlingFiguresBtn() {
		return bestBowlingFiguresBtn;
	}

	public WebElement getMostRunsConcededInningsBtn() {
		return mostRunsConcededInningsBtn;
	}

	public WebElement getHatTricksBtn() {
		return hatTricksBtn;
	}

	public WebElement getSeasonDropdown2023() {
		return seasonDropdown2023;
	}

	public WebElement getSeasonDropdown2022() {
		return seasonDropdown2022;
	}

	public WebElement getSeasonDropdown2021() {
		return seasonDropdown2021;
	}

	public WebElement getSeasonDropdown2020() {
		return seasonDropdown2020;
	}

	public WebElement getSeasonDropdown2019() {
		return seasonDropdown2019;
	}

	public WebElement getSeasonDropdown2018() {
		return seasonDropdown2018;
	}

	public WebElement getSeasonDropdown2017() {
		return seasonDropdown2017;
	}

	public WebElement getSeasonDropdown2016() {
		return seasonDropdown2016;
	}

	public WebElement getSeasonDropdown2015() {
		return seasonDropdown2015;
	}

	public WebElement getSeasonDropdown2014() {
		return seasonDropdown2014;
	}

	public WebElement getSeasonDropdown2013() {
		return seasonDropdown2013;
	}

	public WebElement getSeasonDropdown2012() {
		return seasonDropdown2012;
	}

	public WebElement getSeasonDropdown2011() {
		return seasonDropdown2011;
	}

	public WebElement getSeasonDropdown2010() {
		return seasonDropdown2010;
	}

	public WebElement getSeasonDropdown2009() {
		return seasonDropdown2009;
	}

	public WebElement getSeasonDropdown2008() {
		return seasonDropdown2008;
	}

	public WebElement getSeasonDropdown() {
		return seasonDropdown2023;
	}

	public WebElement getCookieBtn() {
		return cookieBtn;
	}

	public WebElement getBattingTopper() {
		return battingTopper;
	}

	public WebElement getAwardsTab() {
		return awardsTab;
	}

	public WebElement getRecordsTab() {
		return recordsTab;
	}
	
	public WebElement getBowlingTopper() {
		return bowlingTopper;
	}

	public WebElement getStatsFilterBtn() {
		return statsFilterBtn;
	}

	public WebElement getBattersBtn() {
		return battersBtn;
	}

	public WebElement getBowlersBtn() {
		return bowlersBtn;
	}


	public void acceptCookie() {
		setImplicitWait();
		clickElement(getCookieBtn());
	}

	public void enterStatPage() {
		acceptCookie();
		}

	public AwardPage clickAwardTab() {
		acceptCookie();
		clickElement(getAwardsTab());
		return new AwardPage();

	}

	public RecordsPage clickRecordTab() {
		acceptCookie();
		clickElement(getRecordsTab());
		return new RecordsPage();
	}

	public void clickBattersBtn() {
		acceptCookie();
		clickElement(getStatsFilterBtn());
		clickElement(getBattersBtn());

	}
	
	public void clickBowlersBtn() {
		acceptCookie();
		clickElement(getStatsFilterBtn());
		clickElement(getBowlersBtn());

	}

	public void seasonDropdownSelection(String text) {
		acceptCookie();
		clickElement(getSeasonDropdown2023());
		switch (text) {
		case "2023":
			waitForElementVisibility(getSeasonDropdown2023());
			clickElementWithJavaScript(getSeasonDropdown2023());
			break;
		case "2022":

			waitForElementVisibility(getSeasonDropdown2022());
			clickElementWithJavaScript(getSeasonDropdown2022());
			break;
		case "2021":
			waitForElementVisibility(getSeasonDropdown2021());
			clickElementWithJavaScript(getSeasonDropdown2021());
			break;

		case "2020":
			waitForElementVisibility(getSeasonDropdown2020());
			clickElementWithJavaScript(getSeasonDropdown2020());
			break;

		case "2019":
			waitForElementVisibility(getSeasonDropdown2019());
			clickElementWithJavaScript(getSeasonDropdown2019());
			break;

		case "2018":
			clickElementWithJavaScript(getSeasonDropdown2018());
			break;

		case "2017":
			clickElementWithJavaScript(getSeasonDropdown2017());
			break;

		case "2016":
			clickElementWithJavaScript(getSeasonDropdown2016());
			break;

		case "2015":
			clickElementWithJavaScript(getSeasonDropdown2015());
			break;

		case "2014":
			clickElementWithJavaScript(getSeasonDropdown2014());
			break;

		case "2013":
			clickElementWithJavaScript(getSeasonDropdown2013());
			break;

		case "2012":
			clickElementWithJavaScript(getSeasonDropdown2012());
			break;

		case "2011":
			clickElementWithJavaScript(getSeasonDropdown2011());
			break;

		case "2010":
			clickElementWithJavaScript(getSeasonDropdown2010());
			break;

		case "2009":
			clickElementWithJavaScript(getSeasonDropdown2009());
			break;

		case "2008":

			clickElementWithJavaScript(getSeasonDropdown2008());
			break;

		default:
			break;
		}

	}
	
	public void ClickOrangeCapBtn() throws InterruptedException {
		clickBattersBtn();
		clickElement(getOrangeCapBtn());
		Thread.sleep(2000);		
	}
	
	public void ClickMostFoursBtn() throws InterruptedException {
		clickBattersBtn();
		waitForElementVisibility(getBattingTopper());
		clickElementWithJavaScript(getMostFoursBtn());
		Thread.sleep(2000);
	}
	
	public void ClickMostFoursInningsBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getMostFoursInningsBtn());
		Thread.sleep(2000);
		
	}
	
	public void ClickMostSixesBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getMostSixesBtn());
		Thread.sleep(2000);
	}
	
	public void ClickMostFiftiesBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getMostFiftiesBtn());
		Thread.sleep(2000);
	}
	
	public void ClickMostSixesInningsBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getMostSixesInningsBtn());
		Thread.sleep(2000);
	}
	
	public void ClickMostCenturiessBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getMostCenturiesBtn());
		Thread.sleep(2000);
	}
	
	public void ClickFastestFiftiesBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getFastestFiftiesBtn());
		Thread.sleep(2000);
	}
	
	public void ClickFastestCenturiesBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getFastestFiftiesBtn());
		Thread.sleep(2000);
	}
	
	public void ClickHighestScoresBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getHighestScoresBtn());
		Thread.sleep(2000);
	}
	
	public void ClickBestBattingSRBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getBestBattingSRBtn());
		Thread.sleep(2000);
	}
	
	public void ClickBestBattingSRInningsBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getBestBattingSRInningsBtn());
		Thread.sleep(2000);
	}
	
	public void ClickBestBattingAverageBtn() throws InterruptedException {
		clickBattersBtn();
		clickElementWithJavaScript(getBestBattingAverageBtn());
		Thread.sleep(2000);	
	}
	
	public void clickPurpleCapBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getPurpleCapBtn());
		Thread.sleep(2000);
	}
	
	public void clickMostMaidenBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getMostMaidensBtn());
		Thread.sleep(2000);
	}
	
	public void clickMostDotBallsBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getMostDotBallsBtn());
		Thread.sleep(2000);
	}
	
	public void clickMostDotBallsInningsBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getMostDotBallsInningsBtn());
		Thread.sleep(2000);
	}
	
	public void clickBestBowlingAverageBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getBestBowlingAverageBtn());
		Thread.sleep(2000);
	}
	
	public void clickBestBowlingEconomyBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getBestBowlingEconomyBtn());
		Thread.sleep(2000);
	}
	
	public void clickBestBowlingEconomyInningsBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getBestBowlingEconomyInningsBtn());
		Thread.sleep(2000);
	}
	
	public void clickBestBowlingStrikeRateBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getBestBowlingStrikeRateBtn());
		Thread.sleep(2000);
	}
	
	public void clickBestBowlingStrikeRateInningsBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getBestBowlingStrikeRateInningsBtn());
		Thread.sleep(2000);
	}
	
	public void clickBestBowlingFiguresBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getBestBowlingFiguresBtn());
		Thread.sleep(2000);
	}
	
	public void clickMostRunsConcededBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getMostRunsConcededInningsBtn());
		Thread.sleep(2000);
	}
	
	public void clickHatTricksBtn() throws InterruptedException {
		clickBowlersBtn();
		clickElementWithJavaScript(getHatTricksBtn());
		Thread.sleep(2000);
	}
	
}

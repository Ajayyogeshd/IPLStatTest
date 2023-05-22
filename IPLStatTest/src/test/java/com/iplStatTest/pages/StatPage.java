package com.iplStatTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;

public class StatPage extends BaseClass {
	public StatPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='cookie__accept cookie__accept_btn']")
	private WebElement cookieBtn;

	@FindBy(xpath = "(//div[@class='sm-lb-ply-name ng-binding'])[1]")
	private WebElement battingTopper;

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

	@FindBy(xpath = "//div[@class='cSBListItems seasonFilterItems ng-binding ng-scope'][normalize-space()='SEASON 2009']")
	private WebElement seasonDropdown2009;

	@FindBy(xpath = "//div[@class='cSBListItems seasonFilterItems ng-binding ng-scope'][normalize-space()='SEASON 2008']")
	private WebElement seasonDropdown2008;

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

	public void acceptCookie() {
		setImplicitWait();
		clickElement(getCookieBtn());
	}

	public void enterStatPage() {
		acceptCookie();
		Assert.assertEquals(getTextFromElement(getBattingTopper()), "FAF DU PLESSIS", "Batting topper verified");
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

	public void seasonDropdownSelection(String text) {
		acceptCookie();
		clickElement(getSeasonDropdown2023());
		switch (text) {
		case "2023":
			waitForElementVisibility(getSeasonDropdown2023());
			clickElementWithJavaScript(getSeasonDropdown2023());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "FAF DU PLESSIS", "Batting topper verified");
			break;
		case "2022":

			waitForElementVisibility(getSeasonDropdown2022());
//			clickElement(getSeasonDropdown2022());
			clickElementWithJavaScript(getSeasonDropdown2022());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "JOS BUTTLER", "Batting topper verified");
			break;
		case "2021":
			waitForElementVisibility(getSeasonDropdown2021());
			clickElementWithJavaScript(getSeasonDropdown2021());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "RUTURAJ GAIKWAD", "Batting topper verified");
			break;

		case "2020":
			waitForElementVisibility(getSeasonDropdown2020());
			clickElementWithJavaScript(getSeasonDropdown2020());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "KL RAHUL", "Batting topper verified");
			break;

		case "2019":
			waitForElementVisibility(getSeasonDropdown2019());
			clickElementWithJavaScript(getSeasonDropdown2019());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "DAVID WARNER", "Batting topper verified");
			break;

		case "2018":
			clickElementWithJavaScript(getSeasonDropdown2018());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "KANE WILLIAMSON", "Batting topper verified");
			break;

		case "2017":
			clickElementWithJavaScript(getSeasonDropdown2017());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "DAVID WARNER", "Batting topper verified");
			break;

		case "2016":
			clickElementWithJavaScript(getSeasonDropdown2016());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "VIRAT KOHLI", "Batting topper verified");
			break;

		case "2015":
			clickElementWithJavaScript(getSeasonDropdown2015());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "DAVID WARNER", "Batting topper verified");
			break;

		case "2014":
			clickElementWithJavaScript(getSeasonDropdown2014());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "ROBIN UTHAPPA", "Batting topper verified");
			break;

		case "2013":
			clickElementWithJavaScript(getSeasonDropdown2013());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "MICHAEL HUSSEY", "Batting topper verified");
			break;

		case "2012":
			clickElementWithJavaScript(getSeasonDropdown2012());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "CHRIS GAYLE", "Batting topper verified");
			break;

		case "2011":
			clickElementWithJavaScript(getSeasonDropdown2011());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "CHRIS GAYLE", "Batting topper verified");
			break;

		case "2010":
			clickElementWithJavaScript(getSeasonDropdown2010());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "SACHIN TENDULKAR", "Batting topper verified");
			break;

		case "2009":
			clickElementWithJavaScript(getSeasonDropdown2009());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "MATTHEW HAYDEN", "Batting topper verified");
			break;

		case "2008":
			
			clickElementWithJavaScript(getSeasonDropdown2008());
			Assert.assertEquals(getTextFromElement(getBattingTopper()), "SHAUN MARSH", "Batting topper verified");
			break;

		default:
			break;
		}

	}

}

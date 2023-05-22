package com.iplStatTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;

public class AwardPage extends BaseClass {
	public AwardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'Awards')]")
	private WebElement awardText;

	public WebElement getAwardText() {
		return awardText;
	}

	public void awardPageVerification() {
		Assert.assertEquals(getTextFromElement(getAwardText()), "AWARDS", "Award Text Verification");
	}
}

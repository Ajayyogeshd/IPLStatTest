package com.iplStatTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;

public class RecordsPage extends BaseClass {
	public RecordsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Records')]")
	private WebElement recordsText;

	public WebElement getRecordsText() {
		return recordsText;
	}
	
	public void recordPageVerification() {
		Assert.assertEquals(getTextFromElement(getRecordsText()), "RECORDS", "Records Text Verification successful");
	}
}

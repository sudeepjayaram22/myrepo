package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//div[contains(text(),'Adrushya ⊙ clikz of unseen') and @class='linkWrap hasCount']")
	WebElement AdrushyaLink;

	
	public void clickLink(WebElement element) {
		element.click();
	}
}

package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class FacebookPage extends TestBase {

	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailPhoneTextBox;
	
}

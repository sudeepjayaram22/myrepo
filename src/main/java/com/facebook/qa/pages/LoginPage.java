package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//input[@name='email']")
	WebElement emailPhoneTextBox;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginButton;
	
	public void login() {
		emailPhoneTextBox.sendKeys("suz.jai90@gmail.com");
		passwordTextBox.sendKeys("Abc@12345");
		loginButton.click();
	}
	
}

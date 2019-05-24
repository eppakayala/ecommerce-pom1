package com.apex.ecommerce.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.core.ApexBasePage;

public class LoginPage extends ApexBasePage {
	@FindBy(xpath = LoginConstant.LOCATOR_XPATH_EMAILID)
	private WebElement emailId;
	@FindBy(xpath = LoginConstant.LOCATOR_XPATH_PASSWORD)
	private WebElement password;
	@FindBy(linkText = LoginConstant.LOCATOR_LINKTEXT_LOGIN_BTN)
	private WebElement singonLink;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSignOnLink(String email,String pwd1) {
		emailId.sendKeys(email);
		password.sendKeys(pwd1);
		singonLink.click();;
	}

}

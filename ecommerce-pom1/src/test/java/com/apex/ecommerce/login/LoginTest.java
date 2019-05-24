package com.apex.ecommerce.login;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;

public class LoginTest extends ApexBaseTest {
	@Test
	public void testWithCorrectData() {
		// create page
		LoginPage loginPage = new LoginPage(driver);
		// perform action
		loginPage.clickSignOnLink("test@gmail.com", "mypassword");
		// assert

	}

	@Test
	public void testWithBlankData() {

	}

	@Test
	public void testWithBlankUser() {

	}

	@Test
	public void testWithLockedUser() {

	}
}

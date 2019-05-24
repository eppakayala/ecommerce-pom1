package com.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexBaseTest {
	public WebDriver driver = null;

	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver(); // open the browser
		driver.manage().window().maximize();
		String url = "http://ecommerce.saipratap.net/customerlogin.php"; // set the Url
		driver.get(url);
	}

	@AfterMethod
	public void cleanUp() {
		driver.close(); // close the browser
	}

}

package com.apex.ecommerce;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo111 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//String parentwindowHandle = driver.getWindowHandle();
	//	System.out.println();
		driver.navigate().to("https://google.com");
		//handle new window 
		// driver.get("https://google.com");
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		System.out.println(tabs.size());
	//	driver.switchTo().window(tabs.get(0));
	//	driver.switchTo().window((mainWindowHandle)
		driver.close();
	}

}

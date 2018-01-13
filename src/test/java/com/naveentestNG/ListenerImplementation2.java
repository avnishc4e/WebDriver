package com.naveentestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListenerImplementation2 {

	@Test
	public void testCase1() {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

	@Test
	public void testCase2() {
		throw new SkipException("Skipping this test");
	}

	@Test
	public void testCase3() {
		Assert.assertTrue(true);
	}

	@Test
	public void testCase4() {
		Assert.assertFalse(true);//This will fail
	}

	@Test(enabled = false)
	public void testCase5() {

	}
}

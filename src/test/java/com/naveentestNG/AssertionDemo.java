package com.naveentestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

	// In this method, If any assertion fails then execution will be aborted.
	@Test
	public void hard_assert_text() {
		String Actualtext = driver.findElement(By.xpath("//a[@id='gb_70']")).getText();
		System.out.println(Actualtext);
		Assert.assertEquals(Actualtext, "Sign in");
		System.out.println("hard assert got passed");
		Assert.assertEquals(Actualtext, "Sign in 123");
		System.out.println("hard assert got failed");
	}

	@Test
	// In this method, Test execution will not abort even If any assertion fail.
	public void soft_assert_text() {
		String Actualtext = driver.findElement(By.xpath("//a[@id='gb_70']")).getText();
		SoftAssert s = new SoftAssert();
		s.assertEquals(Actualtext, "Sign in");
		System.out.println("soft assert got passed");
		s.assertEquals(Actualtext, "Sign in 123");
		System.out.println("soft assert got failed");
		//s.assertAll(); To mark the soft assert method as failed in the results we have to use this statement. 
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

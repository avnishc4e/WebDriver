package com.naveentestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	@Test(priority = 1,groups="chrome")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Proirity 1");
	}

	@Test(priority = 2,groups="chrome")
	public void googleLogoTest() {
		boolean result = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(result);
		System.out.println("Proirity 2");
	}

	@Test(priority = 9,groups="test")
	public void testCase1() {
	
		System.out.println("From testcase One");
	}	
	@Test(priority = 3,groups="test")
	public void testCase2() {
		System.out.println("From testcase Two");
	}	
	@Test(priority = 6,groups="test")
	public void testCase3() {
		System.out.println("From testcase Three");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

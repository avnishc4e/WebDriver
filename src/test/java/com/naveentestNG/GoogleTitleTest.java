package com.naveentestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
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

	@Test()
	public void testCase1() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test()
	public void testCase2() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google123","Title is not matched");//it will print this message if the assertion fails
	}
	
	@Test()
	public void testCase3() {
		boolean result = driver.findElement(By.xpath("//*[@id='hplogo']/a/img")).isDisplayed();
		System.out.println(result);
		Assert.assertTrue(result);//We are expecting true
		Assert.assertEquals(result,true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

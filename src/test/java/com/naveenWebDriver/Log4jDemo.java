package com.naveenWebDriver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Log4jDemo {

	
	Logger log = Logger.getLogger(Log4jDemo.class);
	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		log.info("Launched Chrome Successfully and URL Loaded Succesfully ");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("avnish");
		driver.findElement(By.name("password")).sendKeys("zaq1@WSX");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void testCase2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");

		String title = driver.getTitle();
		System.out.println(title);
		log.info("The Title is: "+title);
		log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		log.warn("Warning Message");
		log.fatal("Fatal Message");
		log.debug("Debug Message");
		log.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
		driver.quit();
	}
	@Test
	public void testCase3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		Boolean b = driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		Assert.assertTrue(b);
		driver.quit();
	}
	
}

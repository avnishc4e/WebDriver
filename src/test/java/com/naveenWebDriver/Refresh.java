package com.naveenWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Refresh {

	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
	}
}
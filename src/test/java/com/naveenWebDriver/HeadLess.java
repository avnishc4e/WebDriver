package com.naveenWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLess {
	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		System.out.println("Title before Login page: " + driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("avnish");
		driver.findElement(By.name("password")).sendKeys("zaq1@WSX");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Title after Login page: " + driver.getTitle());
		Thread.sleep(2000);
		
		
		
	}
}
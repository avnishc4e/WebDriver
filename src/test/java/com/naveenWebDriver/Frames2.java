package com.naveenWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames2 {
	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//div[contains(text(),'TestNG Complete Bootca')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();

	}
}

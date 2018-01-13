package com.interviewQuestionsWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	@Test
	public void testcase1(){
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebDriverWait w = new WebDriverWait(driver,60);
		w.pollingEvery(5, TimeUnit.SECONDS);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//")));
		w.ignoring(NoSuchElementException.class);
		driver.quit();
	}
	
}

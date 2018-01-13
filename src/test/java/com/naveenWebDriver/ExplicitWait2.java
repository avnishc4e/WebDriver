package com.naveenWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait2 {

	WebDriver driver;
	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.msn.com/en-in/");
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.pollingEvery(5, TimeUnit.MILLISECONDS);
		WebElement element = driver.findElement(By.xpath("//span[text()='Salman may launch Manushi']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Salman may launch Manushi']")));
        element.click();
	}
/*
	@Test
	public void testCase2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.msn.com/en-in/?AR=3");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.pollingEvery(5, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.titleContains("MSN"));
		System.err.println("Title is matching");
	}
    */
}
package com.naveenWebDriver;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait1 {
	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement email = wait.ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		email.sendKeys("test");

		driver.quit();
	}
}

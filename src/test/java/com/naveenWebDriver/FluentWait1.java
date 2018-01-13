package com.naveenWebDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWait1 {
	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://landfill.bugzilla.org/bugzilla-4.4-branch/");
		driver.findElement(By.xpath("//a[@id='enter_bug']/span")).click();

		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver);
		f.withTimeout(30, TimeUnit.SECONDS);
		f.pollingEvery(5, TimeUnit.MILLISECONDS);
		f.ignoring(NoSuchElementException.class);

		Function<WebDriver, WebElement> fun = new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver input) {
				System.out.println("Not Found");
				return input.findElement(By.xpath("//input[@id='log_in']"));
			}

		};
        f.until(fun).click();
		System.out.println("Found");
	}
}

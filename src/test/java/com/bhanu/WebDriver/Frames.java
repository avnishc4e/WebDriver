package com.bhanu.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
	}

	@Test
	public void testCase1() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> f = driver.findElements(By.xpath("//iframe"));
		int size = f.size();
		System.out.println(size);
		System.out.println("===================================");
		for (int i = 0; i < size; i++) {
			System.out.println(f.get(i).getAttribute("id"));
			System.out.println(f.get(i).getAttribute("name"));
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			Thread.sleep(1000);
		}
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//div[contains(text(),'TestNG Complete Bootca')]")).click();
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}

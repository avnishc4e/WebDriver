package com.naveenWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		System.out.println("driver 1=" + driver);
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("driver 2=" + driver);
		try {
			driver.findElement(By.xpath("//a[@title='GST-Information']")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("driver 3=" + driver);
		driver.quit();
	}
}

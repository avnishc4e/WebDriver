package com.bhanu.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebTable {
	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("avnish");
		driver.findElement(By.name("password")).sendKeys("zaq1@WSX");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		// Handling the static webTable and printing all it values
		// row is starting from tr[4] and ending at tr[24]
		String xpath1 = "//form[@id='vContactsForm']/table/tbody/tr[";
		String xpath2 = "]/td[2]/a";
		for (int i = 4; i <= 24; i++) {
			System.out.println(driver.findElement(By.xpath(xpath1 + i + xpath2)).getText());
		}
		driver.close();
	}
}

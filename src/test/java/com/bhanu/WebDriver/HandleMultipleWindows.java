package com.bhanu.WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindows {

	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/htdocs/nri_banking/payments/BillPay/BillPay.htm");
		driver.findElement(By.xpath("//img[contains(@title,'money transfer')]")).click();
		// Handling multiple windows
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		System.out.println(itr);
		String parentWindow = itr.next();
		String childWindow = itr.next();
		// Switching the control to the child window
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//div[@class='countryName' and text()='Australia']")).click();
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[contains(text(),'DirectPay')]")).click();
		Thread.sleep(4000);
		driver.close();

	}
}

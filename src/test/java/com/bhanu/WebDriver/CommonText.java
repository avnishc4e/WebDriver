package com.bhanu.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonText {
	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/htdocs/nri_banking/payments/BillPay/BillPay.htm");

		List<WebElement> totalText = driver.findElements(By.xpath("//div[@id='nre_savings_acc']/ul/li"));
		Iterator<WebElement> itr = totalText.iterator();
		ArrayList<String> actualData = new ArrayList<String>();
		while (itr.hasNext()) {
			actualData.add(itr.next().getText());
		}

		ArrayList<String> expectedData = new ArrayList<String>();
		expectedData.add("Features & Benefits");
		expectedData.add("Mobile Phone Bills");
		expectedData.add("Electricity and Telephone Bills");
		expectedData.add("Insurance Premium");
		expectedData.add("How to register for BillPay");
		expectedData.add("FAQs");
		
		System.out.println(actualData);
		System.out.println(expectedData);
		Assert.assertEquals(actualData, expectedData);
		
		driver.close();
	}
}
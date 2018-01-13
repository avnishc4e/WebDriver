package com.bhanu.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpandCollapsed {

	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/htdocs/nri_banking/payments/BillPay/BillPay.htm");
		String beforeClick = driver.findElement(By.xpath("//h3[contains(text(),'ricity and Telepho')]")).getCssValue("background-image");
		System.out.println(beforeClick);
		
		if(beforeClick.contains("bg_collapsed_panel")){
			Assert.assertTrue(true,beforeClick);
		}else{
			Assert.assertTrue(false,beforeClick);
		}

		driver.findElement(By.xpath("//h3[contains(text(),'ricity and Telepho')]")).click();
		String afterClick = driver.findElement(By.xpath("//h3[contains(text(),'ricity and Telepho')]")).getCssValue("background-image");
		System.out.println(afterClick);
		
		if(afterClick.contains("bg_collapsed_panel")){
			Assert.assertTrue(true,afterClick);
		}else{
			Assert.assertTrue(false,afterClick);
		}
		driver.close();
	}
}

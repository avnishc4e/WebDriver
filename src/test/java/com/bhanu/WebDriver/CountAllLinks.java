package com.bhanu.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountAllLinks {

	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> list1 = driver.findElements(By.tagName("a"));
		System.out.println("=========================================================");
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getText());
		}

		List<WebElement> list2 = driver.findElements(By.xpath("//a"));
		System.out.println("=========================================================");
		System.out.println(list2.size());
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).getText());
		}
		driver.close(); 
	}

}

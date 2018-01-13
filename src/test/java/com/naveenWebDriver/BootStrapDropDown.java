package com.naveenWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDropDown {
	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();

		List<WebElement> list1 = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-co')]//li//a//label"));
		System.out.println(list1.size());
		/*
		 * // for selecting only Java from the drop down for (int i = 0; i
		 * <list1.size(); i++) { System.out.println(list1.get(i).getText());
		 * if(list1.get(i).getText().contains("Java")) { list1.get(i).click();
		 * break; } }
		 */
		// for selecting only all elements from the drop down
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getText());
			list1.get(i).click();
			break;
		}
	}

	@Test
	public void testCase2() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.findElement(By.xpath("//div[@id=':i']")).click();

		List<WebElement> list2 = driver
				.findElements(By.xpath("//div[contains(@class,'goog-menu goog-menu-vertical')]//div//div"));
		System.out
				.println("===========================================================================================");
		System.out.println(list2.size());

		for (int j = 0; j < list2.size(); j++) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(list2.get(j).getText());
			if (list2.get(j).getText().contains("Wallis & Futuna")) {
				list2.get(j).click();
			}

		}

	}

}

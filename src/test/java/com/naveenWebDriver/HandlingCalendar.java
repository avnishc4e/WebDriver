package com.naveenWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingCalendar {
	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("avnish");
		driver.findElement(By.name("password")).sendKeys("zaq1@WSX");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");
		String date = "15-December-2000";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
		s1.selectByVisibleText(month);
		Select s2 = new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
		s2.selectByVisibleText(year);

		String xpath1 = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String xpath2 = "]/td[";
		String dayVal = null;
		boolean flag = false;
		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				try {
					dayVal = driver.findElement(By.xpath(xpath1 + i + xpath2 + j + "]")).getText();
					System.out.println(dayVal);
				} catch (NoSuchElementException e) {
					System.out.println("Please enter a Valid Date from the Below List :");
					System.out.println(dayVal);
					flag = false;
					break;
				}
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(xpath1 + i + xpath2 + j + "]")).click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		for (int i = 0; i < dateArr.length; i++) {
			System.out.println(dateArr[i]);
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

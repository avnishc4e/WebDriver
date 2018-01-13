package com.bhanu.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement ele1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("15");

		WebElement ele2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(ele2);
		s2.selectByIndex(11);

		WebElement ele3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(ele3);
		s3.selectByVisibleText("1990");
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		WebElement selected = s3.getFirstSelectedOption();
		System.out.println(selected.getText());

		List<WebElement> l = s3.getOptions();
		int size = l.size();

		for (int i = 0; i < size; i++) {
			System.out.println(l.get(i).getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}
}

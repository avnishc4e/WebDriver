package com.naveentestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonExample {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://letskodeit.teachable.com/p/practice");
	}

	@Test()
	public void testCase1() throws InterruptedException {

		WebElement radio = driver.findElement(By.xpath("//*[@id='benzradio']"));
		Boolean b1 = radio.isDisplayed();
		Boolean b2 = radio.isEnabled();
		Boolean b3 = radio.isSelected();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		radio.click();
		Boolean b4 = radio.isSelected();
		System.out.println(b4);
				

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

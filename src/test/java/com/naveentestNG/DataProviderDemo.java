package com.naveentestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
    
	
	@DataProvider
	public void getData(){
		
	}
	@Test()
	public void testCase1(String userName, String password) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();

	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}

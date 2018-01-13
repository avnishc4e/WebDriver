package com.naveenWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HandlingWindows {

	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		
		Set <String>  window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		
		String parentWindow = itr.next();
		System.out.println("Parent Window Id : "+parentWindow);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		String childWindow = itr.next();
		System.out.println("Child Window Is : "+childWindow);
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();//It will close the current window on which the focus is present
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}

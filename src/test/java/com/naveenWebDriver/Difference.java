package com.naveenWebDriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Difference {

	@Test
	public void testCase1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/register/");
		
		Boolean b1 = driver.findElement(By.xpath("//button[@id='submitButton']")).isDisplayed();
		System.out.println(b1);
		
		Boolean b2 = driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
		System.out.println(b2);
		
		driver.findElement(By.name("agreeTerms")).click();//It is enabled now.
		Boolean b3 = driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
		System.out.println(b3);
		
		
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);
		
		
		driver.findElement(By.name("agreeTerms")).click();//The check box is not selected now.
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);
		driver.close();
	}
}

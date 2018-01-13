package com.naveenWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDynamicWebtable {

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
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		String xpath1 ="//*[@id='vContactsForm']/table/tbody/tr[";
		String xpath2="]/td[2]";
		String xpath3="]/td[1]/input";
	
		
		for(int i=4;i<=10;i++){
			String text = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
		    System.out.println(text);
		    if(text.contains("abc5 zxc5")){
		    	driver.findElement(By.xpath(xpath1+i+xpath3)).click();
		    	Thread.sleep(3000);
		    }
		}
		//driver.close();
        //Method 2
		driver.findElement(By.xpath("//a[contains(text(),'abc3 zxc3')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}

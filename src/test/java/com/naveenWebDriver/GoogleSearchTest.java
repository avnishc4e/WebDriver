package com.naveenWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("John");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("Total No of elements Shown:==="+ele.size());
		
	
	     for(int i=0;i<ele.size();i++){
	    	 System.out.println("The Elements are: "+ele.get(i).getText());
	    	 
	    	 if(ele.get(i).getText().contains("johny johny")){
	    		 ele.get(i).click();
	    		 break; 
	    	 }
	     }
    	 
    
	     driver.close();
		
	}
}

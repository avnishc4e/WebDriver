package com.interviewQuestionsWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElements {


	@Test
	public void testcase1(){
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		List<WebElement> ele = driver.findElements(By.xpath("//select[@name='FromLB']/option"));
		int size = ele.size();
		System.out.println(size);
		System.out.println("================================");
		for(int i=0;i<=size;i++){
	      String elements = ele.get(i).getText();
	      String id = ele.get(i).getAttribute("id");
	       
	      System.out.println(id+"=" +elements);
		}
		driver.quit();
	}
}


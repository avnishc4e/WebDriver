package com.naveenWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		//name
		driver.findElement(By.name("firstname")).sendKeys("John");
		//id
		driver.findElement(By.id("lastname")).sendKeys("Abraham");
		//xpath
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Mumbai");
		//link text
		driver.findElement(By.linkText("Sign in")).click();
		driver.navigate().back();
		//partial link text
		driver.findElement(By.partialLinkText("Want to register")).click();
		driver.navigate().back();
		//
		driver.findElement(By.cssSelector("#address2")).sendKeys("Maharastra");
		
		//click on all links present on the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links available in webpage:"+links.size());
	  
		
		for(int i=0;i<links.size();i++){
	    	 System.out.println(links.get(i).getText());
	    	 System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
	     }
		//driver.quit();
		
	}

}

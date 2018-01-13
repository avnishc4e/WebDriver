package com.naveenWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement((driver.findElement(By.id("highlight-addons")))).build().perform();
		Thread.sleep(2000);
        driver.findElement(By.linkText("Hot Meals")).click();
        driver.navigate().back();
	
        WebElement target1 = driver.findElement(By.className("spiceFare"));
        WebElement target2 = driver.findElement(By.linkText("Shareholding Pattern"));
        action.contextClick(target1).build().perform();
        Thread.sleep(4000);
        action.doubleClick(target2).build().perform();
              
	}
}

package com.naveenWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.excel.utility.Helper;

public class JavaScript {

	@Test
	public void testCase1() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("avnish");;
		driver.findElement(By.name("password")).sendKeys("zaq1@WSX");
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		//Helper.highLightElement(driver, btn);
		//Thread.sleep(4000);
		//Helper.drawBorder(driver, btn);
		//Helper.generateAlert(driver, "Error Found");
		//Thread.sleep(2000);
		
		//Helper.clickElementByJS(driver, btn);
		//Thread.sleep(2000);
		//Helper.refreshBrowser(driver);
		System.out.println(Helper.getTitleByJS(driver));
		System.out.println(Helper.getInnerTextByJS(driver)); 
		Thread.sleep(2000);
		WebElement scrollUpto= driver.findElement(By.xpath("//*[@id='details']/div/div/div[1]/div/div[6]/h3"));
		Helper.scrollIntoView(driver, scrollUpto);
		//Helper.scrollPageDown(driver);
		Thread.sleep(4000);
		/*File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"E:\\workspace\\InterviewQuestionsWebDriver\\src\\test\\java\\com\\naveenWebDriver\\Element.png"));*/
		driver.close();
	}
}

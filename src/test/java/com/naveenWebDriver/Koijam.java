package com.naveenWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Koijam {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.newsonair.com/Regional_NSD_Search_MP3.aspx");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDate1']"));

		String date1 = "12/04/2017";
		String date2 = "12/07/2017";
		WebElement dropDown = driver
				.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_dropdown_Bulletin']"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("English");
		selectFromDatePicker(driver, ele1, date1);
		selectFromDatePicker(driver, ele2, date2);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_submit']")).click();
		// for downloading and clicking

		// *[@id='ctl00_ContentPlaceHolder1_GridView1_ctl03_imageButtonDelete']

		String xpath1 = "//*[@id='ctl00_ContentPlaceHolder1_GridView1_ctl0";
		String xpath2 = "_imageButtonDelete']";
    
		//the table grid is starting from 2nd position and going till 10 th  position
		for (int i = 2; i <= 10; i++) {
			driver.findElement(By.xpath(xpath1 + i + xpath2)).click();
			Thread.sleep(20000); 
			if(driver.getCurrentUrl().contains("http://www.newsonair.com/Regional_NSD_Search_MP3.aspx")){
				
			}else{
				driver.navigate().back();
			}
		}
	}

	public static void selectFromDatePicker(WebDriver driver, WebElement element, String dateValue) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);
	}
}

package com.naveenWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DatePicker {

	@Test
	public void testCase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		String date ="Mon, Jan 29 2018";
		
		selectFromDatePicker(driver, ele, date);
		System.out.println("+++++++++++++++++++++++");
	}

	public static void selectFromDatePicker(WebDriver driver,WebElement element,String dateValue) {
	
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	}

}

package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class WriteToExcel {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");		
		//Parameterization is always done with the help of for loop.
		Xls_Reader reader = new Xls_Reader("E:\\workspace\\InterviewQuestionsWebDriver\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
	    reader.addColumn("RegTestData", "Status");
		int rowCount = reader.getRowCount("RegTestData");   
	    
	    for (int rowNum=2;rowNum<=rowCount;rowNum++){
	    	String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
	    	String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
			String address1 = reader.getCellData("RegTestData", "address1", rowNum);
			String address2 = reader.getCellData("RegTestData", "address2", rowNum);
			String city = reader.getCellData("RegTestData", "city",rowNum);
			String state = reader.getCellData("RegTestData", "state", rowNum);
			String zipcode = reader.getCellData("RegTestData", "zipcode",rowNum);
			String emailaddress = reader.getCellData("RegTestData", "emailaddress",rowNum);

			driver.findElement(By.xpath("//*[@id='firstname']")).clear();
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastname);
			driver.findElement(By.xpath("//*[@id='address1']")).clear();
			driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);
			driver.findElement(By.xpath("//*[@id='address2']")).clear();
			driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(address2);
			driver.findElement(By.xpath("//*[@id='city']")).clear();
			driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);
		
			WebElement w = driver.findElement(By.xpath("//*[@id='state']"));
			Select select = new Select(w);
			select.selectByVisibleText(state);
			
			driver.findElement(By.xpath("//*[@id='zip']")).clear();
			driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipcode);
			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailaddress);
			driver.findElement(By.xpath("//*[@id='retype_email']")).clear();
			driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailaddress);

			
		    reader.setCellData("RegTestData", "Status", rowNum, "Pass");//write data into the excel sheet.
			//driver.close();
	    }
	
	}
}

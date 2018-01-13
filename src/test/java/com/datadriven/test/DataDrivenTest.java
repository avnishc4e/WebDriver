package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("E:\\workspace\\InterviewQuestionsWebDriver\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
		String firstname = reader.getCellData("RegTestData", "firstname", 2);
		String lastname = reader.getCellData("RegTestData", "lastname", 2);
		String address1 = reader.getCellData("RegTestData", "address1", 2);
		String address2 = reader.getCellData("RegTestData", "address2", 2);
		String city = reader.getCellData("RegTestData", "city", 2);
		String state = reader.getCellData("RegTestData", "state", 2);
		String zipcode = reader.getCellData("RegTestData", "zipcode", 2);
		String emailaddress = reader.getCellData("RegTestData", "emailaddress", 2);
		
		System.out.println(firstname);		
		System.out.println(lastname);
		System.out.println(address1);
		System.out.println(address2);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zipcode);
		System.out.println(emailaddress);
		/*WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");*/
		
		
		
	}
}

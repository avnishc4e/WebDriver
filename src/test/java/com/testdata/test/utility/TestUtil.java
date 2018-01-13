package com.testdata.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		Xls_Reader reader = new Xls_Reader(
				"E:\\workspace\\InterviewQuestionsWebDriver\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
		int rowCount = reader.getRowCount("TestData1");
        System.out.println(rowCount);
		for (int rowNum = 2; rowNum <= 5; rowNum++) {
			String firstname = reader.getCellData("TestData1", "firstname", rowNum);
			String lastname = reader.getCellData("TestData1", "lastname", rowNum);
			String address1 = reader.getCellData("TestData1", "address1", rowNum);
			String address2 = reader.getCellData("TestData1", "address2", rowNum);
			String city = reader.getCellData("TestData1", "city", rowNum);
			String state = reader.getCellData("TestData1", "state", rowNum);
			String zipcode = reader.getCellData("TestData1", "zipcode", rowNum);
			String emailaddress = reader.getCellData("TestData1", "emailaddress", rowNum);

			Object ob[] = { firstname, lastname, address1, address2, city, state, zipcode, emailaddress };
			myData.add(ob);
		}
		return myData;
	}
}

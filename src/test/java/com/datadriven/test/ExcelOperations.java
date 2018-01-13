package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("E:\\workspace\\InterviewQuestionsWebDriver\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
        //if(!reader.isSheetExist("TestData2 "))
		//reader.addSheet("TestData3");
        
        
        int colCount = reader.getColumnCount("TestData");
        System.out.println(colCount);
        
        int colCount1 = reader.getColumnCount("RegTestData");
        System.out.println(colCount1);
      
        int c1 = reader.getCellRowNum("RegTestData", "address2", "Brajrajnagar9");
        System.out.println(c1);
       
	}

}

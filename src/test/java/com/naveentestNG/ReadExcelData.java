package com.naveentestNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("E:\\workspace\\InterviewQuestionsWebDriver\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet =  wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		int totalRow = sheet.getLastRowNum() + 1;
		// count number of active columns in row
		int totalColumn = sheet.getRow(0).getLastCellNum();
		// Create array of rows and column
		System.out.println(totalRow);
		System.out.println(totalColumn);
		String value = cell.getStringCellValue();
		System.out.println("Value in the excel sheet :" +value );
		
	}

}

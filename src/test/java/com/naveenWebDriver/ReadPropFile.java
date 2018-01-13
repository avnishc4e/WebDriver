package com.naveenWebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\workspace\\InterviewQuestionsWebDriver\\src\\test\\java\\com\\naveenWebDriver\\config.properties");
        prop.load(fis);
        
        System.out.println(prop.getProperty("firstname"));
        System.out.println(prop.getProperty("lastname"));
        System.out.println(prop.getProperty("address"));
        System.out.println(prop.getProperty("city"));
        System.out.println(prop.getProperty("state"));
	}

}

package com.naveentestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	// test case 1
	   @Test
	   public void testCase1() {
	      System.out.println("in test case 1");
	   }

	   // test case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in test case 2");
	   }

	   // test case 3
	   @Test
	   public void testCase3() {
	      System.out.println("in test case 3");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
		  System.out.println("=====================");
	      System.out.println("in beforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	      //System.out.println("=====================");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");
	   }
	   @BeforeGroups 
	   public void beforeGroup() {
	      System.out.println("in beforeGroup");
	   }

	   @AfterGroups
	   public void afterGroup() {
	      System.out.println("in afterGroup");
	   }
}

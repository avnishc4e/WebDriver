package com.database.oracle;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DbTest {

	@Test
	public void selectDbData() throws ClassNotFoundException, SQLException {
		String query = "Select * from emp";
		DataBase db = new DataBase();
		ResultSet data = db.getData(query);
		while (data.next()) {
			System.out.println(data.getString(1) + "-" + data.getString(2) + "-" + data.getString(3) + "-"
					+ data.getString(4) + "-" + data.getString(5) + "-" + data.getString(6) + "-" + data.getString(7)
					+ "-" + data.getString(8));
		}
	}

	//@Test
	public void updateDbData() throws ClassNotFoundException, SQLException {
		String query = "update emp set sal=1600 where ename='TURNER'";
		DataBase db = new DataBase();
		db.updateData(query);
	}

	//@Test
	public void insertDbData() throws ClassNotFoundException, SQLException {
		String query = "INSERT INTO EMP Values('8000','JOHN','TESTER','7839','15-12-90','4500','200','30')";
		DataBase db = new DataBase();
		db.insertData(query);
	}
}

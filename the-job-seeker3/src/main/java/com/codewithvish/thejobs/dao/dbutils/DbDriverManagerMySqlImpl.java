package com.codewithvish.thejobs.dao.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDriverManagerMySqlImpl implements DbDriverManager {

	public Connection getConnection() throws ClassNotFoundException, SQLException {	

		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/?user=root/thejobs";
		String userName = "root";
		String password = "Fimq123$";
		
		
		return DriverManager.getConnection(url, userName, password);
	}

}
package com.codewithvish.thejobs.dao;

import com.codewithvish.thejobs.dao.dbutils.DbDriverManager;
import com.codewithvish.thejobs.dao.dbutils.DbDriverManagerMySqlImpl;

public class DbDriverManagerFactory {

	public DbDriverManager getDbDriver(String databaseType) {
		
		if(databaseType.equals("MySQL")) {
			return new DbDriverManagerMySqlImpl();
		}
		else {
			return null;
		}
	}

}




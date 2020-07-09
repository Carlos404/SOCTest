package soc.consulta.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("org.sqlite.JDBC");
			return DriverManager.getConnection("jdbc:sqlite:C:\\sqlite3\\socdb.db");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

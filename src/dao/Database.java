package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static String DB_URL = "jdbc:sqlite:analytics_hub.db";
	private static Database instance = null;
	
	private Database() {}
	
	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		Connection connection = null;
		connection = DriverManager.getConnection(DB_URL);
		return connection;
	}

}

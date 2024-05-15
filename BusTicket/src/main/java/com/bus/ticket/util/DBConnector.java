package com.bus.ticket.util;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {

	private static DBConnector instance;
	private Properties properties;

	private DBConnector() {
		properties = new Properties();
		try (FileInputStream io = new FileInputStream(new File("config.properties"))) {
			properties.load(io);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static DBConnector getInstance() {
		return instance = instance != null ? instance : new DBConnector();
	}

	public Connection getConnection() {

		try {
			return DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.usr"),
					properties.getProperty("db.pass"));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection error.");
		}
		return null;

	}
}

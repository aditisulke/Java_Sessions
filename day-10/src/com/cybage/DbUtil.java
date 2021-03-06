package com.cybage;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbUtil {
	
	private static String className = "com.mysql.jdbc.Driver";
	private static String dbUrl;
	private static String dbUser;
	private static String dbPassword;
	
	
	static {		//if want to execute something during class loading
		try {
			FileReader reader = new FileReader("d:\\db.properties");
			Properties props = new Properties();
			
			props.load(reader);
			dbUrl = props.getProperty("dbUrl");
			dbUser = props.getProperty("dbUser");
			dbPassword = props.getProperty("dbPassword");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	////without connection pool
//	public static Connection getCon() throws Exception{
//		Class.forName(className);	
//		Connection con 
//		= DriverManager.getConnection(dbUrl, dbUser, dbPassword);
//		return con; 
//	}
	
	////without connection pool
	public static Connection getCon() throws Exception{
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl(dbUrl);
		ds.setUsername(dbUser);
		ds.setPassword(dbPassword);
		ds.setMinIdle(5);
		ds.setMaxIdle(10);
		ds.setMaxOpenPreparedStatements(100);		
		
		return ds.getConnection(); 
	}
}

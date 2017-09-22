package com.bdgolka.tutorial.servletfilter.conn;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
	
	public static Connection getConnection(){
		
		//Create a Connection to database
		Connection conn = null;
		
		//....
		return conn;
	}
	
	public static void closeQuiently (Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollbackQuietly(Connection conn){
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

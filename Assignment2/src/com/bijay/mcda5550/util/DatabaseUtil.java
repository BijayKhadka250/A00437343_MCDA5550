package com.bijay.mcda5550.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
	private static final String url="jdbc:mysql://localhost:3306/transaction?useSSL=false";
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String username="root";
	private static final String password="nepal9860";
	
	//----------------------------------------------------------------------------------------
	public static Connection getConnection(){ // for establishing connection
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		catch (SQLException e) {
			System.out.println("Error Establishing Connection!");
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return con;
		}
	
	//---------------------------------------------------------------------------------------------------
	
	public static void closePreparedStatement(PreparedStatement ps){// for closing the prepared statements
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//-------------------------------------------------------------------------------------------------------
	public static void closeConnection(Connection con){ // for  closing the open connection 
		if(con!=null){
			try {
			
				con.close();
				
				//System.out.println("closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	//----------------------------------------------------------------------------------------
	
	

}

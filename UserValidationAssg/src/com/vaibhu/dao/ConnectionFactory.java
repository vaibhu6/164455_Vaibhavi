package com.vaibhu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection connection;
	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","orcl11g");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(){
		try{
			connection.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println(ConnectionFactory.getConnection());
	}
}

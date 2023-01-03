package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jack {

	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaexam","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into listque(que,A,B,C,D,ans) values('?','?','?','?','?','?'");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
	}

}

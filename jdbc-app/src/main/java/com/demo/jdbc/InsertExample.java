package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			// get the connection
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");

			PreparedStatement pst=conn.prepareStatement("insert into employee(empno,name,address,salary) values(?,?,?,?)");
			pst.setInt(1, 106);
			pst.setString(2, "Rakesh");
			pst.setString(3, "bangalore");
			pst.setDouble(4, 76000);
			
			int count=pst.executeUpdate();
			
			System.out.println("Rows updated : "+count);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found..");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

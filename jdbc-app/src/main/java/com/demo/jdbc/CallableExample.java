package com.demo.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableExample {

	/*
	 * DELIMITER //
	 * 
	 * CREATE OR REPLACE PROCEDURE simpleproc (OUT param1 INT) BEGIN SELECT
	 * COUNT(*) INTO param1 FROM employee; END; //
	 * 
	 * DELIMITER ;
	 * 
	 * call simpleproc(@data); //store the output in a session variable
	 * 
	 * select @data as count;
	 */
	public static void main(String[] args) {
		Connection conn = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");
			/*
			String procedure="DELIMITER //\r\n"
					+ "\r\n"
					+ "CREATE OR REPLACE PROCEDURE myprocedure (OUT param1 INT)\r\n"
					+ " BEGIN\r\n"
					+ "  SELECT COUNT(*) INTO param1 FROM employee;\r\n"
					+ " END;\r\n"
					+ "//\r\n"
					+ "\r\n"
					+ "DELIMITER ;";
			Statement st = conn.createStatement();
			st.execute(procedure);
			*/

			CallableStatement cst = conn.prepareCall("{call simpleproc(?)}");
			cst.registerOutParameter(1, java.sql.Types.INTEGER);

			cst.execute();

			System.out.println("No of row in Employee Table = " + cst.getInt(1));

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

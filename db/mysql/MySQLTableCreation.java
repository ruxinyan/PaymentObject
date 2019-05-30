package db.mysql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.*;

import helper.CreatePaymentObject;

import java.text.*;

public class MySQLTableCreation {

	public static void main(String[] args) {
		try {
			// Step 1, Create connection
			Connection conn = null;
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(MySQLDBUtil.URL);
			
			if (conn == null) {
				return;
			}
			Statement stmt = conn.createStatement();
			// Step 2, Check if there is old table.
			String sql = "DROP TABLE IF EXISTS items";
			stmt.executeUpdate(sql);
			
			//Step 3, create table
						
			sql = "CREATE TABLE items " + "(paymentNumber VARCHAR(255) NOT NULL, " + " amount int(10)," + "date VARCHAR(255) NOT NULL,"
					+ " PRIMARY KEY ( paymentNumber ))";
			stmt.executeUpdate(sql);

			
			// Step 4: insert data
						
//			CreatePaymentObject helper = new CreatePaymentObject();
//			sql = "INSERT INTO items " + "VALUES (" + helper.getPaymentNumber() + " ," + helper.getAmount() + "," + helper.getDate() + ")";
//
//						System.out.println("Executing query:\n" + sql);
//						stmt.executeUpdate(sql);			
//			System.out.println("Import is done successfully.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
// TODO Auto-generated method stub

	}

}

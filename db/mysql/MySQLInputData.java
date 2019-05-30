package db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import helper.CreatePaymentObject;

public class MySQLInputData {

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
						
			// Step 4: insert data
						// Create a fake user
			CreatePaymentObject helper = new CreatePaymentObject();
			int i = 0;
			String  sql = null;
			Set<Integer> set = new HashSet<>();
			while (i < 1000) {
				int number = helper.getPaymentNumber();
				if (set.add(number)) {

				
					sql = "INSERT INTO items " + "VALUES (" + number + " ," + helper.getAmount() + "," + helper.getDate() + ")";

								System.out.println("Executing query:\n" + sql);
								stmt.executeUpdate(sql);			
								System.out.println("Import is done successfully.");
								i++;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}// TODO Auto-generated method stub

	}

}

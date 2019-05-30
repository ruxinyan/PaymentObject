package db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import entity.PaymentObject;
import helper.CreatePaymentObject;

public class MySQLOutputData {

	public PaymentObject[] getObject(int length) {
		PaymentObject[] array = new PaymentObject[length]; 
		try {
				// Step 1, Create connection
				Connection conn = null;
			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conn = DriverManager.getConnection(MySQLDBUtil.URL);
				if (conn == null) {
					return null;
				}
		
				Statement stmt = conn.createStatement();
				String query = "SELECT * FROM items";
				ResultSet rs = stmt.executeQuery(query);
				int i = 0;
				while (rs.next() && i < length) {
					int paymentNumber = rs.getInt("paymentNumber");
					int amount = rs.getInt("amount");
					String date = rs.getString("date");
					PaymentObject one = new PaymentObject(paymentNumber, amount, date);
					array[i] = one;
					i++;
				}
			
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				return array;

	}

}

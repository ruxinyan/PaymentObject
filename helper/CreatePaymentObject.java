package helper;

import java.util.*;

public class CreatePaymentObject {
		
	public int getPaymentNumber() {
		return (int) (1000000 * Math.random() + 1);
	}
	
	public int getAmount() {
		return (int) (1000 * Math.random() + 1);
	}
	
	public String getDate() {
		String day = null;
		String month = null;
		int ranDay = (int ) (28 * Math.random() + 1);
		if (ranDay < 10) {
			 day = "0" + ranDay;
		} else {
			 day = "" + ranDay;
		}
		int ranMonth =  (int) (12 * Math.random() + 1);
		if (ranMonth < 10) {
			month = "0" + ranMonth;
		} else {
			month = "" + ranMonth;
 		}
		int year = (int) (20 * Math.random() + 2001);
		return  year + month + day;
	}
	
	
	
}

package entity;

public class PaymentObject {
	public int paymentNumber;
	public int amount;
	public String date;
	
	public PaymentObject(int paymentNumber, int amount, String date) {
		this.paymentNumber = paymentNumber;
		this.amount = amount;
		this.date = date;
	}
	
	public int compareTo(PaymentObject other) {
		Integer first = Integer.parseInt(this.date);
		Integer second = Integer.parseInt(other.date);
		if (first.equals(second)) {
			return (this.amount - other.amount);
		}
		return (first - second);
	}

	
	public void setPaymentNumber(int input) {
		this.paymentNumber = input;
	}
	
	public void setAmount (int input) {
		this.amount = input;
	}
	
	public void setDate (String input) {
		this.date = input;
	}

	
}

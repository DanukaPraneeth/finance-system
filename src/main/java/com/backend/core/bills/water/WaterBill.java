package com.backend.core.bills.water;

public class WaterBill {
	private String date;
	private String amount;
	private String comment;
	
	public WaterBill() {

	}

	public WaterBill(String date, String amount, String comment) {
		super();
		this.date = date;
		this.amount = amount;
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}

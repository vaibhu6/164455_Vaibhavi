package com.lambda.two;

public class Order {
	public int orderNo;
	String status;
	
	public Order(int order, String status) {
		super();
		this.orderNo = order;
		this.status = status;
	}

	public int getOrder() {
		return orderNo;
	}

	public void setOrder(int order) {
		this.orderNo = order;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", status=" + status + "]";
	}
	
	
}

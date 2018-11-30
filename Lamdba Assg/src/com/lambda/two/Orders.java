package com.lambda.two;

import java.util.ArrayList;

public class Orders {
	public static void main(String[] args) {
		ArrayList<Order> list = new ArrayList<Order>();
				list.add(new Order(10000,"ACCEPTED"));
				list.add(new Order(9000,"COMPLETED"));
				list.add(new Order(12000,"REJECTED"));
				list.add(new Order(1000,"REJECTED"));
				list.add(new Order(15000,"COMPLETED"));
			
	
		list.forEach((i)->{
			if(i.getOrder() >= 10000 && (i.getStatus() == "ACCEPTED" || i.getStatus() == "COMPLETED")){
				System.out.println(i);
			}
		});
	}
}
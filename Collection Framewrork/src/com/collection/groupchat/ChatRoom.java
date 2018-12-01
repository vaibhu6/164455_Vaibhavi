package com.collection.groupchat;

import java.util.ArrayList;
import java.util.Scanner;

public class ChatRoom {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
	
		ArrayList<String> list = new ArrayList<String>();
	
		System.out.println("Do you want to add a user\n 1.Add a user 2.Exit");
		int choose=scanner.nextInt();
	
		switch(choose){
		
			case 1:	list.add(scanner.nextLine());
					break;
			default:System.out.println("Wrong choice");
					break;
		}
	}
	private void addUser() {
		

	}
}

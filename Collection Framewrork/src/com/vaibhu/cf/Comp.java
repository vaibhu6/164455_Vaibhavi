package com.vaibhu.cf;

import java.util.Comparator;



public class Comp implements Comparator<SavingAccount> {

	@Override
	public int compare(SavingAccount sa1,SavingAccount sa2) {
		// TODO Auto-generated method stub
		if(sa1.getAccountNo() >sa2.getAccountNo() ){
			return 1;
		}
		else 
		
		return -1;
	}

}
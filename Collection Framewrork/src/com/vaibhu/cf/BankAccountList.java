package com.vaibhu.cf;

import java.util.TreeSet;



public class BankAccountList {
	
	
public static void main(String[] args) {

	TreeSet<SavingAccount> sa=new  TreeSet<SavingAccount> (new Comp());
	sa.add(new SavingAccount(1,"Neha", 1000));
	sa.add(new SavingAccount(12,"Jagruti", 1040));
	sa.add(new SavingAccount(23,"Kinnari", 1430));

System.out.println(sa);

}
}
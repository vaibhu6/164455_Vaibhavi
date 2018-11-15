package com.vaibhu.bank; //collection of logical class

public class BankAccount 
{
	//static variable--> not dependent on object creation.
	private static int autoAccountNo; //so that the account no is updated each time.
	
	//instance variable / class variable cannot be accessed without the creation of an object.
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	//init block--> reduces the no of times to initialise the same line.
	{
		// init block is invoked each time a onstructor is called. if there are multiple constructor , init will invoke multiple no of times.  
		accountNo=++autoAccountNo;
		System.out.println("init block");
	}
	//constructor overloading--> more than 1 constuctor with same name, but different parameters offering variety. 
	public BankAccount()	
	{
		// default constructor --> intialises instance variable which is automatically called when a object is created.
		// used in scenario when bulk acc creation is done
		accountHolderName="Unknown";
		accountBalance=0;
		System.out.println("Default constructor");
	}
	
	public BankAccount(String accountHolderName, double accountBalance)
	{
		//parameterize constructor
		// used in scenario when info is demanded before creation of object.
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		System.out.println("Parameterise constructor");
	}
	// use of both default and parameterise constructor is called constructor overloading.
	
	public void setAccountHolderName(String accountHolderName) 
	{
		//setter method(conceptual method)--> modifies / reintialises  the member variable. 
		this.accountHolderName = accountHolderName;
	}
	
	public double getAccountBalance() 
	{
		return accountBalance; 
	}
	
	public String getAccountHolderName() 
	
	{
		return accountHolderName;
	}
	
	public int getAccountNo() 
	{
		return accountNo;
	}
	
	public void withdraw(double amount)
	{
		// service method
		this.accountBalance-=amount;
	}
	
	public void deposit(double amount)
	{
		// service method
		this.accountBalance+=amount;
	}
	
	public static void main(String[] args)
	{
		BankAccount acc = new BankAccount();
		BankAccount acc2 = new BankAccount("Vaibhavi",5000);
	}
	
}

// Access specifiers

// within a class
// Private YES Public YES Default YES
// Outside a class but within a same package
// Private NO Public YES Default YES
// Outside class as well as outside package
// Private NO Public YES Default NO

//Default or package level modifier--> when any access specifier is not specified.

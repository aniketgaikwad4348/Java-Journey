package oop;

public class BankAccount {
	
	private int accountNumber;
	private String name;
	private double balance = 1000;
	
	public void setAccNo(int newAccNo)
	{
		if(newAccNo > 100)
		{
			this.accountNumber = newAccNo;
		}
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public void setBal(double deposit)
	{
		if(deposit > 500)
		{
			this.balance += deposit;
		}
	}
	
	public int getAccNo() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBal() {
		return balance;
	}

}

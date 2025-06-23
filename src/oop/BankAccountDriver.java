package oop;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		b.setAccNo(23047852);
		b.setName("Aniket Gaikwad");
		b.setBal(620);
		System.out.println("Account Number: " +b.getAccNo());
		System.out.println("Account Holder Name : " +b.getName());
		System.out.println("Total Balance : " +b.getBal());

	}

}

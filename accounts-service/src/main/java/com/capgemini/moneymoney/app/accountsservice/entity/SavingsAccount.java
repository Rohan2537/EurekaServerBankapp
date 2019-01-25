package com.capgemini.moneymoney.app.accountsservice.entity;


public class SavingsAccount extends Accounts {
	
	private boolean salary;

	

	public SavingsAccount() {
	}

	public SavingsAccount(Integer accountNumber, String accountHolderName, Double currentBalance, boolean salary) {
		super(accountNumber, accountHolderName, currentBalance);
		this.salary = salary;
	}

	public SavingsAccount(Integer accountNumber, String accountHolderName, boolean salary) {
		super(accountNumber, accountHolderName);
		this.salary = salary;
	}

	public boolean isSalary() {
		return salary;
	}

	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SavingsAccount [salary=" + salary + ", toString()=" + super.toString() + "]";
	}
}

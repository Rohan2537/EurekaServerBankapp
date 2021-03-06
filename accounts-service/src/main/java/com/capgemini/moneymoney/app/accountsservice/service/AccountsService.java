package com.capgemini.moneymoney.app.accountsservice.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.moneymoney.app.accountsservice.entity.Accounts;
import com.capgemini.moneymoney.app.accountsservice.entity.CurrentAccount;
import com.capgemini.moneymoney.app.accountsservice.entity.SavingsAccount;

public interface AccountsService {

	List<Accounts> getallAccounts();

	Optional<Accounts> getAccountById(int accountNumber);

	void updateSavingsAccount(SavingsAccount accounts);

	void updateCurrentAccount(CurrentAccount accounts);

	void updateBalance(Accounts accounts);

	/*
	 * void createsavingsAccount(SavingsAccount savingsAccount);
	 */
}
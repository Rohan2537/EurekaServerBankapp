package com.capgemini.moneymoney.app.accountsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.moneymoney.app.accountsservice.entity.Accounts;

@Repository
public interface AccountsRepository extends MongoRepository<Accounts, Integer>{
}

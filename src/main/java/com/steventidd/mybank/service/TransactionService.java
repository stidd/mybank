package com.steventidd.mybank.service;

import com.steventidd.mybank.model.Transaction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.time.ZonedDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class TransactionService {

    private final String slogan;

    private List<Transaction> transactions = new CopyOnWriteArrayList<>();

    public TransactionService(@Value("${bank.slogan}") String slogan) {
        this.slogan = slogan;
    }

    public List<Transaction> findAll() {
        return transactions;
    }

    public Transaction create(Integer amount, String reference) {
        ZonedDateTime timestamp = ZonedDateTime.now();
        Transaction transaction = new Transaction(amount, timestamp, reference, slogan);
        transactions.add(transaction);
        return transaction;
    }
}

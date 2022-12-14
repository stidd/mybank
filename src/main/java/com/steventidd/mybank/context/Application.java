package com.steventidd.mybank.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.steventidd.mybank.service.TransactionService;

public class Application {

    public static final TransactionService transactionservice = new TransactionService();

    public static final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
}

package com.steventidd.mybank.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.steventidd.mybank.ApplicationLauncher;
import com.steventidd.mybank.service.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
@PropertySource("classpath:/application.properties")
public class MyBankApplicationConfiguration {

//    @Bean
//    public TransactionService transactionService() {
//        return new TransactionService();
//    }
//
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().registerModule(new JavaTimeModule());
    }


}

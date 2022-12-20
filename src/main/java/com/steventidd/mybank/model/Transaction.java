package com.steventidd.mybank.model;


import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

import java.time.ZonedDateTime;



public class Transaction {

    private String id;
    private Integer amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mmZ")
    private ZonedDateTime timestamp;
    private String reference;

    private String slogan;


    public Transaction() {
    }

    public Transaction(Integer amount, ZonedDateTime timestamp, String reference, String slogan) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.reference = reference;
        this.timestamp = timestamp;
        this.slogan = slogan;

    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }


    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
